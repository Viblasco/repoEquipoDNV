
package tp1obligatorio;

/**
 *
 * @author Viviana Blasco, Becerra Daniel, Nicolas Araujo
 */
public class TP1Obligatorio {

   
    public static void main(String[] args) {
         Robot unRobot = new Robot( "x7000");
        
        Hombre unHombre = new Hombre();
        Hombre otroHombre= new Hombre();
        
        unHombre.jugarConRobot(unRobot);
        
        otroHombre.jugarConRobot(unRobot);
    }
    
}
