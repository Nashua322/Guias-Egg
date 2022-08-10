/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class AlumnoService {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {

        System.out.println("Bienvenido al sistema de creacion de alumnos");
        String resp;
        ArrayList<Alumno> estudiante = new ArrayList();

        do {
            System.out.println("Ingrese el nombre del Alumno");
            String nombre = teclado.next();
            System.out.println("Ingrese la nota del primer Trimestre");
            int nota1 = teclado.nextInt();
            System.out.println("Ingrese nota del Segundo Trimestre");
            int nota2 = teclado.nextInt();
            System.out.println("Ingrese la nota del tercer Trimestre");
            int nota3 = teclado.nextInt();
            int promedio = (nota1 + nota2 + nota3) / 3;

            Alumno a = new Alumno(nombre, nota1, nota2, nota3, promedio);
            estudiante.add(a);
            System.out.println("¿Desea crear otro alumno?");
            resp = teclado.next();
            teclado.nextLine();

        } while (!resp.equalsIgnoreCase("no"));

        System.out.println(" ");
        System.out.println("Alumnos: ");
        estudiante.forEach((aux) -> {
            System.out.println("* " + aux.toString());
        });
        System.out.println("");
        return estudiante;

    }

    
    public void promedio(ArrayList<Alumno> estudiantes) {

        Iterator<Alumno> it = estudiantes.iterator();
        String nombreAlumno;

        System.out.println("Ingrese nombre de alumno para saber nota final");
        nombreAlumno = teclado.nextLine();
        //System.out.println(StringEscapeUtils.escapeJava(nombreAlumno)



        for (Alumno estudiante : estudiantes) {
                   
            if (estudiante.getAlumno().equals(nombreAlumno)) {
                System.out.println(estudiante.getPromedio());

            }

        }

        
        while (it.hasNext()){
            
            Alumno aux = it.next();
            if (aux.getAlumno().equals(nombreAlumno)) {
                System.out.println(" Nota final del alumno " +nombreAlumno +  " es de: " +aux.getPromedio() );
                
            } else {
                System.out.println("El alumno ingresado no existe");
            }
        }
    }


    /*public void promedio(Alumno estudiante) {

        String nombreAlumno;

        System.out.println("Ingrese nombre de alumno para saber nota final");
        nombreAlumno = teclado.next();

        
        for (Object object : col) {
            
        }
        
        
        
        
        
        
        
    }*/

}
