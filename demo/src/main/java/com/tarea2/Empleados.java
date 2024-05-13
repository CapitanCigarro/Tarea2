package com.tarea2;

import java.time.*;

public class Empleados implements Invitable{
    private String id, apellidos, nombre, correo;

    /**
     * 
     * @param id String Id del empleado
     * @param apellidos String Apellido del empleado
     * @param nombre String Nombre del empleado
     * @param correo String Correo del empleado
     */

    public Empleados(String id, String apellidos, String nombre, String correo) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;

    }

    public String getApellidos() {
        return apellidos;
    }
    
    public String getCorreo() {
        return correo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @param r Reunion a la que se invita empleado
     */

    @Override
    public void invitar(Reunion r) { //temp
        r.agregarInvitado(this);

    }

    public void asistir (Reunion r, Instant hora) {
        if(r.getHoraInicio().compareTo(hora) > 0) {
            r.agregarAsistencia(this);

        } else {
            r.agregarAsistencia(this);
            r.agregarRetraso(this);

        }

    }

    @Override
    public String toString() {
        return "Empleados [id=" + id + ", apellidos=" + apellidos + ", nombre=" + nombre + ", correo=" + correo + "]";
    }
    
}
