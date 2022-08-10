/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Tiendita;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class TienditaService {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public void nuevoArt(HashMap<String, Double> art) {

        // HashMap<Tiendita> continente = new HashMap();
        String elemento;
        double costo;
        String salir;

        System.out.println("Planilla de Articulos nuevos");
        System.out.println();

        do {
            System.out.println("Nombre del producto");
            elemento = teclado.next();
            System.out.println("Precio:");
            costo = teclado.nextDouble();

            art.put(elemento, costo);
            System.out.println("¿Desea agregar otro producto? s/n");
            salir = teclado.next();

        } while (!salir.equalsIgnoreCase("n"));

    }

    public void modPrecio(HashMap<String, Double> art) {

        String prodaModificar;
        Double nuevoPrecio;

        System.out.println("Que producto desea modificar el precio?");
        prodaModificar = teclado.next();
        System.out.println("Precio: ");
        nuevoPrecio = teclado.nextDouble();

        if (art.containsKey(prodaModificar)) {
            art.put(prodaModificar, nuevoPrecio);
        } else {
            System.out.println("El producto no se encuentra en Stock");
        }

        System.out.println();

    }

    public void mostrarProd(HashMap<String, Double> art) {

        System.out.println("Lista de Productos en Stock:");

        for (Map.Entry<String, Double> entry : art.entrySet()) {
            System.out.println("- " + entry.getKey()
                    + " $" + entry.getValue());
        }
        System.out.println();

    }

    public void elimProd(HashMap<String, Double> art) {

        String prodaEliminar;

        System.out.println("Que producto desea eliminar?");
        prodaEliminar = teclado.next();

        if (art.containsKey(prodaEliminar)) {
            art.remove(prodaEliminar);

        } else {
            System.out.println("El producto no se encuentra en Stock");
        }

        System.out.println();

    }

}
