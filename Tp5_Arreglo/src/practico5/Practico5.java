/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico5;

/**
 *
 * @author estudiante
 */
public class Practico5 {

    public static void main(String[] args) {
        
     
     int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     int[][] arr2 = {{1, 4, 9, 4},{5, 6, 7}};
     String palabra="Soy una frase de prueba";
     
        
        Arreglo.sumarLista(arr1);
        System.out.println("El numero mayor del arreglo es " +Arreglo.buscarMayor(arr2));
        System.out.println("La cantidad de veces que aparece el caracter es "+Arreglo.cuentaCaracter(palabra, 'a'));
        System.out.println("La cantidad de vocales que contiene el arreglo es "+Arreglo.cuentaVocales(palabra));
        
     
     
     
        
    }
    
}
