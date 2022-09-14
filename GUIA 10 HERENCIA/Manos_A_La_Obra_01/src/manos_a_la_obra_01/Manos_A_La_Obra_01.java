//EJERCICIO ANIMAL
//Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
//“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
//método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
//un ArrayList de animales y los siguientes animales
//Animal a = new Animal();
//Animal b = new Perro();
//Animal c = new Gato();
//Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
//método hacerRuido() de cada ítem.
package manos_a_la_obra_01;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

public class Manos_A_La_Obra_01 {

    public static void main(String[] args) {

        int cont=0;
        Animal a = new Animal();
        Perro b = new Perro();
        Gato c = new Gato();

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(a);
        animales.add(b);
        animales.add(c);

       for (Object aux : animales) {

//           if(cont==0){
//            c.hacerRuido();
//            cont++;
//            continue;
//           }
//           if(cont==1){
//            System.out.println("---------");
//            b.hacerRuido();
//            cont++;
//           continue;
//           }
//           if(cont==2){
//            System.out.println("---------");
//            a.hacerRuido();
//           }
                
           if (aux instanceof Gato) {
               Gato object = (Gato) aux;
               c.hacerRuido();
               c.comer(2);
               c.dormir(12);
               
               System.out.println("El Gato va "+c.idaAlBaño()+ " veces al baño");
               continue;
               
           }
           
            if (aux instanceof Perro) {
               Perro object = (Perro) aux;
               b.hacerRuido();
               continue;    
           }
         if (aux instanceof Animal) {
               Animal object = (Animal) aux;
               a.hacerRuido();
              
           }
       }

    }

}
