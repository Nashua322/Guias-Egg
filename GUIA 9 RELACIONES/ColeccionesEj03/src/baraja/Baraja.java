/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

import carta.Carta;
import java.util.ArrayList;
import java.util.Collections;
import palos.Palos;

/**
 *
 * @author MI EQUIPO
 */
public class Baraja {
    

    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
        for (Palos palo : Palos.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i==8 || i== 9){
                    continue;
                }
                Carta carta = new Carta(palo,i);
                cartas.add(carta);
            }
        }
    }

    public void barajar(){
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println("No quedan mas cartas");
            return null;
        }
        Carta siguienteCarta = cartas.remove(0);
        monton.add(siguienteCarta);
        return siguienteCarta;
    }

    public int cartasDisponibles() {
        System.out.println("Quedan "+cartas.size()+" disponibles en la baraja.");
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidadCartas) {
        if (cartas.size()<cantidadCartas) {
            System.out.println("No hay esa cantidad de cartas para dar.");
            return null;
        }
        ArrayList<Carta> cartasADar = new ArrayList();
        for (int i = 0; i < cantidadCartas; i++) {
            Carta cartaSacada = cartas.remove(0);
            cartasADar.add(cartaSacada);
        }
        monton.addAll(cartasADar);
        return cartasADar;

    } 

    public void cartasMonton() {
        System.out.println("Las cartas en el monton son: "+monton);
    }

    public void mostrarBaraja() {
        System.out.println("Las cartas en la baraja son: ");
        System.out.println(cartas);
    }


}