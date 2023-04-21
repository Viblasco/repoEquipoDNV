/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.Ejerc2;

/**
 *
 Responder:
1) Cual es el estado de energía al inicializar la ejecución y cual después de ejecutarse el
ítem d.? Al inicializar la Ejecucion el estado de energia es 100 al terminarla es 20
2) Cual es la nueva posición del Guerrero al finalizar la ejecución? La nueva posicion del guerrero es X:95 Y:200
3) Hacer el Diagrama de Clases en UML de este proyecto.
 */
public class TestHerencia {
     public static void main(String[] args) {
       Guerrero Tobias = new Guerrero("Thor", 100, 200);
       Tobias.girar();
       Tobias.girar();
       Tobias.girar();
       System.out.println("Esta mirando al " + Tobias.getOrientacion());
       Tobias.avanzar();
       Tobias.avanzar();
       Tobias.avanzar();
       Tobias.avanzar();
       Tobias.avanzar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       Tobias.disparar();
       
         System.out.println("Energia actual " + Tobias.getEnergia());
         
         System.out.println("Posicion x "+Tobias.ubicacion.getX()+ " Posicion y " + Tobias.ubicacion.getY());
       
    }
}
