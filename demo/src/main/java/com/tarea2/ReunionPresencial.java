package com.tarea2;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista, Instant horaInicio,
            Instant horaFin, String sala) {
        super(fecha, horaPrevista, duracionPrevista, horaInicio, horaFin);
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
        return "ReunionPresencial  [fecha=" + super.getFecha() + ", horaPrevista=" + super.getHoraPrevista() + ", duracionPrevista=" + super.getDuracionPrevista()
                + ", horaInicio=" + super.getHoraInicio() + ", horaFin=" + super.getHoraFin() + ", listaAsistencias=" + super.getListaAsistencias()
                + ", listaAusencias=" + listaAusencias + ", listaRetrasos=" + listaRetrasos + "sala=" + sala + "]";
        // TODO finish this
    }

}
