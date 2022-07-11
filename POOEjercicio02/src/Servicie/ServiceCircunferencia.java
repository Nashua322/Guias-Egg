
package Servicie;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ServiceCircunferencia {

    public Circunferencia CrearCircunferencia() {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresar el Radio del Circulo: ");
        double circulo = teclado.nextDouble();
        
        
        return new Circunferencia(circulo);
    }

    public double CrearArea(Circunferencia circulo) {
        double area, radio, pi = 3.141592654;
        radio = circulo.getRad();
        area = pi * Math.pow(radio, 2);
               
        return area;
    }

    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ Pi ∗ Radio).
    public double CrearPerimetro(Circunferencia circulo) {
         double perimetro, radio, pi = 3.141592654;
         radio = circulo.getRad();
         perimetro = 2 * pi * radio;
         
        return perimetro;
        
    }

   

        
}
