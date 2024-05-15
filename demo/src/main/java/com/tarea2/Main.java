package com.tarea2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empleados a = new Empleados("1", "null", "null", "null"), b = new Empleados("2", "null", "null", "null");
        Empleados c = new Empleados("null","null", "null", "null");
        ArrayList<Empleados> lE = new ArrayList<Empleados>();
        lE.add(a);
        lE.add(b);
        Departamento dep = new Departamento("dep", lE);
        
        ReunionPresencial reunion = new ReunionPresencial(null, null, null, null, null, null);

        dep.invitar(reunion);

        System.out.println();
    }
}