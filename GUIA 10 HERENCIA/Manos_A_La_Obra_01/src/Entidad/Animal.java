/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author MI EQUIPO
 */
public class Animal implements AccionMascota {

    
    public void hacerRuido(){
        System.out.println("Hola");
        
    }

    @Override
    public void dormir(int horas) {
        System.out.println("El animal va a dormir " +horas + " horas al dia");

    }

    @Override
    public void comer(int cantidadVeces) {
        System.out.println("Come " + cantidadVeces + " veces por dia");

    }

    @Override
    public int idaAlBaño() {
 
        return 2;
    } 
    
    
        
}
