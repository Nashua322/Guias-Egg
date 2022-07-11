/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
package ejerciciosjava;

import java.util.Scanner;


/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Por favor ingrese un numero y le mostrare el doble, el triple y la raiz cuadrada");
        
        num = teclado.nextInt();
        
        
        System.out.println("el doble de "+num+ " es: "+(num*2));
        System.out.println("El triple de "+num+ " es: "+(num*3));
        System.out.println("La raiz cuadrada de "+num+ " es:"+Math.sqrt(num));
    }
    
}
