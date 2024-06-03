package com.citas.java.entidades;
import java.time.LocalDateTime;
import com.citas.java.enumeraciones.ProcedimientosEnfermeria;

public class CitaEnfermero extends Cita implements IAgendamiento {


   
    private  ProcedimientosEnfermeria procedimiento;
    private Enfermero enfermero;

    public CitaEnfermero(Integer id, LocalDateTime fecha, Paciente paciente) {
        super(id, fecha, paciente);
        
        
    }

public ProcedimientosEnfermeria getProcedimiento() {
    return procedimiento;
}
public Enfermero getEnfermero() {
    return enfermero;
}
public void setProcedimiento(ProcedimientosEnfermeria procedimiento) {
    this.procedimiento = procedimiento;
}
public void setEnfermero(Enfermero enfermero) {
    this.enfermero = enfermero;
}
@Override
public void agendarCita(LocalDateTime fechaCita) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
}
@Override
public void cancelarCita() {
    System.out.println("Cita para procedimientos:"+ this.procedimiento + "cancelada");
}
@Override
public void reagendarCita(LocalDateTime fechaCita) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
}


}
 