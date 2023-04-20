package main;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca=marca;
        this.patente=patente;
        this.combustible=combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

  

    public abstract double calcularCostoCombustible();

    @Override
    public String toString() {
        return " Vehiculo:" + " marca:" + marca + ", patente:" + patente +  combustible ;
    }
    

}
