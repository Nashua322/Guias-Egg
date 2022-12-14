/*
2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
 */
package relacionesej02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class RelacionesEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("///////BIENVENIDOS A LA RULETA RUSA ////////");
        
        Revolver revolver= new Revolver();
        revolver.llenarRevolver();
        System.out.println(revolver);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores");
        int cantJugadores = read.nextInt();
        if(cantJugadores>6) {
            cantJugadores=6;
        }

        for (int i = 1; i <= cantJugadores; i++) {
            Jugador jugador = new Jugador(i);
            jugadores.add(jugador);
            System.out.println("Se creo el jugador :"+jugador.getNombre() );
        }
        Juego juego = new Juego();
        juego.llenarJuego(jugadores,revolver);
        
        boolean terminarJuego = false;
        while (!terminarJuego) {            
           terminarJuego = juego.ronda();    
        }
          
    }
    
}