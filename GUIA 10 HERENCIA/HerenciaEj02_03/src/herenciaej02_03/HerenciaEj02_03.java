/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej02_03;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Service.ElectroService;
import java.util.ArrayList;

/**
 *
 * @author MI EQUIPO
 */
public class HerenciaEj02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Electrodomestico electro = new Electrodomestico();

        //EJERCICIO 2
//        Lavadora aurora = new Lavadora();
//        System.out.println("------Plantilla de creacion de lavadoras------");
//        ElectroService.crearLavadora(aurora);//creacion de la Lavadora
//        
//
//        System.out.println("Electrodomestico creado tipo: " + aurora.getClass().getSimpleName() + " con los siguientes datos: \nColor: " + aurora.getColor() + "\nPeso: " + aurora.getPeso()
//                + "\nConsumo Energetico: " + aurora.getConsumo_energetico() + "\nCarga: " + aurora.getCarga() + "\n****Precio Final: " + aurora.getPrecio());
//
//        System.out.println("------Plantilla de creacion de TV------");
//        Televisor aoc = new Televisor();
//
//        ElectroService.crearTelevisor(aoc);
//        System.out.println("Electrodomestico creado tipo: " + aoc.getClass().getSimpleName() + " con los siguientes datos: \nColor: " + aoc.getColor() + "\nPeso: " + aoc.getPeso()
//                + "\nConsumo Energetico: " + aoc.getConsumo_energetico() + "\nResolucion de Pantalla: " + aoc.getPulgadas() + "\nTiene Sintonizador TDT: " + aoc.isSintonizadorTDT() + "\n****Precio Final: " + aoc.getPrecio());
        //EJERCICIO 3 continuacion del 2
        double precioLavadoras = 0;
        double precioTv = 0;
        double sumaTotal = 0;
        ArrayList<Electrodomestico> fichaFinal = new ArrayList();
        for (int i = 0; i < 2; i++) {

            Lavadora aurora = new Lavadora();
            System.out.println("------Plantilla de creacion de lavadoras------");
            ElectroService.crearLavadora(aurora);//creacion de la Lavadora

//            System.out.println("Electrodomestico creado tipo: " + aurora.getClass().getSimpleName() + " con los siguientes datos: \nColor: " + aurora.getColor() + "\nPeso: " + aurora.getPeso()
//                    + "\nConsumo Energetico: " + aurora.getConsumo_energetico() + "\nCarga: " + aurora.getCarga() + "\n****Precio Final: " + aurora.getPrecio());

            System.out.println("------Plantilla de creacion de TV------");
            Televisor aoc = new Televisor();

            ElectroService.crearTelevisor(aoc);
//            System.out.println("Electrodomestico creado tipo: " + aoc.getClass().getSimpleName() + " con los siguientes datos: \nColor: " + aoc.getColor() + "\nPeso: " + aoc.getPeso()
//                    + "\nConsumo Energetico: " + aoc.getConsumo_energetico() + "\nResolucion de Pantalla: " + aoc.getPulgadas() + "\nTiene Sintonizador TDT: " + aoc.isSintonizadorTDT() + "\n****Precio Final: " + aoc.getPrecio());

            fichaFinal.add(aurora);
            fichaFinal.add(aoc);

            precioLavadoras += aurora.getPrecio();
            precioTv += aoc.getPrecio();
            sumaTotal += aoc.getPrecio() + aurora.getPrecio();

        }

        for (Electrodomestico electrodomestico : fichaFinal) {
            System.out.println("◘◘◘◘◘◘◘");
                    
            System.out.println("el valor total es: " + electrodomestico.getPrecio());
            
            
        }
        
        
        
        System.out.println("La suma del PRECIO de todos los Lavarropas agregados es de: "+ precioLavadoras);
        System.out.println("La suma del PRECIO de todos los TV agregados es de: "+ precioTv);
        System.out.println();
        System.out.println("PRECIO FINAL DE LOS ELECTRODOMESTICOS: "+sumaTotal);
        
        
    }

}
