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
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class CuentaBService {

    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public static void cuenta(CuentaBancaria comitente) {
        Scanner teclado = new Scanner(System.in);
        
        int numeroCuenta;
        
        System.out.println("Bienvenido");
        System.out.println("Para crear una Nueva Cuenta, Por Favor Ingrese los siguientes datos");
        System.out.println("Nombre Completo");
        comitente.setNombre(teclado.nextLine());
        System.out.println("D.N.I.");
        comitente.setDni(teclado.nextInt());
        numeroCuenta = (int) (comitente.getDni() + 222666);
        System.out.println("Creando Nueva Cuenta Bancaria");
        System.out.println("*****************************");
        comitente.setNumeroCuenta(numeroCuenta);
        System.out.println("Su nuevo numero de cuenta bancaria es: ");
        System.out.println(numeroCuenta);
         System.out.print("¿La cuenta tiene intereses? [y/n]: ");
        String resp = teclado.next();
        if (resp.equalsIgnoreCase("y")) {
            System.out.print("Ingrese interes de la cuenta: $");
            comitente.setInteres(teclado.nextInt());
        } else {
            comitente.setInteres(0);
        }
        System.out.println();
        
    }
    
    public static void menu() {
        System.out.println("MENU");
        System.out.println("A: Depositar Dinero");
        System.out.println("B: Retirar Dinero");
        System.out.println("C: Extraccion Rapida");
        System.out.println("D: Consulta de Saldo");
        System.out.println("E: Consulta de Datos");
        System.out.println("F: Salir");
        
    }
    
    public static void ingreso(CuentaBancaria comitente) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 0;
        comitente.setSaldoActual(teclado.nextDouble() + saldo);
        
    }
    
    public static void retiro(CuentaBancaria comitente) {
        Scanner teclado = new Scanner(System.in);
        int saldoRetiro = teclado.nextInt();
        if (comitente.getSaldoActual() > saldoRetiro) {
            System.out.println("Saldo Actual: " + comitente.getSaldoActual());
            System.out.println("RETIRO EN PROCESO");
            comitente.setSaldoActual(comitente.getSaldoActual() - saldoRetiro);
            System.out.println("Disponible " + comitente.getSaldoActual());
            
        } else if (comitente.getSaldoActual() < saldoRetiro) {
            
        }
        
    }
    
    public static void extraccionRapida(CuentaBancaria comitente) {
        Scanner teclado = new Scanner(System.in);
        
        
        double montoRetiro = teclado.nextDouble();
        
        System.out.println(comitente.getSaldoActual());
        
        if ((comitente.getSaldoActual() * 0.2) > montoRetiro) {
            comitente.setSaldoActual(comitente.getSaldoActual() - montoRetiro);
            System.out.println(comitente.getSaldoActual());
        }else{
            System.out.println("********************");
            System.out.println("Error, el monto a retirar exede el limite para extraccion rapida");
            System.out.println("El monto maximo a retirar con esta opcion es: "+comitente.getSaldoActual() * 0.2);
            System.out.println("********************");
            
    }
        
    }        

    public static void consultarSaldo(CuentaBancaria comitente) {
        
    System.out.println("Saldo Disponible");
    
        System.out.println("****");
        System.out.println("$"+comitente.getSaldoActual());
        System.out.println("****");

  
    }

    public static void consultarDatos(CuentaBancaria comitente) {
        System.out.println("Datos de la cuenta N°"+comitente.getNumeroCuenta());
        System.out.println("Nombre: "+comitente.getNombre());
        System.out.println("DNI: "+comitente.getDni());
        System.out.println("Saldo Actual: $"+comitente.getSaldoActual());
        System.out.println("Intereses: "+comitente.getInteres());
        
 
    }
    }
    

