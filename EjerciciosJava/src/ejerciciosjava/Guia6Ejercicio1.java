/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        
        System.out.println("Por favor ingrese 2 numeros para despues sumarlos");
      num1 = leer.nextInt();
      num2 = leer.nextInt();
      suma = num1 + num2;
      
        System.out.println("El resultado de la suma del numero "+num1+" mas el numero "+num2+" es: " +suma);
      
    }
    
}