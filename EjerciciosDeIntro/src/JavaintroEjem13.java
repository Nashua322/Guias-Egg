
import java.util.Scanner;

/*
 EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */

/**
 *
 * @author MI EQUIPO
 */
public class JavaintroEjem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[4];
      
        String nombre;
        int i = 0;
       /* for (int i = 0; i < 4; i++) {
            
            System.out.println("Por favor ingrese el nombre de la posicion " +i);
        
            Equipo[i] = leer.nextLine();
        }
         for (int i = 0; i < 4; i++) {
             
             System.out.print(" "+Equipo[i]);
         }
         System.out.println(" ");*/
       
       do{
           System.out.println("Por favor ingrese el nombre de la posicion " +i);
           Equipo[i] = leer.nextLine();
        if (Equipo[i].isEmpty()){
            /*System.out.println("Por favor ingrese el nombre  valido de la posicion " +i);
            */
        }else{
             i++;  
        }
       }while (i<4);
       
       for (i = 0; i < 4; i++) {
             
             System.out.print(" "+Equipo[i]);
         }
         System.out.println(" ");
       }
           
    }


    
    

