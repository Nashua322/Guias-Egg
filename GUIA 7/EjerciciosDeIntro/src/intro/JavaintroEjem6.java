/*
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 * alguno de ellos es mayor a 25.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 valores enteros ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25){
            System.out.println("El numer 1 : " + num1 + " es mayor a 25");
        }else if (num2 > 25)
                {System.out.println("El numero 2: " + num2 + " es mayor a 25");
        
        }else System.out.println("Ninguno de los dos numeros es mayor a 25");
        
           
                
        
        
    }
    
}
