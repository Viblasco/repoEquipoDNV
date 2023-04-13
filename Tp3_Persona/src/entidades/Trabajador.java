package entidades;

import java.time.LocalDate;

public class Trabajador extends Persona implements Activo {

    private int sueldo;

    private boolean aporte;

    public Trabajador(String nombre, int dni, LocalDate fechaNac, String domicilio) {
    }

    @Override
    public void cobrar() {
    }

    @Override
    public void hacerAporte() {
    }
}
