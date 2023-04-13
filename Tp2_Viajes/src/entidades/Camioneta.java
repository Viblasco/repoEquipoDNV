package entidades;

public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    
    @Override
    public double calcularCostoCombustible() {
         return this.getCombustible().getPrecio()*10/100;
    }
}
