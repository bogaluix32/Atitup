package com.example.demo.DAO;

import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CursoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void RegistrarCurso(Curso curso, Categoria categoria) {
        jdbcTemplate.update("{call SP_AsociarCurso(?, ?)}", categoria.getNombreCategoria(), curso.getIdCurso());
    }
}
