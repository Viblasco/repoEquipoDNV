package main;

import entidades.Auto;
import entidades.Camion;
import entidades.Camioneta;
import entidades.Viaje;
import entidades.Vehiculo;
import entidades.Combustible;
import entidades.Ciudad;
import java.util.Scanner;




public class TP2Obligatorio {

   
    public static void main(String[] args) {
        //creamos combustible
        Combustible nafta=new Combustible ("nafta", 200);
        Combustible diesel=new Combustible("diesel", 250);
        Combustible gnc =new Combustible("gnc", 90);
        
        
        //creacion autos
        Vehiculo auto1= new Auto("Ford","asd123",nafta);
        Vehiculo camion1=new Camion("Mercedes Benz", "ñlkq123",diesel);
        Vehiculo camioneta1=new Camioneta("Fiat","iop545",gnc);
        //creacion ciudades
        Ciudad JK=new Ciudad ("Joana koslay", 60, 7);
        Ciudad SanLuis=new Ciudad("San Luis", 100, 146);
        Ciudad Potrero=new Ciudad("Potrero", 5, 7);
        Ciudad LaPunta=new Ciudad("La punta", 20, 146);
        //creacion viajes
        Viaje viaje1= new Viaje(JK,Potrero,auto1,3);
        Viaje viaje2=new Viaje(LaPunta, SanLuis,80,camion1,2);
       
        viaje1.calcularDistancia();
        System.out.println(viaje1.calcularCostoTotal());
        
       
        
    
}