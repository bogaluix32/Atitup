package com.example.demo.Controlador;
import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Curso;
import com.example.demo.Entidades.Item;
import com.example.demo.Modelo.CategoriaModelo;
import com.example.demo.Modelo.CursoModelo;
import com.example.demo.Modelo.ItemModelo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Controller
@RequestMapping("/index")
public class Controlador {

    @Autowired
    private CategoriaModelo categoriaModelo;
    @Autowired
    private CursoModelo cursoModelo;

    @Autowired
    private ItemModelo itemModelo;
    ArrayList<String> cursosSeleccionados = new ArrayList<String>();


    @GetMapping("/RegistrarCategoria")
    public String MostrarVistaRegistrarCategoria(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "RegistrarCategoria";
    }

    @GetMapping("/RegistrarItem")
    public String MostrarVistaRegistrarItem(Model model) {
        model.addAttribute("item", new Item());
        List<Categoria> categorias = categoriaModelo.listarCategoria();
        model.addAttribute("categorias", categorias);
        return "RegistrarItem";
    }

    @GetMapping("/Regresar")
    public String MostrarVistaPrincipal() {
        return "index";
    }

    @PostMapping("/GuardarRegistroCategoria")
    public String registrarCategoria (Categoria categoria, @RequestParam(value="cboCodigoCurso", required=false) String[] checkboxCursos) {
        String codigoCategoria = categoriaModelo.generarCodigoCategoria();
        categoria.setCodigoCategoria(codigoCategoria);
        categoriaModelo.RegistrarCategoria(categoria);
        guardarCursos(checkboxCursos);
        asociarCursos(categoria);
        return "index";
    }

    @PostMapping("/GuardarRegistroItem")
    public String registrarItem (Item item) {

        if(item.getFuenteRespuesta().equals("ChatGPT")){
            item.setRespuesta(preguntarChatGPT(item.getPregunta(), 1));
        }
        if(item.getFuenteEjemplo().equals("ChatGPT")){
            item.setEjemplo(preguntarChatGPT(item.getPregunta(), 2));
        }
        System.out.print(item.getPregunta() + " "+ item.getRespuesta() + " " + item.getEjemplo());
        itemModelo.RegistrarItem(item);
        return "index";
    }

    //---Auxiliares---
    private void guardarCursos(String[] checkboxCursos ){
        if(checkboxCursos!=null) {
            for(String curso : checkboxCursos) {
                cursosSeleccionados.add(curso);
            }
        }
    }

    private void asociarCursos(Categoria categoria){
        for(int i = 0; i < cursosSeleccionados.size(); i++){
            Curso curso = new Curso();
            curso.setIdCurso(Integer.parseInt(cursosSeleccionados.get(i)));
            cursoModelo.RegistrarCurso(curso,categoria);
        }
    }

    //@PostMapping("/ObtenerRespuestaChatGPT")
    //@ResponseBody
    public String preguntarChatGPT(String pregunta, int opcion){
        String respuestaChatGPT = itemModelo.consultarChatGPT(pregunta, opcion);
        //JSONObject json = new JSONObject();
        //json.put("respuesta", respuestaChatGPT);
        return respuestaChatGPT;
    }
}
