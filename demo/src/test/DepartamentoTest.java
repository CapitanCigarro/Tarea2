import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartamentoTest {

    Date fecha = new GregorianCalendar(2024, Calendar.MAY, 14).getTime();
    Instant horaPrevista = Instant.parse("2024-05-10T12:30:00Z");
    Duration duracionPrevista = Duration.ofHours(2);
    Reunion r = new ReunionPresencial(fecha, horaPrevista, duracionPrevista, TipoReunion.MARKETING, null, null, "S3");
    Departamento d1 = new Departamento("Finanzas");
    Empleados e1 = new Empleados("1", "Torres", "Nicolas", "example@mail.com");

    @Test
    void getNombre() {
        assertEquals("Finanzas", d1.getNombre());
    }

    @Test
    void setNombre() {
        d1.setNombre("Ventas");
        assertEquals("Ventas", d1.getNombre());
    }

    @Test
    void getListaEmpleados() {
        ArrayList<Empleados> l1 = new ArrayList<>();
        assertEquals(l1, d1.getListaEmpleados());
    }

    @Test
    void setListaEmpleados() {
        ArrayList<Empleados> l1 = new ArrayList<>();
        d1.setListaEmpleados(l1);
        assertEquals(l1, d1.getListaEmpleados());
    }

    @Test
    void obtenerCantidadEmpleados() {
        assertEquals(0, d1.obtenerCantidadEmpleados());
    }

    @Test
    void añadirEmpleado() {
        d1.añadirEmpleado(e1);
        assertEquals(e1, d1.getListaEmpleados().get(0));
    }

    @Test
    void invitar() {
        d1.añadirEmpleado(e1);
        d1.invitar(r);
        assertEquals(e1,r.obtenerInvitados().get(0));
    }
}
