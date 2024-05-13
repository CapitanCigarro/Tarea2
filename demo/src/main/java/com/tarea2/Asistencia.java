package com.tarea2;

import java.util.ArrayList;

public class Asistencia{
    private ArrayList<Empleados> listaAsistencia;

    public Asistencia() {
        listaAsistencia = new ArrayList<Empleados>();

    }

    public void añadirEmpleado(Empleados empleado) {
        listaAsistencia.add(empleado);

    }

    public int cantidad() {
        return listaAsistencia.size();

    }

}