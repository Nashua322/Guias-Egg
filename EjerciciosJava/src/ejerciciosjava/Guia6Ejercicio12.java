/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Guia6Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;
        String codigo;
        
        do{
            System.out.println("Ingrese un codigo de 5 digitos");
             codigo = read.nextLine();
            if (codigo.length()==5){
                String primerDigito = codigo.substring(0, 1);
                String ultimoDigito = codigo.substring(4);
                System.out.println(" primer "+ primerDigito + " segundo " + ultimoDigito);
                    if (primerDigito.equalsIgnoreCase("x") & ultimoDigito.equalsIgnoreCase("o")){
                        
                        contadorCorrecto = contadorCorrecto+1;
                        
                    }else{
                        
                        contadorIncorrecto = contadorIncorrecto + 1;
                        
                    }
                
            }else {
                System.out.println("Ingrese un codigo con la cantidad de digitos correctos");
            }
        }while(!codigo.equals("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas fue: " + contadorCorrecto );
        System.out.println("La cantidad de lecturas incorrectas fue: " + contadorIncorrecto );
        
        
    }
    
}

            
    
