/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author MI EQUIPO
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instanciacion utilizando al contructor vacio
        Persona primeraPersona = new Persona();
        //Instanciacion utilizando al constructor por parametro
        Persona segundaPersona = new Persona("Gaston", "Argentino", "Capricornio");

        System.out.println(segundaPersona.nombre + " " + segundaPersona.nacionalidad + " " + segundaPersona.signo);
        
        segundaPersona.setNombre("Tongas");

        System.out.println(segundaPersona.getNombre());
        System.out.println(segundaPersona.getPersona());
    }

}
