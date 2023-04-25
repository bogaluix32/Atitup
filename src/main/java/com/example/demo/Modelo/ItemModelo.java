package com.example.demo.Modelo;

import com.example.demo.DAO.ItemDAO;
import com.example.demo.InterfacesModelo.IItemModelo;
import com.example.demo.Entidades.Item;
import com.example.demo.Terceros.ChatGPT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemModelo implements IItemModelo {
    @Autowired
    private ItemDAO data;

    @Override
    public boolean RegistrarItem(Item item) {return data.RegistrarItem(item);}

    @Override
    public String consultarChatGPT(String message, int opcion) {
        String responseMessage = ChatGPT.obtenerRespuesta(message, opcion);
        return responseMessage;
    }
}
