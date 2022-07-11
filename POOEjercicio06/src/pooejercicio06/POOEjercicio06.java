/*6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:

• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooejercicio06;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class POOEjercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        
        CafeteraService.datosIniciales(cafe);
        String confirm  ="";
        do {
           
            System.out.println("**********************");
            System.out.println("** CAFETERIA PINGUI **");
            System.out.println("**********************");
            System.out.println();
            System.out.println("Capacidad ocupada: "+cafe.getCantidadJarros()+" Tazas");
            System.out.println();
            System.out.println("[1] Llenar cafetera.");
            System.out.println("[2] Servir en taza.");
            System.out.println("[3] Vaciar cafetera.");
            System.out.println("[4] Agregar café.");
            System.out.println("[5] Estado de cafetera.");
            System.out.println("[6] Salir.");
            System.out.println();
            System.out.print("Seleccione una opción [1|2|3|4|5|6]: ");
            int menu = teclado.nextInt();
            System.out.println();
            switch(menu) {
                case 1:
                    CafeteraService.llenarCafetera(cafe);
                    break;
                case 2:
                    CafeteraService.servirTaza(cafe);
                    break;
                case 3:
                    CafeteraService.vaciarCafetera(cafe);
                    break;
                case 4:
                    CafeteraService.agregarCafe(cafe);
                    break;
                case 5:
                    CafeteraService.estadoCafetera(cafe);
                    break;
                case 6:
                    System.out.print("¿Está seguro que desea salir? [y/n]: ");
                    confirm = teclado.next();
                    break;
                default:
                    System.out.println("Error: opción ingresada no válida.");
                    System.out.println("Presione intro para seguir...");


            }
        } while(!confirm.equalsIgnoreCase("y"));
        
        
        
        
        
        
        
        
        
    }
    
}
