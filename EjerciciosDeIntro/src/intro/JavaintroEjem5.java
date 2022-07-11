/*
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
*Scanner.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese un decimal");
        double decimal = leer.nextDouble();
        System.out.println("Ingrese un valor positivo");
        boolean  bandera = leer.nextBoolean();
        System.out.println("ingrese una palabra");
        char caracter = leer.next().charAt(0);
        
        
        
    }
    
}
