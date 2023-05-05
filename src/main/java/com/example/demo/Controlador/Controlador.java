package com.example.demo.Controlador;
import com.example.demo.DAO.ValoracionDAO;
import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Curso;
import com.example.demo.Entidades.Item;
import com.example.demo.Entidades.Valoraciones;
import com.example.demo.InterfacesModelo.IItemModelo;
import com.example.demo.Modelo.CategoriaModelo;
import com.example.demo.Modelo.CursoModelo;
import com.example.demo.Modelo.ItemModelo;
import com.example.demo.Modelo.ValoracionesModelo;
import com.example.demo.Terceros.AnalisisSentimientos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @Autowired
    private ValoracionesModelo valoracionesModelo;
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

    @GetMapping("/ConsultarItem")
    public String MostrarVistaConsultarItem(Model model) {
        //model.addAttribute("item", new Item());
        List<Categoria> listCategorias = categoriaModelo.listarCategoria();
        model.addAttribute("listCategorias", listCategorias);
        return "consultarItem";
    }
    @GetMapping("/analisisSentimientos")
    public String MostrarVistaAnalisisSentimientos(Model model) {
        List<Categoria> listCategorias = categoriaModelo.listarCategoria();
        model.addAttribute("listCategorias", listCategorias);
        return "analsisSentimientos";
    }
    @GetMapping("/consultarTop")
    public String MostrarVistaConsultarTop() {
        return "ConsultarTOPX";
    }
    @GetMapping("/generarPDF")
    public String MostrarVistaGenerarPDF() {
        return "genrarPDF";
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

    @GetMapping("/obtenerPreguntas/{idCategoria}")
    public List<Item> obtenerPreguntas(@RequestParam("idCategoria") int idCategoria) {
        List<Item> preguntas = itemModelo.listarItems(idCategoria);
        return preguntas;
    }

    @GetMapping("/analizarSentimientos")
    public ModelAndView realizaAnalisisSentimientos(){
        //List<Valoraciones> valoraciones = valoracionesModelo.listarValoraciones();
        //Valoraciones val = valoraciones.get(0);
        //String comentario = AnalisisSentimientos.realizarAnalisisSentimientos(val.getComentario());
        String comentario = "La respuesta y el ejemplo son acordes al tema, ayudan mucho para aprender, estoy muy contento";
        //String respuesta = AnalisisSentimientos.realizarAnalisisSentimientos(comentario);
        ModelAndView mav = new ModelAndView("mostrarSentimiento");
        mav.addObject("respuesta", comentario);
        return mav;
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
