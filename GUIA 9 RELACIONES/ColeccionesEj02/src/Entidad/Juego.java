/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author MI EQUIPO
 */
public class Juego {
    
    ArrayList<Jugador>jugadores=new ArrayList();
    Revolver revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.jugadores=jugadores;
        revolver=r;
    }
//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

    public boolean ronda(){
        for (Jugador jugador : jugadores) {
           jugador.disparo(revolver);
            System.out.println("");

           if(jugador.isMojado()){
               System.out.println("Game Over. El jugador mojado es: "+jugador.getNombre());
               return true;
           }
        }
        return false;
    }


}