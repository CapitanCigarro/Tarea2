package com.tarea2;

import java.util.ArrayList;

public class Departamento implements Invitable {
    private String nombre;
    private ArrayList<Empleados> listaEmpleados;

    public Departamento(String nombre, ArrayList<Empleados> listaEmpleados) {
        this.nombre = nombre;
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }    

    @Override
    public String toString() {
        return "Departamento [nombre=" + nombre + "]";
    }

    public int obtenerCantidadEmpleados() {
        return listaEmpleados.size();

    }

    @Override
    public void invitar(Reunion r) {
        for (int i = 0; i < this.obtenerCantidadEmpleados(); i++) {
            listaEmpleados.get(i).invitar(r);
            
        }
    }

}
