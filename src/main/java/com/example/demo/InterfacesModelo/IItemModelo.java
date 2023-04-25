package com.example.demo.InterfacesModelo;

import com.example.demo.Entidades.Item;
import com.example.demo.Terceros.ChatGPT;

public interface IItemModelo {

    public boolean RegistrarItem (Item item);

    public String consultarChatGPT(String message, int opcion);
}
