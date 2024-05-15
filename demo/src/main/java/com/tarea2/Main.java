package com.tarea2;

public class Main {
    public static void main(String[] args) {
        Empleados a = new Empleados("1", "null", "null", "null"), b = new Empleados("2", "null", "null", "null");
        Empleados c = new Empleados("null","null", "null", "null");
        Departamento dep = new Departamento("dep");
        
        ReunionPresencial reunion = new ReunionPresencial(null, null, null, null, null, null);
        dep.añadirEmpleado(a);
        dep.añadirEmpleado(b);
        dep.invitar(reunion);
        c.invitar(reunion);

        a.asistir(reunion, null);

        System.out.println();
    }
}