/*
 6. Crear un programa que dado un numero determine si es par o impar.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = teclado.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero "+num+" es PAR");
    } else {
        System.out.println("El numero "+num+" es IMPAR");
    }
        
    }
    
}
