package com.example.demo.DAO;

import com.example.demo.Entidades.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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
}
