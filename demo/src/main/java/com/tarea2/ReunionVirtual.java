package com.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio,
            Instant horaFin, String enlace, TipoReunion tipoReunion) {
            super(fecha, horaPrevista, duracionPrevista, tipoReunion);
            this.enlace = enlace;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "ReunionPresencial = [" + super.toString() +", sala=" + enlace.toString() + "]";
    }

}