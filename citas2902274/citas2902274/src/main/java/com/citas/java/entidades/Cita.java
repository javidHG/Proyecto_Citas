package com.citas.java.entidades;

import java.time.LocalDateTime;

public class Cita {
    private Integer id;
    private LocalDateTime fecha;
    protected Paciente paciente;
    
    public Cita(Integer id, LocalDateTime fecha, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
    }
    public Integer getId() {
        return id;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
  
}
