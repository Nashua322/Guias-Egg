/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class PersonaService {

    Scanner teclado = new Scanner(System.in);

    private Persona crearPersona() {

        Persona per = new Persona();
        boolean confir = false;

        System.out.println("Ingrese su nombre:");
        per.setNombre(teclado.next());
        System.out.println();
        System.out.println("Ingrese su Edad:");
        per.setEdad(teclado.nextInt());
        System.out.println();

        while (confir == false) {
            System.out.println("Selecione su sexo [f] Femenino | [m] Masculino | [o] Otro");
            String newSexo = teclado.next();
            if (!newSexo.equalsIgnoreCase("f") && !newSexo.equalsIgnoreCase("m") && !newSexo.equalsIgnoreCase("o")) {
                System.out.println();
                System.out.println("Error: el sexo ingresado no es válido.");
            } else {
                per.setSexo(newSexo);
                System.out.println("Sexo seleccionado: " + per.getSexo());

                confir = true;

            }

        }

        System.out.println("Ingrese su Altura");
        per.setAltura(teclado.nextDouble());
        System.out.println();
        System.out.println("Ingrese su Peso");
        per.setPeso(teclado.nextDouble());

        return per;
    }

    //Getter para el metodo crearPersona()
    public Persona getMetodCrear() {
        return crearPersona();
    }

    /*
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public int getMetodCrear(Persona vectPersona) {

        int resultado = 0; //variable para ver si esta por debajo, ideal o por encima de la media
        int imc; //valor de imc

        imc = (int) (vectPersona.getPeso() / (Math.pow(vectPersona.getAltura(), 2)));

        if (imc < 20) {
            resultado = -1;

        } else if (imc > 25 && imc < 20) {
            resultado = 0;
            vectPersona.setPesoIdeal(true);

        } else if (imc > 25) {
            resultado = 1;
        }

        return resultado;

    }

    public boolean esMayorEdad(Persona vectPersona) {
        return vectPersona.getEdad() > 17;

    }

}
