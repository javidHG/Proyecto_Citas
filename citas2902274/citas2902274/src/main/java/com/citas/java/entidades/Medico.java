package com.citas.java.entidades;


import com.citas.java.enumeraciones.Especialidad;


public class Medico extends Persona{
    
 
    public Medico(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento, Long numeroDocumento) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        
    }

    private Long RegistroMedico;
    private Especialidad especialidad;

    public Long getRegistroMedico() {
        return RegistroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        RegistroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [especialidad=" + especialidad + ", Nombres()=" + getNombres() + ", Apellidos()="
                + getApellidos() + "]";

    
    }
    
}
