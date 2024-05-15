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
    private ArrayList<Instant> listaHoraRetraso;
    private Invitacion invitacion;
    private TipoReunion tipoReunion;
    private ArrayList<Nota> listaNotas;

    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, TipoReunion tipoReunion) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.tipoReunion = tipoReunion;
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

    public ArrayList<Nota> obtenerListaNotas() {
        return listaNotas;

    }

    public int obtenerTotalAsisencias () {
        return listaAsistencia.cantidad();

    }

    public float obtenerPorcentajeAsistencias () {
        return listaAsistencia.cantidad() / listaInvitados.size();

    }

    /**
     * @param nota Nota nota a ser añadida
     */

    public void añadirNota(Nota nota) {
        listaNotas.add(nota);

    }

    /**
     * 
     * @return ArrayList<Instant> Lista con las horas de llegada de empleados atrasados, hora en la i posicion corresponde al empleado en la posicion i
     *                            de la lista de atrasos
     */

    public ArrayList<Instant> obtenerHoraRetrasos() {
        return listaHoraRetraso;

    }

    /**
     * 
     * @return float tiempo que duro la reunion
     */

    public float calcularTiempoReal() {
        float tiempoReal;
        tiempoReal = horaInicio.compareTo(horaFin);
        // TODO test this
        return tiempoReal;
    }

    /**
     * 
     * @param invitado Empleados empleado que se invita a la reunion, se agrega a lista de invitados
     */

    public void agregarInvitado(Empleados invitado){
        listaInvitados.add(invitado);
    }

    /**
     * 
     * @param hora Instant hora a la que se inicia la reunion
     * Funcion para darle inicio a la reunion y asignarle la hora a la que se inicio
     */

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

    /**
     * @param horaFin Instant hora a la que se termina la reunion
     * Funcion para asignar hora de termino de reunion
     */

    public void finalizar(Instant horaFin) {
        if (horaInicio != null) {
            this.setHoraFin(horaFin);

        } else {
            System.out.println("Reunion no iniciada");

        } 
        
    }

    /**
     * @param empleado Empleados empleado que se añade a la asistencia
     * Si el empleado se encuentra en lista de ausencia, este se quita de esta
     */

    public void agregarAsistencia(Empleados empleado) {
        listaAsistencia.añadirEmpleado(empleado);
        for (int i = 0; i < listaAusencias.size(); i++) {
            if (listaAusencias.get(i) == empleado) {
                listaAusencias.remove(i);

            }
            
        }

    }

    /**
     * @param empleado Empleados empleado que se añadira a la lista de retraso
     * @param hora Instant hora de llegada del empleado
     */

    public void agregarRetraso(Empleados empleado, Instant hora) {
        listaRetraso.añadirEmpleado(empleado);
        listaHoraRetraso.add(hora);

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
