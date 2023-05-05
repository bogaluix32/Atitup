package com.example.demo.DAO;

import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Valoraciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ValoracionDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Valoraciones> listarValoraciones() {
        String sql = "SELECT idValoracion, valoracionRespuesta, valoracionEjemplo, comentario FROM tbl_valoraciones";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Valoraciones valoracion = new Valoraciones();
            valoracion.setIdValoracion(rs.getInt("idValoracion"));
            valoracion.setValoracionRespuesta(rs.getInt("valoracionRespuesta"));
            valoracion.setValoracionEjemplo(rs.getInt("valoracionEjemplo"));
            valoracion.setComentario(rs.getString("comentario"));
            return valoracion;
        });
    }
}
