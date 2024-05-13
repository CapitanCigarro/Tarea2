package com.tarea2;

public class Retraso extends Asistencia {
    public Retraso() {
        super();

    }

    @Override
    public String toString() {
        String toString = "Retraso [";
        for (int i = 0; i < super.cantidad(); i++) {
            toString += super.obtener(i).toString();
            
        }

        toString += "]";

        return toString;
    }

    
    
}
