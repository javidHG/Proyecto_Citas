package com.citas.java.entidades;

public class Enfermero extends Persona {

    public Enfermero(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento, Long numeroDocumento) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);  
    }


}
