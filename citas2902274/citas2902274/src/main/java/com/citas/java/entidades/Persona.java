package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public class Persona {

    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoDocumento TipoDocumento;
    private Long numeroDocumento;

    
    
    public Persona(Integer id, String nombres, String apellidos,
            com.citas.java.enumeraciones.TipoDocumento tipoDocumento, Long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        TipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public TipoDocumento getTipoDocumento() {
        return TipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


}
