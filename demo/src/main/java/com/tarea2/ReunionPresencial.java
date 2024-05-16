package com.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista,TipoReunion tipoReunion, Instant horaInicio,
            Instant horaFin, String sala) {
        super(fecha, horaPrevista, duracionPrevista, tipoReunion);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "ReunionPresencial = [" + super.toString() +", sala=" + sala.toString() + "]";
    }

}
