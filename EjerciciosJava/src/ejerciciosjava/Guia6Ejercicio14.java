/*
 14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        Scanner lectura = new Scanner(System.in);

        int eleccion;

        System.out.println("Ingrese la opcion que desea realizar(1-Suma,2-Resta,3-Multiplicacion,4-Division,5-Salir): ");

        eleccion = lectura.nextInt();

        switch (eleccion) {
            case 1:

                suma();

                menu();

                break;

            case 2:

                resta();

                menu();

                break;

            case 3:

                multiplicacion();

                menu();

                break;

            case 4:

                division();

                menu();

                break;

            case 5:

                seguir();

                break;

        }

    }

    public static void seguir() {

        System.out.println("Desea seguir?: ");

        Scanner lectura2 = new Scanner(System.in);

        String continuar = lectura2.nextLine();

        if (continuar.equals("s")) {

            menu();

        } else {

            System.out.println("No se desea continuar");

        }

    }

    public static void suma() {

        Scanner lectura3 = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");

        int num1 = lectura3.nextInt();

        System.out.println("Ingrese el segundo numero: ");

        int num2 = lectura3.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado es: " + resultado);

    }

    public static void resta() {
        Scanner lectura3 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");

        int num1 = lectura3.nextInt();

        System.out.println("Ingrese el segundo numero: ");

        int num2 = lectura3.nextInt();

        int resultado = num1 - num2;

        System.out.println("El resultado es: " + resultado);

    }

    public static void multiplicacion() {

        Scanner lectura3 = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");

        int num1 = lectura3.nextInt();

        System.out.println("Ingrese el segundo numero: ");

        int num2 = lectura3.nextInt();

        int resultado = num1 * num2;

        System.out.println("El resultado es: " + resultado);

    }

    public static void division() {

        Scanner lectura3 = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");

        int num1 = lectura3.nextInt();

        System.out.println("Ingrese el segundo numero: ");

        int num2 = lectura3.nextInt();

        int resultado = num1 / num2;

        System.out.println("El resultado es: " + resultado);
    }
}
