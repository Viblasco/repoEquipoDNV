package entidades;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    
    
    
    @Override
    public double calcularCostoCombustible() {
        return this.getCombustible().getPrecio()*7/100;
    }
}
