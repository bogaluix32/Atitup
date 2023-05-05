package com.example.demo.InterfacesModelo;

import com.example.demo.Entidades.Categoria;
import com.example.demo.Entidades.Item;
import com.example.demo.Terceros.ChatGPT;

import java.util.List;

public interface IItemModelo {


    public boolean RegistrarItem (Item item);

    public String consultarChatGPT(String message, int opcion);

    public String realizarAnalisisSentimientos(String comentario);

    public List<Item> listarItems(int idCategoria);
}
