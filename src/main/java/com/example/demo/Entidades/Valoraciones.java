package com.example.demo.Entidades;

public class Valoraciones {

    private int idValoracion;

    private int valoracionRespuesta;

    private int ValoracionEjemplo;

    private String comentario;

    public Valoraciones(){

    }

    public int getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(int idValoracion) {
        this.idValoracion = idValoracion;
    }

    public int getValoracionRespuesta() {
        return valoracionRespuesta;
    }

    public void setValoracionRespuesta(int valoracionRespuesta) {
        this.valoracionRespuesta = valoracionRespuesta;
    }

    public int getValoracionEjemplo() {
        return ValoracionEjemplo;
    }

    public void setValoracionEjemplo(int valoracionEjemplo) {
        ValoracionEjemplo = valoracionEjemplo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
