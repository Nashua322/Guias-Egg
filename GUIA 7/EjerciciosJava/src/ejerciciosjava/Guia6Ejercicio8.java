/*
 8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        
       
        
         do {

            System.out.println("Ingresar una frase de 8 caracteres de largo");
        
            frase = teclado.nextLine();

            if (frase.length()!= 8) {
                System.out.println("***INCORRECTO***");
            }

        } while (frase.length()!= 8);

        System.out.println("***CORRECTO***");
        
    }
    
}
