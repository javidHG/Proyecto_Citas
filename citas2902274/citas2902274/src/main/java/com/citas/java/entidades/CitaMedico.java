package com.citas.java.entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.EstadoCita;

public class CitaMedico extends Cita implements IAgendamiento{
//Iplements unicamente para herededar comportamiento de interfaces
    private String motivo;
    private Medico medico;
    private EstadoCita estadoCita;
    private EstadoCita setEstadoCita;

    public CitaMedico(Integer id, LocalDateTime fecha, Paciente paciente, String motivo, Medico medico,
            EstadoCita estadoCita) {
        super(id, fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estadoCita = estadoCita;
        
    }
    public String getMotivo() {
        return motivo;
    }
    public Medico getMedico() {
        return medico;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    public void agendarCita (LocalDateTime fecha, EstadoCita estadoCita){
        this.setFecha(fecha);
        this.estadoCita = EstadoCita.AGENDADA;

    }
 
    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
        this.setEstadoCita = EstadoCita.AGENDADA;

    }
    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
        
    }
    @Override
    public void cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
        System.out.println("Cita con medico:" + medico.getNombres() + "Cancelada");
       
    }

}


  
  
