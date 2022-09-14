/*
 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooejercicio10;

public class POOEjercicio10 {

    public static void main(String[] args) {
        /*
           1 crear 2 arreglos: 1 de 50 y otro de 20
           2 dar valores random al 1 arreglo
           3 ordenar de menor a mayor
           4 copiar los primeros 10 numeros
           5 pegar al segunoo arreglo
           6 rellenar el segundo arreglo con 0.5 en los 10 lugares vacios
           7 mostrar los 2 arreglos
         */

        //creacion de los arrays
        double[] a = new double[50];
        double[] b = new double[20];
        double[] centinela = new double[10];

        System.out.println("Creados los dos Arrays, se rellenara el primero con numeros random entre 0 y 10");

        for (int i = 0; i < 50; i++) {

            a[i] = Math.random() * 10;
            a[i] = Math.round(a[i] * 100.0) / 100.0;//redondea el decimal y deja solo 2 decimales

        }
        //impresion de los valores random
        for (int i = 0; i < 50; i++) {
            System.out.println(" [" + a[i] + "]");
        }

        //metodo For para ordenar los valores
        for (int i = 0; i < (a.length - 1); i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    //Intercambiamos valores
                    double variableauxiliar = a[i];
                    a[i] = a[j];
                    a[j] = variableauxiliar;

                }
            }
        }

        System.out.println("array ordenada");

        for (int i = 0; i < 50; i++) {
            System.out.println(a[i]);
        }

        System.out.println("•••••••••••••");
        System.out.println();
        System.out.println("copiando primeros 10 digitos para pegar en el segundo Array");

        System.arraycopy(a, 0, centinela, 0, 10);//forma sencilla de copiar los X valores de un array al otro
        System.arraycopy(centinela, 0, b, 0, 10);//copia de los 10 digitos de la centinela hacia el array b

        for (int i = 0; i < 20; i++) {

            if (b[i] == 0) {

                b[i] = 0.5;

            }

        }
        System.out.println("PRIMER ARRAY");
        for (int i = 0; i < 50; i++) {
            System.out.println(a[i]);
        }
        System.out.println("SEGUNDO ARRAY");
        for (int i = 0; i < 20; i++) {
            System.out.println(b[i]);
        }

    }

}
