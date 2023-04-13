package entidades;

public class Combustible {

    private String tipoCombustible;

    private double Precio;

    public Combustible(String tipoCombustible, double Precio) {
        this.tipoCombustible = tipoCombustible;
        this.Precio = Precio;
    }

    

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Combustible{" + "tipoCombustible=" + tipoCombustible + ", Precio=" + Precio + '}';
    }
    
}
