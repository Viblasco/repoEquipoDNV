

package entidades;

//@authora -Viviana Blasco 
public class Personaje {
    
    protected Position ubicacion;

    protected String nick;

    protected int vidas;

    protected int energia;

    protected char orientacion;

    public Personaje(String nick, int x, int y) {
        ubicacion = new Position(100, 200);
        this.nick = nick;
        this.vidas = 3;
        this.energia = 100;
        this.orientacion = 'N';

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void disparar() {
        if (this.energia >= 10) {
            energia -= 10;
        }else{
            System.out.println("No tiene suficiente energia para disparar");
        }
    }

    public void avanzar() {

        switch (this.orientacion) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY() + 1);
                break;
            case 'E':
                this.ubicacion.setX(this.ubicacion.getX() + 1);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY() - 1);
                break;
            case 'O':
                this.ubicacion.setX(this.ubicacion.getX() - 1);
            default:
                System.out.println("Ingrese una orientacion valida");
                break;
        }
    }

    public void girar() {
        switch (this.orientacion) {
            case 'N':
                this.orientacion = 'E';
                break;
            case 'E':
                this.orientacion = 'S';
                break;
            case 'S':
                this.orientacion = 'O';
                break;
            case 'O':
                this.orientacion = 'N';
                break;
            default:
                System.out.println("Ingrese letra correcta");;
                break;
        }
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public char getOrientacion() {
        return orientacion;
    }
 }

