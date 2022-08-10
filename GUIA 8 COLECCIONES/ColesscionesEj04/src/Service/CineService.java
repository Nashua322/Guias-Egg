/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.*;

/**
 *
 * @author MI EQUIPO
 */
public class CineService {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Pelicula> crearPelicula() {

        ArrayList<Pelicula> biblioteca = new ArrayList();

        String guardar;

        do {

            System.out.println("Ingrese el titulo de la Pelicula");
            String pelicula = teclado.next();
            System.out.println();
            System.out.println("Nombre del director?");
            String dire = teclado.next();
            System.out.println();
            System.out.println("Ingrese la duracion de la pellicula");
            double duracion = teclado.nextDouble();
            System.out.println();
            System.out.println("Desea agregar otr pelicula al Catalogo(si/no)");
            guardar = teclado.next();

            Pelicula a = new Pelicula(pelicula, dire, duracion);
            biblioteca.add(a);

        } while (!guardar.equalsIgnoreCase("no"));

        System.out.println("••••••");
        System.out.println("Peliculas: ");
        biblioteca.forEach((aux) -> {
            System.out.println("\n* " + aux.toString());
        });
        System.out.println();
        System.out.println("••••••");

        return biblioteca;
    }

    public void menorHora(ArrayList<Pelicula> netflix) {

        System.out.println();

        System.out.println("Peliculas que duran mas de 1 Hora");

        Collections.sort(netflix, Comparadores.ordenarPorDuracion);

        netflix.forEach((aux) -> {

            if (aux.getDuracion() > 1) {
                System.out.println("\n* " + aux.toString());
            }

        });
        System.out.println();

        System.out.println("••••••");

    }

    public void menorMayor(ArrayList<Pelicula> netflix) {
        System.out.println();

        System.out.println("Peliculas ordenadas de menor a mayor");

        Collections.sort(netflix, Comparadores.menorUnaHora);

        netflix.forEach((aux) -> {

            System.out.println("\n* " + aux.toString());

        });
        System.out.println();

        System.out.println("••••••");

    }

    public void porTitulo(ArrayList<Pelicula> netflix) {
        System.out.println();

        System.out.println("Peliculas ordenadas por Titulo");

        Collections.sort(netflix, Comparadores.porTitulo);

        netflix.forEach((aux) -> {

            System.out.println("\n* " + aux.toString());

        });
        System.out.println();

        System.out.println("••••••");
    }

    public void porDirector(ArrayList<Pelicula> netflix) {
        System.out.println();

        System.out.println("Peliculas ordenadas por Director");

        Collections.sort(netflix, Comparadores.porDirector);

        netflix.forEach((aux) -> {

            System.out.println("\n* " + aux.toString());

        });
    }

}
