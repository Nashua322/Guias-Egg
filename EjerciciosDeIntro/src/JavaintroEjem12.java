
import java.util.Scanner;

/**
 *  /*
        EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
         * @author MI EQUIPO
 */
public class JavaintroEjem12 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) { 
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
         int num1 = leer.nextInt();
         int num2 = leer.nextInt();
         esMultiplo (num1, num2);
    }
    public static void esMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println(num1+ " Es multiplo de " +num2);
        } else{
            System.out.println(num1+ " NO es multiplo de "+num2);
        }
        
    }
}
       