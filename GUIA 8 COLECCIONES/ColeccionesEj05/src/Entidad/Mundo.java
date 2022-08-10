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
public class Mundo implements Comparable<Mundo> {

    
    private String pais;

    public Mundo() {
    }

    public Mundo(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Mundo: " + "   Pais = " + pais;
    }

    @Override
    public int compareTo(Mundo t) {

        return this.pais.compareTo(t.getPais());

    }

}
