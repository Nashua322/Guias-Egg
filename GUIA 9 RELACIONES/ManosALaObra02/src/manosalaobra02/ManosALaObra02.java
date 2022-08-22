/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package manosalaobra02;


import Entidad.Equipo;
import Entidad.Jugador;
import Service.PumaService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MI EQUIPO
 */
public class ManosALaObra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        PumaService jugadores = new PumaService();
        
   
        
        List<Jugador> pumas = jugadores.agregarJugadores();
        
        
       Equipo ushuaia = new Equipo(pumas);
        
        System.out.println(ushuaia.toString());
        
    }
    
}
