/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int buscar;
        int numeroAleatorio;
        int tamanioVector;
        
        System.out.println("Seleccione el tamaño del vector a rellenar");
        tamanioVector = teclado.nextInt();
        
         System.out.println("ingrese el numero que desea buscar");
        buscar= teclado.nextInt();
        
        
        int []vector= new int[tamanioVector];
        int posicionBuscar = -1;
        boolean repetido = false;
        for (int i=0; i<tamanioVector-1; i++){
            //el num aleatorio devuelbe un double por eso lo puse asi.
            numeroAleatorio = (int) (Math.random()*10+1);
            vector[i]=numeroAleatorio ;
            System.out.print("["+numeroAleatorio+"]");
        }
        System.out.println("");
        
       
        
        for (int i=0; i<tamanioVector-1; i++){
            if (vector[i] == buscar && posicionBuscar == -1){
                posicionBuscar = i;
            } else if (vector[i] == buscar && posicionBuscar != -1) {
                repetido = true;
            }
        }
        if (posicionBuscar != -1) {
            System.out.println("El numero "+buscar+" se encontro en la posicion "+posicionBuscar);
            if (repetido) {
                System.out.println("Y se encontro mas de una vez");
            }
        } else {
            System.out.println("El numero "+buscar+" no se encontro en el arreglo");
        }
    }
}