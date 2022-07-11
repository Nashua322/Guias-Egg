/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooejercicio11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class POOEjercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        1 crear 3 variables dia mes año
        2 se usaran en el constructor date
        3 mostrar la fecha ingresada
        4 calcular diferencia entre la fecha y la actualidad
         */

        int dia;
        int mes;
        int anio;

        System.out.println("A continuacion ingresarema su fecha de nacimiento");
        System.out.println();
        System.out.println("Ingrese el Dia");
        dia = teclado.nextInt();
        System.out.println("Ingrese el mes");
        mes = teclado.nextInt();
        System.out.println("Ingrese el Año sin puntos");
        anio = teclado.nextInt();

        calcularEdad(dia, mes, anio);

    }

    static void calcularEdad(int dia, int mes, int anio) {

        // FORMATOS DE DATE : https://www.delftstack.com/es/howto/java/calendar-date-in-yyyy-mm-dd-format-in-java/
        //LocalDate da la fecha en formato yyyy/mm/dd
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        //period se usa para saber el periodo entre una fecha y otra
        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());


        /*EJEMPLO 2
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("23/12/1987", dmy);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
         */
    }

}
