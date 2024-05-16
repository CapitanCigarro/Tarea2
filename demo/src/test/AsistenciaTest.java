import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tarea2.Asistencia;
import com.tarea2.Empleados;

public class AsistenciaTest {
    
    @Test
    public void testAsistencia(){
        Asistencia temp = new Asistencia();
        assertEquals(temp, temp);
    }

    @Test
    public void testAñadirEmpleado(){
        Empleados e1 = new Empleados("123", "Cabrera", "Javier", "example@email.com");
        Asistencia asis = new Asistencia();
        asis.añadirEmpleado(e1);
        assertEquals(e1, asis.obtener(0));
    }

    @Test
    public void testCantidad(){
        Empleados e1 = new Empleados("123", "Cabrera", "Javier", "example@email.com");
        Empleados e2 = new Empleados("124", "Castillo", "Julio", "example@email.com");
        Asistencia asis = new Asistencia();
        asis.añadirEmpleado(e1);
        asis.añadirEmpleado(e2);

        assertEquals(2, asis.cantidad());
    }
}
