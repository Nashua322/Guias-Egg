/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejerciciosjava;

import java.util.Scanner;
        
/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        int num2;
     
        int opciones;
        boolean salida;
        String OpcionSalida;
        
        System.out.println("Por favor ingrese DOS numeros Entros Positivos");
        
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        salida = false;
        do{
        
            mostrarmenu();
        
        opciones = teclado.nextInt();
        switch (opciones) {
            case 1:
                System.out.println("La SUMA entre "+num1+ " y el numero "+num2+ " es :"+(num1+num2));
                break;
            case 2:
                System.out.println("La RESTA entre "+num1+ " y el numero "+num2+ " es :"+(num1-num2));
                break;
            case 3:
                System.out.println("El PRODUCTO entre "+num1+ " y el numero "+num2+ " es :"+(num1*num2));
                break;
            case 4:
                System.out.println("La DIVICIÓN entre "+num1+ " y el numero "+num2+ " es :"+(num1/num2));
                break;
            case 5:
                System.out.println("Realmente desea SALIR, presione ¨S¨para salir o ¨N¨ para continuar");
                OpcionSalida = teclado.next();
                
                 if (OpcionSalida.toUpperCase().equals("S")){
                    
                 salida = true;
                                  
                 }                    
          
                break;
             default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }
            
        }
        while (salida==false);

    
        
       
    }

    private static void mostrarmenu() {
         System.out.println("ELIJA UNA OPCION");
        System.out.println("   ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

            
        
        
    }

   
    

