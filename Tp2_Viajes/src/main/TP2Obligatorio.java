package main;

import java.util.Scanner;




public class TP2Obligatorio {

   
    public static void main(String[] args) {
        //creamos combustible
        Combustible nafta=new Combustible ("nafta", 200);
        Combustible diesel=new Combustible("diesel", 250);
        Combustible gnc =new Combustible("gnc", 90);
        
        
        //creacion autos
        Vehiculo auto1= new Auto("Ford","asd123",nafta);
        Vehiculo camion1=new Camion("Mercedes Benz", "lkq123",diesel);
        Vehiculo camioneta1=new Camioneta("Fiat","iop545",gnc);
        
        //creacion ciudades
        Ciudad JK=new Ciudad ("Juana koslay", 60, 7);
        Ciudad SanLuis=new Ciudad("San Luis", 100, 146);
        Ciudad Potrero=new Ciudad("Potrero", 5, 7);
        Ciudad LaPunta=new Ciudad("La punta", 20, 146);
        
        //creacion viajes
        Viaje viaje1 = new Viaje(JK,Potrero,auto1,3);
        System.out.println(viaje1.toString());
        
        
        System.out.println("La distancia es: "+ viaje1.calcularDistancia()+" km");
        
        
        System.out.println("Costo del peaje: $"+ viaje1.calcularCostoPeajes());
        
        System.out.println("Costo de combustible: $"+ viaje1.calcularCostoCombustible());
        
        System.out.println("Costo total del viaje: $"+ viaje1.calcularCostoTotal());
        
        
        Viaje viaje2 = new Viaje(LaPunta, SanLuis,80,camion1,2);
       
        System.out.println(viaje2.toString());
        System.out.println("La distancia es: "+ viaje2.calcularDistancia()+" km");
        
        
        System.out.println("Costo del peaje: $"+ viaje2.calcularCostoPeajes());
        
        System.out.println("Costo de combustible: $"+ viaje2.calcularCostoCombustible());
        
        System.out.println("Costo total del viaje: $"+ viaje2.calcularCostoTotal());
        
        
       
        
    
}
}