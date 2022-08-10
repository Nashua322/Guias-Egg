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
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int n_pags;

    public Libro(int isbn, String titulo, String autor, int n_pags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.n_pags = n_pags;
    }

    public Libro() {
    }
}
