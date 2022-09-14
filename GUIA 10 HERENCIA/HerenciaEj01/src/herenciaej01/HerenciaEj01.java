//1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
//siguiente:
package herenciaej01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author MI EQUIPO
 */
public class HerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doverman");
        perro1.Alimentarse();
        
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
        
        //Declaracion del obketo Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
        
        
    }
    
}
