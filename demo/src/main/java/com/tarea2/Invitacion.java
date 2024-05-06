package com.tarea2;

import java.time.*;

public class Invitacion {
    private Instant hora;

    public Invitacion(Instant hora) {
        this.hora = hora;

    }

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Invitacion [hora=" + hora + "]";
    }

    

}
