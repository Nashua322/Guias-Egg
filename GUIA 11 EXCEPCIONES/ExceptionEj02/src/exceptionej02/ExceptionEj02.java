/*
2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

package exceptionej02;



public class ExceptionEj02 {

    public static void main(String[] args) {
        
        int[] array1 = new int[5];
        
        try{
            array1[8]=6;
            
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Fuera de rango");
        }
        
        
        
        
        
    }
    
}
