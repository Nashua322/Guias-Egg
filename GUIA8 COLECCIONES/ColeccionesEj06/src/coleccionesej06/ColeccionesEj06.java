/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package coleccionesej06;

import Service.TienditaService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class ColeccionesEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        TienditaService almacen = new TienditaService();

        HashMap<String, Double> art = new HashMap();

        int menu;
        String salir = "no";

        System.out.println("Sistema de gestion");
        System.out.println();

        do {
            System.out.println("Seleccione una opcion");
            System.out.println();
            System.out.println("1- Agregar nuevo producto \n2- Modificar Precio "
                    + "\n3- Eliminar Producto \n4- Mostrar Productos \n5- Salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    almacen.nuevoArt(art);
                    break;
                case 2:
                    almacen.modPrecio(art);
                    break;
                case 3:
                    almacen.elimProd(art);
                    break;
                case 4:
                    almacen.mostrarProd(art);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir? si/no");
                    salir = teclado.next();
                    break;
                default:
                    System.out.println("El numero ingresado no está todavia en nuestro programa");
            }

        } while (salir.equalsIgnoreCase("no"));

    }

}
