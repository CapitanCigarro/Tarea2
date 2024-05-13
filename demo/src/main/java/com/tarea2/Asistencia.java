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

    public Empleados obtener(int i) {
        return listaAsistencia.get(i);

    }

    @Override
    public String toString() {
        String toString = "Asistencia [listaAsistencia=";

                for (int i = 0; i < listaAsistencia.size(); i++) {
                    toString += listaAsistencia.get(i).toString();

                }
        toString += "]";

        return toString;
    }

    

}