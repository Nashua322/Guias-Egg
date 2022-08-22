/*
 EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Ingrese 4 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        num4 = leer.nextInt();
        
        System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("  ");
          System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("  ");
          System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("  ");
          System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("  ");
                
    }
    
}
