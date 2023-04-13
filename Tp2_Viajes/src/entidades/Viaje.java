package entidades;

public class Viaje {

    private Ciudad origen;

    private Ciudad destino;

    private double distancia;

    private Vehiculo vehiculo;

    private int cantidadPeajes;

    public Viaje(Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadPeajes() {
        return cantidadPeajes;
    }

    public void setCantidadPeajes(int cantidadPeajes) {
        this.cantidadPeajes = cantidadPeajes;
    }

    

    

    public double calcularDistancia() {
        if (origen.getKm()>0 && destino.getKm()>0)
        {
            
            distancia=Math.abs(destino.getKm()-origen.getKm());
            return distancia;
        }
        else
        {
         return distancia;
        }
            
    }

    public double calcularCostoPeajes() {
        double costoPeaje;
        if (vehiculo instanceof Auto || vehiculo instanceof Camioneta) {
            costoPeaje = 50.0;
        } else {
            costoPeaje = 100.0;
        }
        return costoPeaje * cantidadPeajes;
    }
       
    

    public double calcularCostoCombustible() {
        
        return vehiculo.calcularCostoCombustible()*distancia;
    }

    public double calcularCostoTotal() {
        
        return calcularCostoCombustible()+calcularCostoPeajes();
    }

    @Override
    public String toString() {
        return "Viaje{" + "origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + ", vehiculo=" + vehiculo + ", cantidadPeajes=" + cantidadPeajes + '}';
    }
    
}
