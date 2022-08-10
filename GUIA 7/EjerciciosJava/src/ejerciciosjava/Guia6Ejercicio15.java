/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector;
        vector = new int[100];
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Construir un vector con 100 valores");
        
        for (int i = vector.length - 1; i >=1; i--) {
            System.out.println("Vector["+i+"]="+i);
        }
        
         
 
    }
    
}
