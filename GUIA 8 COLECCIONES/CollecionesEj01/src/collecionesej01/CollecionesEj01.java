/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package collecionesej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class CollecionesEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList<>();
        boolean salir = false;
        System.out.println("Guardaremos distintas razas de perros");

        do {
            System.out.println("Por favor seleccione una opcion \n1 Agregar nueva Raza \n2 Salir ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la nueva Raza");
                    String x = teclado.next();
                    perros.add(x);
                    break;
                case 2:
                    System.out.println("Seguro que desea salir presione y/n");
                    String opcionSalir = teclado.next();
                    if (opcionSalir.equalsIgnoreCase("y")) {
                        salir = true;
                    }
                    break;

            }

        } while (salir != true);

        System.out.println("razas agregadas");
        perros.forEach((raza) -> {
            System.out.println(raza);
        });

        /*
        2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
        un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
        está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
        ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
        la lista ordenada.
         */
        Iterator recorreIterator = perros.iterator();
        System.out.println("Razas agregadas vistas con Iterator");
        /*
        while (recorreIterator.hasNext()) {
            System.out.println(recorreIterator.next() + " ");
        }
         */

        String respSalida, razaEliminar = null;
        boolean esta = false;

        System.out.println("quiere eliminar una raza? si o no");
        respSalida = teclado.next();
        if (respSalida.equals("si")) {
            System.out.println("Ingrese la raza que desea elimminar");
            razaEliminar = teclado.next();

            Iterator<String> it = perros.iterator();
            while (it.hasNext()) {

                if (it.next().equals(razaEliminar)) {
                    it.remove();
                    esta = true;

                }

            }

        }

        if (esta == true) {
            System.out.println("la raza si estaba y queda asi");
            Collections.sort(perros);
            System.out.println(perros);
        } else {
            System.out.println("La raza no estaba y queda asi");
            Collections.sort(perros);
            System.out.println(perros);
        }

    }
}


