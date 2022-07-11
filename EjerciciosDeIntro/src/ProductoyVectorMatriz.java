
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MI EQUIPO
 */
public class ProductoyVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declaracion y creacion de un vector
        //tipo[] nombreVector = new tipo [Tamaño];
        
        //declarar un arreglo de una dimension
        int[] vector;
        //crea una memoria(contruir/dimensionar) con el vaor por defecto (cero para los enteros)
        vector = new int[2];
        //los dos pasos en una linea
        int[] producto = new int[3];
        
        //Declaracion y creacion de una matriz
        //tipo[][] nombreMatriz = new tipo[Filas][Columnas]
        
        //declaracion e inicializacion con valores predeterminados
        int[][] matriz = {{4,8,6}, {2,1,7}};
        
        //Declaracion y creacion de arreglos genericos
        //tipo[][]...[] nombreArreglo = new tipo[cardinalidad 1][Cardinalidad2]...[Cardinalidad N];
        
        System.out.println("Ingrese los valores del vector de tamaño"+vector.length+":");
        Scanner leer =new Scanner(System.in);
        //int = 0, por que los subindices de los arreglos en Java inician en cero
        for (int i = 0; i < vector. length; i++){
            System.out.println("v["+i+"]");
            //acceder al valor i del vector
            vector[i] = leer. nextInt();          
        }
                
        //Multiplica vector por matriz
        int sum;
        //... para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++) {
             sum = 0;
             //.. recorro el vector y multiplico
             for (int i = 0; i < vector.length; i++){
                 sum += vector [i] * matriz[i][j];
             }
             producto[j] = sum;
    }
        
        String aux = "" ;
        
        //Mostrar vector
        System.out.println("* Vector:");
        //bucle for "mejorado" (enhanced)
        //for (tipo elemento : arreglo)
        for (int elemento: vector ) {
            aux = aux + "  " + elemento;
            }
        System.out.println(aux);
        
        //mostrar matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        
        //Mostrar resultado
        aux = "";
        System.out.println("\n* Vector * Matriz");
        for (int elemento: producto) {
            aux += "  " + elemento;
        }
        System.out.println(aux);
            
    }
    
}
