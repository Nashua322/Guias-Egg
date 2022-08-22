/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Jugador {
        public static boolean getMojado;
    Scanner read=new Scanner(System.in);

    int id;
    String nombre;
    boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador "+id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public  void disparo(Revolver r){
        System.out.println("El jugador: "+nombre+" disparó...");
        mojado=r.mojar();
        r.siguienteChorro();

    }






}