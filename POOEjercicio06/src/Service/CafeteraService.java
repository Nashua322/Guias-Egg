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
package Service;

import Entidad.Cafetera;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class CafeteraService {

    public static void datosIniciales(Cafetera cafe) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al novedoso sistema de Autoservicio de cafe");
        System.out.println();
        System.out.println("Ingrese la capacidad maxima de su Cafetera en Litros(MAX 4L): ");
        cafe.setCapacidadMaxima(teclado.nextInt());
        System.out.println();
        System.out.println("con la cantidad de " + cafe.getCapacidadMaxima() + " Litros");
        System.out.println();
        System.out.println("Seleccione el Jarro [1] de  100ml o [2] de 200ml");

        int taza = 0;
        do {
            taza = teclado.nextInt();

            switch (taza) {
                case 1:
                    System.out.println("[1]: Rinde en: " + cafe.getCapacidadMaxima() * 10 + " Tazas de 100ml.");
                    cafe.setTamañoTaza(100);
                    break;
                case 2:
                    System.out.println("[2]: Rinde en: " + cafe.getCapacidadMaxima() * 5 + " Tazones de 200ml.");
                    cafe.setTamañoTaza(200);
                    break;
                default:
                    System.out.println("Error ingrese opcion [1] o [2]");
                    break;
            }

        } while (taza < 0 || taza > 2);

        cafe.setCantidadActual(0);
        cafe.setCantidadJarros(0);

    }

    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public static void llenarCafetera(Cafetera cafe) {

        System.out.println("Rellenando la cafetera al maximo con: " + cafe.getCapacidadMaxima() + " Litros de cafe");
        cafe.setCantidadActual(cafe.getCapacidadMaxima() * 1000);
        cafe.setCantidadJarros(cafe.getCantidadActual() / cafe.getTamañoTaza());
        System.out.println();
        System.out.println("Proceso completado con exito");
        System.out.println();

    }

    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
     */
    public static void servirTaza(Cafetera cafe) {
        System.out.println();
        System.out.println("Llenando la taza");
        System.out.println("AGUARDE POR FAVOR");
        System.out.println();
        cafe.setCantidadActual(cafe.getCantidadActual() - cafe.getTamañoTaza());
        cafe.setCantidadJarros(cafe.getCantidadJarros() - 1);
        System.out.println("Cafe listo");
        System.out.println();
        System.out.println("Cafe Restante: " + cafe.getCantidadActual() + " Ml.");
        System.out.println();
        System.out.println(cafe.getCantidadJarros() + " Tazas restantes");
        System.out.println();
        System.out.println("*******");
        System.out.println("GRACIAS");
        System.out.println("*******");
        System.out.println();

    }

    //• Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public static void vaciarCafetera(Cafetera cafe) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esta seguro de querer vaciar la cafetera?y/n");
        System.out.println();
        String confirmacion = teclado.nextLine();

        if (confirmacion.equalsIgnoreCase("y")) {

            System.out.println("Vaciando cafetera");
            cafe.setCantidadActual(0);
            cafe.setCantidadJarros(0);

        }
        System.out.println("Volviendo al menu principal");
        System.out.println();
        System.out.println("*******");
        System.out.println("GRACIAS");
        System.out.println("*******");
        System.out.println();

    }

    //• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public static void agregarCafe(Cafetera cafe) {
        Scanner teclado = new Scanner(System.in);

        double canTaza = 0;
        System.out.println("Esta opcion agrega cafe en cantidad de tazas");
        System.out.println();
        System.out.println("Usted tiene seleccionado el tamaño de: " + cafe.getTamañoTaza() + " Ml.");
        System.out.println();
        System.out.println("Seleccione la cantidad de tazas a agregar");
        canTaza = teclado.nextDouble(); //seleccionando cant de tazas
        if ((canTaza * cafe.getTamañoTaza()) + cafe.getCantidadActual() < 4000) {

            cafe.setCantidadJarros(canTaza);
            cafe.setCantidadActual(canTaza * cafe.getTamañoTaza());
            System.out.println("Agregando: " + canTaza + " Tazas, y un total de: " + cafe.getCantidadActual() + " Ml a su cafetera");
            System.out.println();
        } else {

            System.out.println("Esa cantidad supera el tamaño maximo de su Cafetera");

        }
        System.out.println();
        System.out.println("*******");
        System.out.println("GRACIAS");
        System.out.println("*******");
        System.out.println();

    }

    //Indica el estado actual de la cafetra y cant de cafe y tazas
    public static void estadoCafetera(Cafetera cafe) {

        System.out.println("ESTADO ACTUAL DE SU CAFETERA");
        System.out.println();
        System.out.println("Tamaño maximo de su cafetera: " + cafe.getCapacidadMaxima() + " Ml de cafe");
        System.out.println();
        System.out.println("Cantidad actual de Cafe: " + cafe.getCantidadActual() + " Ml de cafe");
        System.out.println();
        System.out.println("Tamaño de taza seleccionada: " + cafe.getTamañoTaza() + " Ml c/u");
        System.out.println();
        System.out.println("Cantidad de Tazas disponibles: " + cafe.getCantidadJarros() + " tazas");
        System.out.println();
        System.out.println("*******");
        System.out.println("GRACIAS");
        System.out.println("*******");
        System.out.println();

    }

}
