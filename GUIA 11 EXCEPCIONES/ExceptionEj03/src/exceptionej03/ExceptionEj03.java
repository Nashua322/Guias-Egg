/*
3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package exceptionej03;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ExceptionEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner teclado = new Scanner(System.in);
    
    String num1;
    String num2;
    
    try{
        
          System.out.println("Ingrese 2 frases");
        num1 = teclado.nextLine();
        num2 = teclado.nextLine();
        
    
        int nume1=parseInt(num1);
        int nume2=parseInt(num2);
        
        System.out.println("Dividimos los dos numeros y el resultado es: "+ nume1/nume2);
        
    }catch(InputMismatchException e){
        System.out.println(e.getMessage());
        
    }catch(NumberFormatException a){
        System.out.println(a.getMessage());
        
    }catch (ArithmeticException i){
        System.out.println(i.getMessage());
    }
    
   
    }
    
}
