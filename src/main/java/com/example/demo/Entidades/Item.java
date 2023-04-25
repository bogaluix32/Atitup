package com.example.demo.Entidades;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItem;

    private int idCategoria;

    private String pregunta;

    private String respuesta;

    private String ejemplo;

    private String fuenteRespuesta;

    private String fuenteEjemplo;

    public Item(){

    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }

    public String getFuenteRespuesta() {
        return fuenteRespuesta;
    }

    public void setFuenteRespuesta(String fuenteRespuesta) {
        this.fuenteRespuesta = fuenteRespuesta;
    }

    public String getFuenteEjemplo() {
        return fuenteEjemplo;
    }

    public void setFuenteEjemplo(String fuenteEjemplo) {
        this.fuenteEjemplo = fuenteEjemplo;
    }
}
