package entidades;

public class Ciudad {

    private String nombre;

    private double km;

    private int ruta;

    public Ciudad(String nombre, double km, int ruta) {
        this.nombre = nombre;
        this.km = km;
        this.ruta = ruta;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", km=" + km + ", ruta=" + ruta + '}';
    }
    
}
