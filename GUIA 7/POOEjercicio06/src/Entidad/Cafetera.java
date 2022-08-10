/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
 */
package Entidad;

/**
 *
 * @author MI EQUIPO
 */
public class Cafetera {
    
    private double capacidadMaxima;
    private double cantidadActual;
    double cantidadJarros;
    double tamañoTaza;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual, double cantidadJarros, double tamañoTaza) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.cantidadJarros = cantidadJarros;
        this.tamañoTaza = tamañoTaza;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadJarros() {
        return cantidadJarros;
    }

    public void setCantidadJarros(double cantidadJarros) {
        this.cantidadJarros = cantidadJarros;
    }

    public double getTamañoTaza() {
        return tamañoTaza;
    }

    public void setTamañoTaza(double tamañoTaza) {
        this.tamañoTaza = tamañoTaza;
    }


    
    
    
}
