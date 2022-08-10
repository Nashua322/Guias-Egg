/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author MI EQUIPO
 */
public class Alumno {
    
    private String alumno;
    private int nota1;
    private int nota2;
    private int nota3;
    private int promedio;

    public Alumno() {
    }

    public Alumno(String alumno, int nota1, int nota2, int nota3, int promedio) {
        this.alumno = alumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno: " + alumno + "--> nota 1 = " + nota1 + ", nota 2 = " + nota2 + ", nota 3 = " + nota3 + " \n        Promedio = " + promedio;
    }
    
            
    
    
    
    
}
