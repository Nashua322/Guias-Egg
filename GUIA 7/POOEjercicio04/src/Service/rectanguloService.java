
package Service;

import Entidad.Rectangulo;
import java.util.Scanner;


public class rectanguloService {

    public static Rectangulo crearSuperficie(Rectangulo rec1) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Valor de la Base y Altura del Rectangulo");
        rec1.setBase(teclado.nextInt());
        rec1.setAltura(teclado.nextInt());
        
        rec1.setSuperficie(rec1.getBase()*rec1.getAltura());
        System.out.println("Lo que da como resultado una superficie de: "+rec1.getSuperficie());
       
        return rec1;
    }

    public static void crearPerimetro(Rectangulo rec1) {
        double perimetro;
       
        perimetro = (rec1.getBase()*rec1.getAltura())*2;
         System.out.println("El Perimetro tiene un valor de: "+perimetro);
        

    }

    public static void crearDibujo(Rectangulo rec1) {
       

        for ( int i = 0; i < rec1.getBase(); i++) {
            for (int j = 0; j < rec1.getAltura(); j++) {
                if ((i == 0) || (i == rec1.getBase()-1) || (j == 0) || (j == rec1.getAltura()-1)) {
                    System.out.print(" *");
                    
               }else 
                   System.out.print("  ");
                }
                
             System.out.println();
            }
            
            
        }


    }

    
    
    
    

