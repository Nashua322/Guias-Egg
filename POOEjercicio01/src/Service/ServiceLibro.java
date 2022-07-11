/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ServiceLibro {
    
    //funcion para la carga de libros nuevos con retorno de info
    public Libro CargarLibro() {
        Scanner read = new Scanner(System.in);
        System.out.print(" Título del libro: ");
        String tit = read.nextLine(); 
        System.out.print(" Autor del libro: ");
        String autor = read.nextLine(); 
        System.out.print(" Número de páginas del libro: ");
        int n_pags = read.nextInt();
        System.out.print(" ISBN del libro: ");
        int isbn = read.nextInt(); 
        return new Libro(isbn, tit, autor, n_pags);
    }
    
    //funcion para la muestra de los datos cargados previamente en void sin retorno de info
    public void MostrarLibro(Libro libros) {
        System.out.println();
        System.out.println("DATOS DEL LIBRO.");
        System.out.println();
        System.out.println("ISBN: "+libros.isbn);
        System.out.println("Título: "+libros.titulo);
        System.out.println("Autor: "+libros.autor);
        System.out.println("Número de páginas: "+libros.n_pags);
    }

}
