package Service;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    static Scanner teclado = new Scanner(System.in);

    public static void crearPersona(Persona humano) {

        System.out.println("Ingresar Nombre completo de la persona a crear");
        humano.setPer1(teclado.nextLine());
        System.out.println("Ahora ingresaremos la Fecha de nacimiento, presione Enter");
        teclado.nextLine();
        System.out.println("Año de nacimiento sin coma ni punto");
        int anio = teclado.nextInt();
        System.out.println("Mes de nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Dia de nacimiento");
        int dia = teclado.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        humano.setFecha(fechaNac);

    }

    public static void calcularEdad(Persona humano) {

        Date fechaHoy = new Date();

        int diferencia = (fechaHoy.getYear() - humano.getFecha().getYear());

        System.out.println(humano.getPer1() + " tiene : " + diferencia + " años");
    }

    public static void menorQue(Persona humano) {

        System.out.println("AHora ingresaremos otra edad para comparar cual de los dos es menor, Presione Enter");
        teclado.nextLine();
        System.out.println("Ingresar Nombre completo de la persona a crear");
        humano.setPer2(teclado.nextLine());
        System.out.println("Año de nacimiento sin coma ni punto");
        int anio = teclado.nextInt();
        System.out.println("Mes de nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Dia de nacimiento");
        int dia = teclado.nextInt();

        Date fechaNac = new Date(anio - 1900, mes - 1, dia);

        humano.setFecha_per2(fechaNac);

        LocalDate fechaPer1 = humano.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaPer2 = humano.getFecha_per2().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Period periodo = Period.between(fechaPer1, fechaPer2);

        if (periodo.getYears() < 0) {

            System.out.println(humano.getPer1() + " es menor que la ingresada ultima: " + humano.getPer2());

        } else if (periodo.getYears() > 0) {
            System.out.println(humano.getPer2() + " es menor que :" + humano.getPer1());

        } else {
            System.out.println("Los dos tienen la misma edad");
        }

    }

    public static void mostrarPersona(Persona humano) {

        System.out.println("La persona creada en el metodo anterior se llama: " + humano.getPer2());

        Date fechaHoy = new Date();

        int diferencia = (fechaHoy.getYear() - humano.getFecha_per2().getYear());

        System.out.println(humano.getPer2() + " tiene : " + diferencia + " años");

    }

}
/*
mientras mas grande negativo
Ingresar Nombre completo de la persona a crear
jnhsjns
Ahora ingresaremos la Fecha de nacimiento, presione Enter

Año de nacimiento sin coma ni punto
1987
Mes de nacimiento
12
Dia de nacimiento
23
jnhsjns tiene : 35 años
AHora ingresaremos otra edad para comparar cual de los dos es menor, Presione Enter
Año de nacimiento sin coma ni punto
1987
Mes de nacimiento
12
Dia de nacimiento
16
-7
 */
