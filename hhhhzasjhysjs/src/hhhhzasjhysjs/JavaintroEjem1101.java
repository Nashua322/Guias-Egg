/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaintroEjem11;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem1101 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
       
        String resultado = reemplazo(frase);
        System.out.println(resultado);
        
    }
    
    public static String reemplazo(String frase){
          String resultado= "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                    resultado = resultado.concat("@");
                    break;
                case "e":
                  resultado = resultado.concat("#");
                    break;  
                case "i":
                    resultado = resultado.concat("$");
                    break;
                case "o":
                    resultado = resultado.concat("%");
                    break;
                case "u":
                    resultado = resultado.concat("*");
                    break;
                default:
                    resultado= resultado.concat(frase.substring(i,i+1));
                    break;  
            }
            
            
        }  
        
        return resultado;
        
    }        
            
      
    
      

    
                
        
    }
