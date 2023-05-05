package com.example.demo.Modelo;

import com.example.demo.DAO.ValoracionDAO;
import com.example.demo.Entidades.Valoraciones;
import com.example.demo.InterfacesModelo.IValoracionModelo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ValoracionesModelo implements IValoracionModelo {

    private ValoracionDAO data;
    @Override
    @Transactional(readOnly = true)
    public List<Valoraciones> listarValoraciones() {
        return data.listarValoraciones();
    }
}
