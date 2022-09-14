/*
5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package exceptionej05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEj05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int conteo = 0;
        int intento;
        boolean gano = false;

        System.out.println("Jugaremos a adivinar el numero seleccionado por la maquina entre 1 y 500");
        System.out.println();

        num = (int) Math.floor(Math.random() * 500);

        while (!gano) {
            try {
                intento = teclado.nextInt();

                if (intento < num) {
                    System.out.println("el numero es MAYOR que el ingresado");

                } else if (intento > num) {
                    System.out.println("el numero es MENOR al ingresado");
                } else {
                    System.out.println("Correcto el numero era el: " + num);
                    gano=true;
                }

                conteo++;
                
            } catch (InputMismatchException e) {
                System.err.println("\nERROR: debe ingresar un numero no un caracter.");
                teclado.next();
                conteo++;

            }

        }
        System.out.println("Se intento un total de: " + conteo + " veces en encontrar el numero");

    }

}
