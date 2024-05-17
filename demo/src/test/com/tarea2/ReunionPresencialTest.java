package com.tarea2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import com.tarea2.*;

public class ReunionPresencialTest {
    @BeforeEach
    Date fecha = new GregorianCalendar(2024, Calendar.MAY, 14).getTime();
    Instant horaPrevista = Instant.parse("2024-05-10T12:30:00Z");
    Duration duracionPrevista = Duration.ofHours(2);
    Reunion r = new ReunionPresencial(fecha, horaPrevista, duracionPrevista, TipoReunion.MARKETING, null, null, "S3");
 
    @Test
    

    
}
