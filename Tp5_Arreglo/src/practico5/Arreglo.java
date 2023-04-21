package practico5;

/**
 *
 * @author estudiante
 */
public class Arreglo {
    private int arr1[];
    private int arr2[][];
    private String cadena;

    public Arreglo() {
    }

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[][] getArr2() {
        return arr2;
    }

    public void setArr2(int[][] arr2) {
        this.arr2 = arr2;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Arreglo(int[] arr1) {
        this.arr1 = arr1;
    }

    public Arreglo(int[][] arr2) {
        this.arr2 = arr2;
    }

    public Arreglo(String cadena) {
        this.cadena = cadena;
    }
    
    
    public static void sumarLista(int arr[]) {
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        promedio = (double)suma / arr.length;

        System.out.println("La suma de los elementos del arreglo son " + suma);
        System.out.println("El promedio de los elementos es " + promedio);
    }

    public static int buscarMayor(int arr[][]) {
        int aux = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (aux < arr[i][j]) {
                    aux = arr[i][j];
                }
            }

        }

        return aux;
    }

    public static int cuentaVocales(String a) {
        int contador = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == 'a') || (a.charAt(i) == 'e') || (a.charAt(i) == 'i') || (a.charAt(i) == 'o') || (a.charAt(i) == 'u')) {
                contador++;
            }
        }
        return contador;
    }
    
    public static int cuentaCaracter(String a, char x){
        int contador = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == x) ) 
            {
                contador++;
            }
        }
        return contador;
        
        
        
    }

}
