/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ElectroService {

    static Scanner teclado = new Scanner(System.in);

    public static void crearElectrodomestico(Electrodomestico electro) {
//        System.out.println("Planilla de Sistema para añadir un nuevo electrodomestico");
//        System.out.println();
        System.out.println("Indique su color");
        String color1 = teclado.next();
        System.out.println("Indique su peso");
        Integer peso1 = teclado.nextInt();
        System.out.println("Consumo energetico A,B,C,D,F (Donde ´A´ es el mejor puntaje)");
        char letra1 = teclado.next().charAt(0);
        System.out.println("El precio por defecto sera $1000, despues cambiara segun caracteristicas");
        double precio1 = teclado.nextDouble();

        if (precio1 < 1000) {
            electro.setPrecio(1000);

        }

        electro.comprobarColor(color1);
        electro.ComprobarConsumoEnergetico(letra1);

        electro.setPeso(peso1);

        //verifica precio segun consumo y peso
        electro.setPrecio(precio1);
//        electro.setColor(color1);
//        electro.setConsumo_energetico(letra1);
//        electro.setPeso(peso1);
        //      System.out.println(electro.toString());
    }

    public static void crearLavadora(Lavadora aurora) {
        System.out.println("tamaño de carga del lavarropas");
        double carga = teclado.nextDouble();
        aurora.setCarga(carga);
        crearElectrodomestico(aurora);

        aurora.precioFinal();

    }

    public static void crearTelevisor(Televisor aoc) {
        System.out.println("Tamaño en pulgadas de la TV");
        int pulgadas = teclado.nextInt();

        System.out.println("La TV tiene sintonizador TDT si/no");
        String tdt = teclado.next();

        aoc.setPulgadas(pulgadas);
        if (tdt.equalsIgnoreCase("si")) {
            aoc.setSintonizadorTDT(true);

        }

        crearElectrodomestico(aoc);

        aoc.precioFinal();

    }

}
