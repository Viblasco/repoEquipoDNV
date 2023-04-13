package entidades;

public class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    
    @Override
    public double calcularCostoCombustible() {
         return this.getCombustible().getPrecio()*12/100;
    }
}
