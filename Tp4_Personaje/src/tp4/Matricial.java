
package tp4;


public class Matricial extends Impresora{
    private boolean cinta;

    public Matricial(boolean cinta) {
        this.cinta = cinta;
    }
    

    public boolean isCinta() {
        return cinta;
    }

    public void setCinta(boolean cinta) {
        this.cinta = cinta;
    }
    
    public void remplazarCinta(){
    }
    
}
