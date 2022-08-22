/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
   Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int grados;
        int f;
        
        System.out.println("Por favor Ingrese temperatura en Grados Centigrados");
        
        grados = teclado.nextInt();
        f = (32 +(9 *grados / 5));
        
        System.out.println("La temperatura "+grados+ "°C , son "+f+"°F.");
    }
    
}
