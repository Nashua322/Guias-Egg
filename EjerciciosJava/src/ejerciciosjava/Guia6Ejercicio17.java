/*
   17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
   de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosjava;

import java.awt.Dimension;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        //vriable para comparar cantidad de digitos
        int nUna = 0, nDos = 0, nTre = 0, nCua = 0, nCin = 0;
        //var de tamaño
        int dimension; 
        int numeroAleatorio = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        dimension =teclado.nextInt();
        
        int[] vector = new int[dimension];
        
        System.out.println("  ");
        System.out.println("**LLENAR VECTOR**");
        System.out.println("  ");
        
        for (int i = 0; i < dimension; i++) {
            /*System.out.print("Ingresando un número ALEATORIO de hasta 5 cifras para la posicion "+(i+1)+": ");
            numeroAleatorio = (int) (Math.random()*100000+1);
            System.out.println(numeroAleatorio);
            vector[i]=numeroAleatorio ;
            */
            System.out.print("Ingresar un numero de hasta 5 cifras para la posicion "+(i+1)+": ");
            vector[i] = teclado.nextInt(); 
        }
        
        
        for (int i = 0; i < dimension; i++) {
            if (vector[i] / 10 == 0) {
                nUna++;
            } else if (vector[i] / 100 == 0) {
                nDos++;
            } else if (vector[i] / 1000 == 0) {
                nTre++;
            } else if (vector[i] / 10000 == 0){
                nCua++;
            } else if (vector[i] / 100000 == 0){
                nCin++;
            }
            
        }
        
        System.out.println("***-----***");
        System.out.println("--INFORME--");
        System.out.println("***-----***");
        System.out.print(" ");
        System.out.print("Vector: ");
        for (int i = 0; i < dimension; i++) {
            if (i != (dimension - 1)) {
                System.out.print(vector[i]+" ");
                
            } else {
                System.out.println(vector[i]);
            }
            
            
        }
        System.out.println(" ");
        System.out.println("se ingreso "+nUna+ " numero de 1 cifra");
        System.out.println("se ingreso "+nDos+ " numeros de 2 cifra");
        System.out.println("se ingreso "+nTre+ " numeros de 3 cifra");
        System.out.println("se ingreso "+nCua+ " numeros de 4 cifra");
        System.out.println("se ingreso "+nCin+ " numeros de 5 cifra");
        
    }
    
}
