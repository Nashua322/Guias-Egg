/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooejercicio01;

import Entidad.Libro;
import Service.ServiceLibro;

/**
 *
 * @author MI EQUIPO
 */
public class POOEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //<llamo al Servicio "clase"> <nombre_variable>  = new <llamada al servicio()>
        ServiceLibro servicio = new ServiceLibro();   //importo la informacion cargada en ServiceLibro
         
        //<llamo al alojamiento "clase"> <nombre_variable> = <clase.nombre_funcion()>
        Libro libros = servicio.CargarLibro();   //llamo a cargar la info en ServicieLibro y alojada en Libro
        
        //<nombre_variable> . <nombre_funcion(parametros)>
        servicio.MostrarLibro(libros);
    }

}
