/*
 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Pi ∗ radio 2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ Pi ∗ Radio).
 */
package pooejercicio02;

import Entidad.Circunferencia;
import Servicie.ServiceCircunferencia;


/**
 *
 * @author MI EQUIPO
 */
public class POOEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceCircunferencia calculo= new ServiceCircunferencia();
        
        //<llamo al alojamiento "clase"> <nombre_variable> = <clase.nombre_funcion()>
        Circunferencia circulo = calculo.CrearCircunferencia();   //llamo a cargar la info en ServicieLibro y alojada en Libro
        
        System.out.println("Area : "+ calculo.CrearArea(circulo));
        
        System.out.println("Perimetro : "+ calculo.CrearPerimetro(circulo));
    }
    
}
