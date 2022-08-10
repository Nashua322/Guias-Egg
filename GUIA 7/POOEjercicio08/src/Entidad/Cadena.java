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
public class Cadena {
    
    private String frase;
    private int longitud;
    private String nuevaFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitud, String nuevaFrase) {
        this.frase = frase;
        this.longitud = longitud;
        this.nuevaFrase = nuevaFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNuevaFrase() {
        return nuevaFrase;
    }

    public void setNuevaFrase(String nuevaFrase) {
        this.nuevaFrase = nuevaFrase;
    }
    
    
    
}
