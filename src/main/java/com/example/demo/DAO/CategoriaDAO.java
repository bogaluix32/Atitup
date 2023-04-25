package com.example.demo.DAO;

import com.example.demo.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Categoria> listarCategoria() {
        String sql = "SELECT idCategoria, nombreCategoria, codigoCategoria, descripcionCategoria FROM tbl_Categoria";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Categoria categoria = new Categoria();
            categoria.setIdCategoria(rs.getInt("idCategoria"));
            categoria.setNombreCategoria(rs.getString("nombreCategoria"));
            categoria.setCodigoCategoria(rs.getString("codigoCategoria"));
            categoria.setDescripcionCategoria(rs.getString("descripcionCategoria"));
            return categoria;
        });
    }

    public void RegistrarCategoria(Categoria categoria) {
        jdbcTemplate.update("INSERT INTO tbl_categoria (nombreCategoria, codigoCategoria, descripcionCategoria) VALUES (?, ?, ?)", categoria.getNombreCategoria(), categoria.getCodigoCategoria(), categoria.getDescripcionCategoria());
    }
}
