package com.citas.java.entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {

    //Definiciones de metodos
    //Solo se ponen las firmas de metodos porque la implementacion (intrucciones)
    //corren por cuenta de las clases 
    public void agendarCita(LocalDateTime fechaCita);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fechaCita);
}

