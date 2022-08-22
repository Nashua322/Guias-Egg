/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Por Favor Ingrese su nombre");

        nombre = teclado.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"?... Encantado "+nombre+" Yo me llamo Steve.");
        
        
    }
    
}
