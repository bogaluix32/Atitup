package com.example.demo.DAO;

import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean RegistrarItem(Item item){

        try{
            jdbcTemplate.update("{call SP_RegistrarItem(?, ?, ?, ?, ?, ?)}",
                    item.getIdCategoria(), item.getPregunta(), item.getRespuesta(), item.getEjemplo(),
                    item.getFuenteRespuesta(), item.getFuenteEjemplo());
            return true;
        }
        catch (Exception ex){
            return false;
        }

    }

    @Transactional(readOnly = true)
    public List<Item> listarItems(int idCategoria) {
        String sql = "SELECT i.idItem, i.pregunta, i.respuesta, i.ejemplo FROM tbl_item i INNER JOIN tbl_itemasociadocategoria ic ON i.idItem = ic.idItem WHERE ic.idCategoria = ?";
        return jdbcTemplate.query(sql, new Object[]{idCategoria}, (rs, rowNum) -> {
            Item item = new Item();
            item.setIdItem(rs.getInt("idItem"));
            item.setPregunta(rs.getString("pregunta"));
            item.setRespuesta(rs.getString("respuesta"));
            item.setEjemplo(rs.getString("ejemplo"));
            return item;
        });
    }
}
