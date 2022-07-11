/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String texto;
        
        System.out.println("Escriba una frase de por lo menos 3 palaras");
        texto = teclado.nextLine();
        texto = texto.toUpperCase();
        
        System.out.println(texto);
        
        System.out.println("Ahor en minuscula de nuevo");
        
        texto = texto.toLowerCase();
        
        System.out.println(texto);
  
    }
    
}
