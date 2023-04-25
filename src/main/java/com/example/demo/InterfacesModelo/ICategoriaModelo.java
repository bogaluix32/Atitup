package com.example.demo.InterfacesModelo;


import com.example.demo.Entidades.Categoria;

import java.util.List;

public interface ICategoriaModelo {

    public List<Categoria> listarCategoria();
    public void RegistrarCategoria (Categoria categoria);
    public String generarCodigoCategoria();
}
