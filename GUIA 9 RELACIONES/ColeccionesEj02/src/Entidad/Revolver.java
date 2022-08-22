/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author MI EQUIPO
 */
public class Revolver {
    int posicion_actual;
    int posicion_agua;

    public Revolver() {
    }

    public Revolver(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    public void llenarRevolver(){
        posicion_actual=(int)(Math. random()*6+1);
        posicion_agua=(int)(Math. random()*6+1);
    }
    public boolean mojar(){
        boolean mojar=true;

        if(posicion_actual==posicion_agua){
             System.out.println("Perdio!! :P");
        }else{
            mojar=false;
            System.out.println("En esta ronda tuvo suerte! :D");

        }
        return mojar;

    }
    public void siguienteChorro(){
        if (posicion_actual==6){
            posicion_actual=1;
        } else {
         posicion_actual+=1;   
        }
    }

    @Override
    public String toString() {
        return "Revolver de Agua: " + "La posicion actual esta en:" + posicion_actual + ", y la posicion del agua es: " + posicion_agua;
    }






}
