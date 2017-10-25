package com.example.jorge.galeriacuadros;

import java.io.Serializable;

/**
 * Created by Jorge on 24/10/2017.
 */

public class Cuadro implements Serializable{

    private String titulo;
    private String autor;
    private String fecha;
    private String estilo;
    private int imagen;

    public Cuadro(String titulo, String autor, String fecha, String estilo, int imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.estilo = estilo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
