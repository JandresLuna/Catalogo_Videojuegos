package com.example.proyecto_adaptador.clases;

public class Videojuego {

    private String portada, nombre, descripcion;
    private int año;


    public Videojuego(String portada, String nombre, int año, String descripcion) {
        this.portada = portada;
        this.nombre = nombre;
        this.año = año;
        this.descripcion = descripcion;

    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
