package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;

import com.citas.java.enumeraciones.EstadoCita;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
  public static void main(String[] args) {
    // crear un medico
    // crear un objeto medico
    // crear una INSTANCIA de medico

    Medico m = new Medico(3, "Javid", "Herrera", TipoDocumento.CC, 1016834106L);
    m.setNombres("Javid Santiago");
    System.out.println("nombre: " + m.getNombres());

    Medico Y = new Medico(2,
        "Pablo",
        "SIERRA",
        TipoDocumento.CM,
        456789L);

    Medico L = new Medico(3,
        "Pula",
        "Estrella",
        TipoDocumento.CC,
        76543L);

    Paciente p = new Paciente(1,
        "Javid",
        "Herrera",
        TipoDocumento.TI,
        63836338L,
        "Javid.Herrera@misena.edu.co",
        3638363873L,
        LocalDate.of(2006, Month.MAY, 27),
        1.57,
        57,
        TipoSangre.O,
        "positivo");

    Paciente H = new Paciente(1,
        "Per",
        "Garavillo",
        TipoDocumento.CC,
        55789L,
        "gara@GMAIL.COM",
        24345543L,
        LocalDate.of(2000, Month.AUGUST, 03),
        1.60,
        84,
        TipoSangre.O,
        "positivo");

    Paciente J = new Paciente(2,
        "mecedez",
        "Sandobal",
        TipoDocumento.PPT,
        6554L,
        "mess@GMAIL.COM",
        43234542L,
        LocalDate.of(1999, Month.DECEMBER, 10),
        1.43,
        66,
        TipoSangre.O,
        "Positivo");

    Paciente O = new Paciente(7,
        "juana",
        "Urrieta",
        TipoDocumento.RG,
        3456L,
        "Juana@GMAL.COM",
        23676543L,
        LocalDate.of(1975, Month.JUNE, 30),
        1.65,
        90,
        TipoSangre.A,
        "Negativo");

    Paciente S = new Paciente(2,
        "Rosa",
        "Avila",
        TipoDocumento.CC,
        125432L,
        "Avila@gmail.com",
        376543L,
        LocalDate.of(1995, Month.OCTOBER, 24),
        1.34,
        45,
        TipoSangre.O,
        "Positivo");
    Paciente X = new Paciente(1,
        "Mathias",
        "Toro",
        TipoDocumento.CC,
        4536L,
        "Mart@gmail.com",
        376543L,
        LocalDate.of(2001, Month.APRIL, 06),
        3.21,
        43,
        TipoSangre.O,
        "negativo");

    Enfermero C = new Enfermero(4,
        "Cristina",
        "Rojas",
        TipoDocumento.CC,
        993443L);

    Enfermero V = new Enfermero(8,
        "Narly",
        "Lopez",
        TipoDocumento.CM,
        567890L);

    Enfermero W = new Enfermero(3,
        "Martha",
        "Morales",
        TipoDocumento.CC,
        7483838L);

    CitaMedico cm1 = new CitaMedico(3,
        LocalDateTime.of(2000, Month.APRIL, 01, 11, 30, 00),
        S,
        "Gripe",
        m,
        EstadoCita.AGENDADA);

    System.out.println("Estado de la cita al inicio: " + cm1.getEstadoCita());

    System.out.println(cm1);
    cm1.cancelarCita();
    System.out.println("Estado de la cita al inicio: " + 
                                    cm1.getEstadoCita());

  }

}