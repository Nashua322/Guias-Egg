/*
 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     int num;
     int numeroMax;
     num = 0;
        System.out.println("Ingrese el numero limite para despues ingresar los digitos a sumar");
        numeroMax = teclado.nextInt();
        System.out.println("Ahora comience a ingresar numeros para intentar superar el limite");
        do{
            
            num += teclado.nextInt();
            
        }while (num <= numeroMax);
        
        System.out.println("Perfecto superamos el limite que era "+numeroMax+ " con la suma que dio "+num);
    }
    
}
