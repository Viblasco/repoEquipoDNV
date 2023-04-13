package entidades;



import java.time.LocalDate;

public abstract class Persona {

    protected String nombre;

    protected int dni;

    protected LocalDate fechaNac;

    protected String domicilio;

    
    
    public void calcularEdad() {
    }

    public void diasVividos() {
    }

    public abstract void cobrar();
}
