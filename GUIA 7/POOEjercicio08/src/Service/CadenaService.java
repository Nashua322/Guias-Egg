/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class CadenaService {

    static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    //creacion de la nueva frase y conteo de caracteres
    public static void crearFrase(Cadena texto) {
        String newFrase;
        System.out.println("Por favor ingrese una palabra o frase para evaluar");
        System.out.println();

        newFrase = teclado.next();
        texto.setFrase(newFrase);
        int length = newFrase.length();
        texto.setLongitud(length);

    }

    public static void mostrarVocales(Cadena texto) {
        int conte = 0;

        System.out.println();
        System.out.println("Este paso mostrara cuantas vocales contiene la frase ingresada");
        System.out.println();
        String f1 = texto.getFrase();
        for (int i = 0; i < texto.getLongitud(); i++) {

            char letraActual = f1.charAt(i);
            if (esVocal(letraActual)) {
                conte++;
            }
        }
        System.out.println("********");
        System.out.println();
        System.out.println("Contando");
        System.out.println();
        System.out.println("La frase contiene: " + conte + " vocales");

    }
    //detecta si la letra actual es vocal

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());

    }

    public static void invertirFrase(Cadena texto) {
        String p1 = texto.getFrase();
        //Reemplaza las letras asentuadas
        p1 = p1.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u");

        //<variable para alojar frase> = <nuevo modificador de String(cadena)>.<voltea frase>.<imprime la frase modificada>
        String invertida = new StringBuilder(p1).reverse().toString();


        /*
                StringBuilder y StringBuffer son clases que permiten crear objetos que almacenan cadenas de 
                caracteres que pueden ser modificadas sin necesidad de crear nuevos objetos. Los métodos append, 
                replace e insert que poseen StringBuilder y StringBuffer, permiten manipular las cadenas de caracteres.

         */
        System.out.println("**************************");
        System.out.println();
        System.out.println("Frase totalmente invertida");
        System.out.println();
        System.out.println(invertida);
        System.out.println();
    }

    public static void vecesRepetido(Cadena texto) {

        String letra;

        int conte = 0;
        System.out.println("***************************");
        System.out.println();
        System.out.println("Ahora ingresaremos un caracter y buscaremos si se encuentra en la frase");
        System.out.println();
        letra = teclado.next();

//char[]=iniciamos,  vector= nombre del vector, toCharArray Convierte una cadena en un array de caracteres.
        char[] vector = texto.getFrase().toCharArray();
        for (int i = 0; i < texto.getLongitud(); i++) {

            //valueOf= metodo de String que devuelve el valor primitivo de un objeto String 
            //como un tipo de dato cadena
            String caracter = String.valueOf(vector[i]);

            if (letra.equalsIgnoreCase(caracter)) {

                conte++;

            }

        }
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("Buscando la letra: " + letra);
        System.out.println();
        System.out.println("La frase contiene: " + conte + " veces la letra " + letra);
    }

    public static void compararLongitud(Cadena texto) {

        System.out.println("*****************");
        System.out.println();
        System.out.println("Aqui compararemos la longitus de la frase anterior y una nueva");
        System.out.println();
        System.out.println("Primero ingresemos otra frase");
        System.out.println();
        texto.setNuevaFrase(teclado.next());
        int nuevafrase = texto.getNuevaFrase().length();
        System.out.println();
        System.out.println("Comparando ambras fraces");
        System.out.println();
        System.out.println("La primer frase tiene: " + texto.getLongitud()
                + " caracteres y la segunda frase tiene: " + nuevafrase);
        System.out.println();
        if (nuevafrase > texto.getLongitud()) {
            int resultado = nuevafrase - texto.getLongitud();
            System.out.println("La nueva frase es mas larga por " + resultado + " digitos");

        } else {
            int resultado = texto.getLongitud() - nuevafrase;
            System.out.println("La primer frase es mas larga por " + resultado + " digitos");
        }

    }

    public static void unirFrases(Cadena texto) {

        System.out.println("*************");
        System.out.println();
        System.out.println("Uniremos las dos frases ingresadas");
        System.out.println();
        System.out.println(texto.getFrase() + " " + texto.getNuevaFrase());

    }

    public static void reemplazar(Cadena texto) {
        String p1 = texto.getFrase();
        System.out.println("continuaremos ahora reemplazando las letras ¨a¨ por un caracter q seleccionaremos ahora");
        System.out.println();
        String letra = teclado.next();

        String c1 = texto.getFrase();
        //Reemplaza las letras asentuadas
        c1 = c1.toLowerCase().replace("a", letra);

        //<variable para alojar frase> = <nuevo modificador de String(cadena)>.<imprime la frase modificada>
        String resultado = new StringBuilder(c1).toString();

        texto.setFrase(resultado);

        System.out.println(texto.getFrase());

    }

    public static void contiene(Cadena texto) {

        String letra;
        boolean vf = false;

        int conte = 0;
        System.out.println("***************************");
        System.out.println();
        System.out.println("Ahora ingresaremos un caracter y buscaremos si se encuentra en la frase");
        System.out.println("Esto dara como resultado un valor Verdadero o Falso");
        System.out.println();
        letra = teclado.next();

//char[]=iniciamos,  vector= nombre del vector, toCharArray Convierte una cadena en un array de caracteres.
        char[] vector = texto.getFrase().toCharArray();
        for (int i = 0; i < texto.getLongitud(); i++) {

            //valueOf= metodo de String que devuelve el valor primitivo de un objeto String 
            //como un tipo de dato cadena
            String caracter = String.valueOf(vector[i]);

            if (letra.equalsIgnoreCase(caracter)) {
                vf = true;
                break;

            }

        }
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("Buscando la letra/ caracter: " + letra);
        System.out.println();
        System.out.println("RESULTADO: " + vf);

    }

}
