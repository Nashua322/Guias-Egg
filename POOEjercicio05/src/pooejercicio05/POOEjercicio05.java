/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooejercicio05;

import Entidad.CuentaBancaria;
import Service.CuentaBService;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class POOEjercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion, confirmacion = "";
        boolean salida = false;

        CuentaBancaria comitente = new CuentaBancaria();

        //ingreso de los datos y creacion de la cuenta bancaria
        CuentaBService.cuenta(comitente);

        System.out.println("Bienvenido " + comitente.getNombre());
        
        System.out.println("Sleccione la tarea a realizar");

        do {
            CuentaBService.menu();
            opcion = teclado.nextLine();

            switch (opcion) {
                case "a":
                    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
                    System.out.println("Digite el monto a depositar");
                    CuentaBService.ingreso(comitente);
                    break;
                case "b":
                    /*Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
                    restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
                    saldo actual en 0.
                    */
                    System.out.println("Digite monto a retirar");
                    CuentaBService.retiro(comitente);
                    break;
                case "c":
                    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
                    System.out.println("Extraccion Rapida (Solo permite 20% maximo de saldo disponible)");
                    CuentaBService.extraccionRapida(comitente);

                    break;
                case "d":
                    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
                    CuentaBService.consultarSaldo(comitente);
                    break;
                case "e":
                    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
                    CuentaBService.consultarDatos(comitente);
                    break;
                case "f":
                    //salida del menu 
                    System.out.println("En realidad desea salir? Presione y/n para confirmar");
                    confirmacion = teclado.next();

                    break;
                default:
                    System.out.println("****");
                    System.out.println("ERROR, ingrese un valor valido [a|b|c|f|e|f]");
                    System.out.println("****");

            }

        } while (!confirmacion.equalsIgnoreCase("y"));

        //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.     
        //CuentaBService.ingresar(comitente);
    }

}
