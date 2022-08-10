package Service;

import Entidad.Matematica;
import java.util.Scanner;

public class MatematicaService {

    static Scanner teclado = new Scanner(System.in);

    public static void asignarNum(Matematica calculo) {

        System.out.println("•••••••••••••");
        System.out.println();
        System.out.println("Bienvenido, a continuacion se asignara un valor entre 1 y 20 a dos variables");
        System.out.println();
        System.out.println("***Asignanado***");
        calculo.setNum1(Math.random() * (50 - (-50)) + (-50));//calculo de numero random entre +50 y 50
        calculo.setNum2(Math.random() * (50 - (-50)) + (-50));
        System.out.println("Numero 1: " + calculo.getNum1());
        System.out.println("Numero 2: " + calculo.getNum2());

    }

    public static void devolverMayor(Matematica calculo) {

        System.out.println("•••••••••••••");
        System.out.println();
        System.out.println("Buscando cual es el numero mas grande entre los dos");
        System.out.println();

        if (calculo.getNum1() > calculo.getNum2()) {
            System.out.println("El primer numero: " + calculo.getNum1() + " es mas grande que el segundo numero: " + calculo.getNum2());
        } else {
            System.out.println("El segundo numero: " + calculo.getNum2() + " es mas grande que el primero: " + calculo.getNum1());
        }

    }

    public static void calcularPotencia(Matematica calculo) {

        System.out.println("•••••••••••••");
        System.out.println();
        System.out.println("Calcularemos la potencia del mayor numero elevado al segundo numero");
        System.out.println();
        System.out.println("Pero ante redondearemos los numeros");
        System.out.println();
        System.out.println("***---REDONDEANDO---***");
        calculo.setNum1(Math.round(calculo.getNum1()));//redondea .49 hacia abajo y .5 para arriba
        calculo.setNum2(Math.round(calculo.getNum2()));
        System.out.println();
        System.out.println("***CALCULANDO POTECIA***");

        if (calculo.getNum1() > calculo.getNum2()) {

            System.out.println();
            System.out.println("Haremos el calculo, numero base: " + calculo.getNum1() + " elevado al: " + calculo.getNum2());
            System.out.println();
            System.out.println("Resultado: " + Math.pow(calculo.getNum1(), calculo.getNum2()));

        } else {

            System.out.println();
            System.out.println("Haremos el calculo, numero base: " + calculo.getNum2() + " elevado al: " + calculo.getNum1());
            System.out.println();
            System.out.println("Resultado: " + Math.pow(calculo.getNum2(), calculo.getNum1()));
        }

    }

    public static void calculaRaiz(Matematica calculo) {

        double num1_abs, num2_abs;

        System.out.println("•••••••••••••");
        System.out.println();
        System.out.println("Calcularemos la Raiz cuadrada de los dos numeros");
        System.out.println();
        System.out.println("Pero antes sacaremos el valor absoluto de los numeros");
        System.out.println();
        System.out.println("***---RESOLVIENDO---***");
        System.out.println();

        System.out.println("El valor absoluto de " + calculo.getNum1() + " es: " + (num1_abs = Math.abs(calculo.getNum1())));
        System.out.println("El valor absoluto de " + calculo.getNum2() + " es: " + (num2_abs = Math.abs(calculo.getNum2())));
        System.out.println();
        System.out.println("<><><><>");
        System.out.println();
        System.out.println("La Raiz cuadrada de " + num1_abs + " es :" + Math.sqrt(num1_abs));
        System.out.println("La Raiz cuadrada de " + num2_abs + " es :" + Math.sqrt(num2_abs));

    }

}
