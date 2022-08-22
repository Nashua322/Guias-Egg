/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carta;

import palos.Palos;

/**
 *
 * @author MI EQUIPO
 */
public class Carta {
    

    private Palos palo;
    int numero;

    public Carta(Palos palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

//    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.

    @Override
    public String toString() {
        return +numero + " de : " + palo + "\n";
    }


}
