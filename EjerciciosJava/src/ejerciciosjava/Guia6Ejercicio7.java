/*
7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        System.out.println("Por favor ingrese la frase Eureka");
        
        frase = teclado.nextLine().toLowerCase();
       
        
        if (frase.equals("eureka")){
            System.out.println("La frases coinciden");
            
        }else {
            System.out.println("Las frases NO coinciden");
        }
            
    }
    
}
