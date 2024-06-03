package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;
import java.time.LocalDate;

public class Paciente {
    

    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoDocumento TipoDocumento;
    public Long numeroDocumento;
    public String correoElectronico;
    public Long celular;
    public LocalDate fechaNaciemiento;
    public double altura;
    public double peso;
    public TipoSangre TipoSangre;
    public String factorRH;
    public Paciente(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento, Long numeroDocumento, String correoElectronico,
            Long celular, LocalDate fechaNaciemiento, double altura, double peso,
            com.citas.java.enumeraciones.TipoSangre tipoSangre, String string) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        TipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNaciemiento = fechaNaciemiento;
        this.altura = altura;
        this.peso = peso;
        TipoSangre = tipoSangre;
        this.factorRH = string;

        
    }
    @Override
    public String toString() {
        return "Paciente [nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }


}
