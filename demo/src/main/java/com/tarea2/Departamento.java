package com.tarea2;
/** Departamento que contiene empleados
 * @author Benjamin Molina
 * @author Nícholas García
 */

import java.util.ArrayList;

public class Departamento implements Invitable {
    private String nombre;
    private ArrayList<Empleados> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<Empleados>();
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
        String toString = "Departamento [nombre=" + nombre;
        toString += "}, listaInvitados= [{";

        for (int i = 0; i < listaEmpleados.size(); i++) {
            toString += listaEmpleados.get(i).toString();

        }

        toString += "}]";
        
        return toString;
    }

    public int obtenerCantidadEmpleados() {
        return listaEmpleados.size();

    }

    public void añadirEmpleado(Empleados e) {
        listaEmpleados.add(e);

    }

    @Override
    public void invitar(Reunion r) {
        for (int i = 0; i < this.obtenerCantidadEmpleados(); i++) {
            listaEmpleados.get(i).invitar(r);
            
        }
    }

}
