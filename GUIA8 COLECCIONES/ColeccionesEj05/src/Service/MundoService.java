/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Mundo;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author MI EQUIPO
 */
public class MundoService {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public TreeSet<Mundo> guardarPais() {

        TreeSet<Mundo> continente = new TreeSet();

        String salir;
        

        System.out.println("Bienvenido a completar el nuevo mundo");
        System.out.println();

        do {
            System.out.println("Agregar nuevo pais");
            String pais = teclado.next();
            Mundo a = new Mundo(pais);
            continente.add(a);
            System.out.println("¿Desea agregar otro pais? si/no");
            salir = teclado.next();

        } while (!salir.equalsIgnoreCase("no"));

        System.out.println();
        System.out.println("Paises: ");

        for (Mundo aux : continente) {
            System.out.println(aux.toString());

        }

        return continente;
    }

    public String nuevoPais(TreeSet<Mundo> planeta) {

        String nuevoPais;

        System.out.println("Ingresaremos un nuevo pais para eliminarlo");
        System.out.println();
        nuevoPais = teclado.next();

        return nuevoPais;
    }

    public void eliminarPais(TreeSet<Mundo> planeta, String nuevoPais) {
        boolean centinela = false;
        /* TreeSet<String> xx = new TreeSet();
        xx.add(nuevoPais);
         */
        Iterator<Mundo> it = planeta.iterator();
        System.out.println();
        System.out.println("Verificamos si el pais se encuentra");
        System.out.println();
        while (it.hasNext()) {

            Mundo aux = it.next();
            if (aux.getPais().equalsIgnoreCase(nuevoPais)) {
                it.remove();
                centinela = true;
                break;
            }
        }

       if(centinela==true){
           System.out.println();
           System.out.println("El pais se elimino CORRECTAMENTE");
            System.out.println();
        System.out.println("Paises: ");

        for (Mundo aux : planeta) {
            System.out.println(aux.toString());

        }
       }else{
           System.out.println();
           System.out.println("El pais no estaba en la lista");
       }
               

    }

}
