/*
EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num1 , centinela, suma;
        centinela = 0;
        suma = 0;
        System.out.println("Por favor ingrese 20 numeros del 1 en adelante y coloque el 0 par salir");
        do {
            num1 = leer.nextInt();
            if (num1 > 0 ){
                suma += num1;          
            }
            centinela++;     
        } while(num1 != 0 && centinela < 20);
        if(num1 == 0){
            System.out.println("Se presiono el numero 0");
        }
        System.out.println("La suma de los valores ingresados es: " + suma);
            
    }
    
}
