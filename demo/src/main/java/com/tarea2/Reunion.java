package com.tarea2;

import java.time.*;
import java.util.Date;
import java.util.ArrayList;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio, horaFin;
    private ArrayList<Empleados> listaInvitados;
    public ArrayList<Empleados> listaAusencias;
    private Asistencia listaAsistencia;
    private Retraso listaRetraso;
    private Invitacion invitacion;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        invitacion = new Invitacion(horaPrevista);
        listaAsistencia = new Asistencia();
        listaRetraso = new Retraso();
        listaAusencias = new ArrayList<Empleados>();
        listaInvitados = new ArrayList<Empleados>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Instant getHoraPrevista() {
        return horaPrevista;
    }

    public void setHoraPrevista(Instant horaPrevista) {
        this.horaPrevista = horaPrevista;
    }

    public Duration getDuracionPrevista() {
        return duracionPrevista;
    }

    public void setDuracionPrevista(Duration duracionPrevista) {
        this.duracionPrevista = duracionPrevista;
    }

    public Instant getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Instant horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Instant getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Instant horaFin) {
        this.horaFin = horaFin;
    }

    public Asistencia obtenerAsistencias() {
        return listaAsistencia;

    }

    public ArrayList<Empleados> obtenerAusencias() {
        return listaAusencias;

    }

    public Retraso obtenerRetraso() {
        return listaRetraso;

    }

    public ArrayList<Empleados> obtenerInvitados() {
        return listaInvitados;

    }

    public int obtenerTotalAsisencias () {
        return listaAsistencia.cantidad();

    }

    public float obtenerPorcentajeAsistencias () {
        return listaAsistencia.cantidad() / listaInvitados.size();

    }

    public float calcularTiempoReal() {
        float tiempoReal;
        tiempoReal = horaInicio.compareTo(horaFin);
        // TODO test this
        return tiempoReal;
    }

    public void agregarInvitado(Empleados invitado){
        listaInvitados.add(invitado);
    }

    public void iniciar(Instant hora) {
        this.setHoraInicio(hora);
        for (int i = 0; i < listaInvitados.size(); i++) {
            boolean ver = true;
            for (int j = 0; j < listaAsistencia.cantidad(); j++) {
                if (listaInvitados.get(i) == listaAsistencia.obtener(j)) {
                    ver = false;
                    break;

                }

                if (ver) {
                    listaAusencias.add(listaInvitados.get(i));

                }

            }

        }

    }

    public void finalizar(Instant horaFin) {
        if (horaInicio != null) {
            this.setHoraFin(horaFin);

        } else {
            System.out.println("Reunion no iniciada");

        } 
        
    }

    public void agregarAsistencia(Empleados empleado) {
        listaAsistencia.añadirEmpleado(empleado);

    }

    public void agregarRetraso(Empleados empleado) {
        listaRetraso.añadirEmpleado(empleado);

    }

    @Override
    public String toString() {
        String toString = "Reunion [fecha=" + fecha.toString() + ", horaPrevista=" + horaPrevista.toString() + ", duracionPrevista=" + duracionPrevista.toString()
                + ", horaInicio=" + horaInicio.toString() + ", horaFin=" + horaFin.toString()
                + listaRetraso.toString() + listaAsistencia.toString();

                toString += "}, listaInvitados= [{";

                for (int i = 0; i < listaInvitados.size(); i++) {
                    toString += listaInvitados.get(i).toString();

                }

                toString += "}]";

        return toString;

    }


    
}
