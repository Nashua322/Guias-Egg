/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad2;

/**
 *
 * @author MI EQUIPO
 */
public class Dni {
    
    char serie;
    int nume;

    public Dni() {
    }

    public Dni(char serie, int nume) {
        this.serie = serie;
        this.nume = nume;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", nume=" + nume + '}';
    }
    
    
    
    
    
    
}
