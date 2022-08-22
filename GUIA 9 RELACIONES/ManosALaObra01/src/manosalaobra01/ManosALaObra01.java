/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra01;

import Entidad.Persona;
import Entidad2.Dni;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ManosALaObra01 {

    /**S
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        String nom, ape;
        char serial = 'A';
        int num = 33444808;
        
        //Dni num1 = new Dni('A', 33444808);
        Dni num1 = new Dni();
        
        num1.setNume(num);
        num1.setSerie(serial);
        Persona nueva = new Persona("Gaston", "Reale", num1);
        
        
        
        System.out.println("los datos de la persona son: " + nueva.toString());
        
        
        
        System.out.println();
        
        
        
        



    }
    
}
