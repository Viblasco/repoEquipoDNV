/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4.Ejerc2;

/**
 *
 * @author becer
 */
public class Guerrero extends Personaje {
   protected boolean caballo;

    public Guerrero(String nick, int x, int y) {
        super(nick, x, y);

    }

    public boolean getCaballo() {
        return this.caballo;
    }

    public void setCaballo(boolean tieneCaballo) {
        this.caballo = tieneCaballo;
    }

    @Override
    public void avanzar() {

        int velocidad;

        if (this.getCaballo()) {
            velocidad = 10;
        } else {
            velocidad = 1;
        }

        switch (super.orientacion) {
            case 'N':
                super.ubicacion.setY(super.ubicacion.getY() + velocidad);
                break;
            case 'E':
                super.ubicacion.setX(super.ubicacion.getX() + velocidad);
                break;
            case 'S':
                super.ubicacion.setY(super.ubicacion.getY() - velocidad);
                break;
            default:
                super.ubicacion.setX(super.ubicacion.getX() - velocidad);
                break;
        }
    }

    @Override
    public void disparar() {
        if (super.energia >= 30) {
            super.energia -= 10;
        } else if (this.getCaballo() && super.energia < 30) {
            super.energia -= 10;
            this.setCaballo(false);
            System.out.println("Se quedo sin caballo");
        } else if (!this.getCaballo() && super.energia >= 10) {
            super.energia -= 10;
        } else {
            System.out.println("No puedes disparar");
        }


    }
}