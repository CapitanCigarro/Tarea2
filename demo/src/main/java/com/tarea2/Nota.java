package com.tarea2;

public class Nota {
    private String contenido;

    /**
     * @param contenido String Contenido de la nota
     */

    public Nota(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nota [contenido=" + contenido + "]";
    }

    

}
