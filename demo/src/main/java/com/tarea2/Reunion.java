package com.tarea2;

import java.time.*;
import java.util.Date;
import java.util.ArrayList;

public abstract class Reunion {
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Instant horaInicio, horaFin;
    private ArrayList<Empleados> listaAsistencias, listaAusencias, listaRetrasos;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio, Instant horaFin) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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

    public ArrayList<Empleados> obtenerAsistencias() {
        // TODO this
        return listaAsistencias;

    }

    public ArrayList<Empleados> obtenerAusencias() {
        // TODO this

        return listaAusencias;

    }

    public ArrayList<Empleados> obtenerRetrasos () {
        return listaRetrasos;

    }

    public int obtenerTotalAsisencias () {
        return listaAsistencias.size();

    }

    public float obtenerPorcentajeAsistencias () {
        return listaAsistencias.size() / (listaAsistencias.size() + listaAusencias.size());

    }

    public float calcularTiempoReal() {
        // TODO this

    }

    public void iniciar() {


    }

    public void finalizar() {
        

    }


    
}
