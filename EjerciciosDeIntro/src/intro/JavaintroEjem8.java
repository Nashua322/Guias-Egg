/*
 EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
 
        System.out.println("Ingrese el valor de la nota entre 0 y 10");
        num1 = leer.nextInt();
        while (num1 <  0 || num1 > 10) {
        System.out.println("Por favor ingrese una nota correcta");
        num1 = leer.nextInt();
    }
        
       System.out.println("Perfecto la nota es: " + num1);
        
              
    }
    
}
