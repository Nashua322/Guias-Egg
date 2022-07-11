/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado");
        int lado = teclado.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i >= 1 & j < lado - 1 & j >= 1 & i < lado - 1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
