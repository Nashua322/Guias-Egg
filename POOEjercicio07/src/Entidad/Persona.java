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
public class Persona {
    
    private String nombre;
    private String sexo;
    private int edad;
    private double altura;
    private double peso;
    private boolean pesoIdeal;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double altura, double peso, boolean pesoIdeal) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.pesoIdeal = pesoIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(boolean pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }
    
    
    
    
    
}
