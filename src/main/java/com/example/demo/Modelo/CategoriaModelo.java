package com.example.demo.Modelo;

import com.example.demo.DAO.CategoriaDAO;
import com.example.demo.Entidades.Categoria;
import com.example.demo.InterfacesModelo.ICategoriaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Service
public class CategoriaModelo implements ICategoriaModelo {

    @Autowired
    private CategoriaDAO data;
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> listarCategoria() {
        return data.listarCategoria();
    }

    @Override
    public void RegistrarCategoria(Categoria categoria) {
        data.RegistrarCategoria(categoria);
    }

    @Override
    public String generarCodigoCategoria() {
        String codigo = "C-";
        Random rand = new Random();
        int num = rand.nextInt(1000); //Genera un número aleatorio entre 0 y 999
        codigo += String.format("%03d", num); //Formatea el número para que tenga 3 dígitos
        return codigo;
    }
}
