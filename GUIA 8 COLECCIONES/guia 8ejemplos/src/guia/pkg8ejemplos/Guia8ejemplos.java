/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author MI EQUIPO
 */
public class Guia8ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> frase = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
         */
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x);

        System.out.println("agregamos 5 numeros");
        for (int i = 1; i < 6; i++) {
            x = teclado.nextInt();
            numerosA.add(x);

        }

        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        System.out.println("agregamos 5 numeros mas");
        for (int i = 1; i < 6; i++) {
            y = teclado.nextInt();
            numerosB.add(y);

        }

        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 33444808;
        String nombreAlumno = "Gaston";
        alumnos.put(y, nombreAlumno);
        /*
        System.out.println("agregamos 5 numeros y nombres mas");
        for (int i = 1; i < 6; i++) {

            System.out.println("Agregar dni");
            dni = teclado.nextInt();
            System.out.println("Agregar nombre");
            nombreAlumno = teclado.next();
            alumnos.put(y, nombreAlumno);
            

        }
         */
 /*
        System.out.println("NUMEROS A");
        for (int i = 0; i < 6; i++) {
        System.out.println(numerosA);
        }
        System.out.println("NUMEROS B");
        for (int i = 0; i < 6; i++) {
        System.out.println(numerosB);
        }
        System.out.println("DNI Y NOMBRES");
        for (int i = 0; i < 6; i++) {
        System.out.println(alumnos);
        }
         */

        System.out.println("NUMEROS A");
        for (Integer numA : numerosA) {
            System.out.println(numA);
        }

        System.out.println("NUMEROS B");
        numerosB.forEach((numB) -> {
            System.out.println(numB);
        });

        alumnos.entrySet().forEach((entry) -> {
            System.out.println("Documento = " + entry.getKey()
                    + ", Nombre = " + entry.getValue());
        });

        // MANOS A LA OBRA PAG 11
        HashSet<String> personas = new HashSet();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.add(n1);
        personas.add(n2);

        //MANOS A LA OBRA PAG 12
        ArrayList<String> bebidas = new ArrayList<>();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }

        }

        //ORDENAR COLECCIONES   PAG.12
        //EJ.:
        //LISTAS:
        ArrayList<Integer> numeros = new ArrayList();
        Collections.sort(numeros);

        //CONJUNTOS
        HashSet<Integer> numerosSet = new HashSet();
        //Se convierte el HashSet a Lista para poder Ordenar
        //en CONJUNTOS no funciona el .sort()
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        Collections.sort(numerosLista);

        //MAPAS
        HashMap<Integer, String> estudiantes = new HashMap();
        //Se convierte el HasMap a TreeMap
        TreeMap<Integer, String> estudiantesTree = new TreeMap();
        //TreeMap se ordenana por si mismos

        /*AÑADIR UN OBJETO A UNA COLECCIÓN PAG.13
        //Para añadir un objeto a una colección tenemos que primero crear el 
        //objeto que queremos trabajar y después crear una colección donde su 
        //tipo de dato sea dicho objeto.
        //EJ.:
        //LISTAS
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        libros.add(libro);
        
        //CONJUNTOS:
        HashSet<Perro> perros = new HashSet();
        Perro perro = new Perro();
        perros.add(perro);
        
        //MAPAS:
        HashMap<Integer, Compañero> compañeros = new HashMap();
        int dni = 33444808;
        Compañero compañero = new Compañero("Pepe", "Honguito");
        compañeros.put(dni,compañero);
        
         */
    }
}
