package com.example.demo.Modelo;

import com.example.demo.DAO.CursoDAO;
import com.example.demo.InterfacesModelo.ICursoModelo;
import com.example.demo.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoModelo implements ICursoModelo {
    @Autowired
    private CursoDAO data;

    @Override
    public void RegistrarCurso(com.example.demo.Entidades.Curso curso, Categoria categoria) {
        data.RegistrarCurso(curso, categoria);
    }
}
