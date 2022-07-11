/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ServiceOperacion {

    public Operacion crearOperacion() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el valor del primer y segundo numero");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        return new Operacion(numero1, numero2);
    }
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int sumar(Operacion numero1, Operacion numero2) {
        int suma;
        System.out.println("Se realizara la suma del numero ingresado A: " + numero1.getNumero1() + " y el numero B: " + numero2.getNumero2());
        suma = numero1.getNumero1() + numero2.getNumero2();

        return suma;
    }
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar(Operacion numero1, Operacion numero2) {
        int resta;
        System.out.println("Se realizara la resta del numero ingresado A: " + numero1.getNumero1() + " y el numero B: " + numero2.getNumero2());
        resta = numero1.getNumero1() - numero2.getNumero2();

        return resta;
    }
/*
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
*/
    public int multiplicar(Operacion numero1, Operacion numero2) {
        int multiplicacion;

        if (numero2.getNumero2() == 0) {
            System.out.println("ERROR: si multiplica por ¨0¨es resultado sera ¨0");
            return 0;

        } else {
            System.out.println("Se realizara la multiplicacion del numero ingresado A: " + numero1.getNumero1() + " y el numero B: " + numero2.getNumero2());
            multiplicacion = numero1.getNumero1() * numero2.getNumero2();

            return multiplicacion;
        }

    }
/*
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.    
*/
    public double dividir(Operacion numero1, Operacion numero2) {
        double division;
        if (numero2.getNumero2() == 0) {
            System.out.println("ERROR: si divides por ¨0¨es resultado sera ¨0");
            return 0;

        } else {

            System.out.println("Se realizara la division del numero ingresado A: " + numero1.getNumero1() + " y el numero B: " + numero2.getNumero2());
            division = numero1.getNumero1() / numero2.getNumero2();

            return division;
        }

    }

}
