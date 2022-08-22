/*

 */
package relacionesej03;

import baraja.Baraja;

/**
 *
 * @author MI EQUIPO
 */
public class RelacionesEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // TODO code application logic here
        System.out.println("///////JUEGO DE CARTAS ESPAÑOLAS/////////");
        Baraja baraja1 = new Baraja();
        baraja1.barajar();
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
        System.out.println("Saco una carta: "+baraja1.siguienteCarta());
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
        System.out.println("Saco 10 cartas: "+baraja1.darCartas(10));
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
    }

}