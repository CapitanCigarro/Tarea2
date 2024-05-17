package com.tarea2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadosTest {
    Empleados e1 = new Empleados("1","Cabrera","Luis","example@mail.com");

    @Test
    void getApellidos() {
        assertEquals("Cabrera", e1.getApellidos());
    }

    @Test
    void getCorreo() {
        assertEquals("example@mail.com", e1.getCorreo());
    }

    @Test
    void getId() {
        assertEquals("1", e1.getId());
    }

    @Test
    void getNombre() {
        assertEquals("Luis", e1.getNombre());
    }

    @Test
    void setId() {
        e1.setId("3");
        assertEquals("3", e1.getId());
    }

    @Test
    void setApellidos() {
        e1.setApellidos("Gomez");
        assertEquals("Gomez", e1.getApellidos());
    }

    @Test
    void setNombre() {
        e1.setNombre("Javier");
        assertEquals("Javier", e1.getNombre());
    }

    @Test
    void setCorreo() {
        e1.setCorreo("ejemplo@correo.com");
        assertEquals("ejemplo@correo.com", e1.getCorreo());
    }
}
