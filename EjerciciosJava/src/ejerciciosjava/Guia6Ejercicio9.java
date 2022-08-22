/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package ejerciciosjava;

import java.util.Scanner;
/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String frase;
        String caracter;
        System.out.println("Por favor Ingrese una frase que comience por A");
        
        frase = teclado.nextLine();
        caracter = frase.substring(0,1);
        System.out.println(caracter);
        if (caracter.equals("A")){
            System.out.println("***CORRECTO***");
        
    }else {
            System.out.println("***INCORRECTO***");
        }
    }
    
}
