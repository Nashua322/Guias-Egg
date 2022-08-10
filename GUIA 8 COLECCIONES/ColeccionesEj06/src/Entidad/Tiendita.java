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
public class Tiendita {
    
    private String producto;
    private Double precio;
    int cont =0;

    public Tiendita() {
    }

    public Tiendita(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda de Barrio" + " \n Producto " + cont++ + producto + ", precio=" + precio + '}';
    }
    
    
    
    
}
