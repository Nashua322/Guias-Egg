/*
12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package pooejercicio12;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author MI EQUIPO
 */
public class POOEjercicio12 {

    public static void main(String[] args) {
        /**
         * 1 crear clase persona 2 constructore, getter y setters 3 metodo
         * crearPersona() con fecha de nacimiento en Date, y con nombre completo
         * guardando en objeto 4 metodo calcularEdad() para saber edad y fecha
         * actual 5 agregar una nueva edad en el metodo menorQue(int edad), y
         * devolver true si es menor que el parametro, caso contrario false 6
         * metodo mostrarPersona(): para mostrar la persona creada en el metodo
         * anterior
         */

        Persona humano = new Persona();

        PersonaService.crearPersona(humano);

        PersonaService.calcularEdad(humano);

        PersonaService.menorQue(humano);
        
        PersonaService.mostrarPersona(humano);
    }

}
