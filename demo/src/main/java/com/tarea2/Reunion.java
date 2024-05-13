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
    private Asistencia listaAsistencia;
    private Retraso listaRetraso;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        listaAsistencia = new Asistencia();
        listaRetraso = new Retraso();
        listaInvitados = new ArrayList<>();
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

    public void iniciar() {


    }

    public void finalizar() {


    }

    @Override
    public String toString() {
        String toString = "Reunion [fecha=" + fecha.toString() + ", horaPrevista=" + horaPrevista.toString() + ", duracionPrevista=" + duracionPrevista.toString()
                + ", horaInicio=" + horaInicio.toString() + ", horaFin=" + horaFin.toString()
                + ", listaRetraso={";
                for (int i = 0; i < listaRetraso.cantidad(); i++) {
                    toString += listaRetraso.obtener(i).toString();
                }

                toString +="}, listaAsistencias= {";

                for (int i = 0; i < listaAsistencia.cantidad(); i++) {
                    toString += listaAsistencia.obtener(i).toString();

                }

                toString += "}, listaInvitados= {";

                for (int i = 0; i < listaInvitados.size(); i++) {
                    toString += listaInvitados.get(i).toString();

                }

                toString += "}]";
        // TODO finish this 

        return toString;

    }


    
}
