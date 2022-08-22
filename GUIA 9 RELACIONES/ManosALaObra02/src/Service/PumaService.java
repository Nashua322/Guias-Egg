/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MI EQUIPO
 */
public class PumaService {

    public List<Jugador> agregarJugadores() {

         
         
         List<Jugador> pumas = new ArrayList();
         
        String nom=("gaston");
        String ape=("reale");
        String pos =("defensa");
        int num=(4);
        
        Jugador n1 = new Jugador(nom, ape, pos, num);
        pumas.add(n1);
        
        
        
        n1.setNombre("yami");
        n1.setApellido("pereyra");
        n1.setPosicion("delantera");
        n1.setNum(9);
        
        Jugador n2 = new Jugador(nom, ape, pos, num);
        pumas.add(n2);
        n1.setNombre("nico");
        n1.setApellido("poblete");
        n1.setPosicion("arco");
        n1.setNum(1);

        Jugador n3 = new Jugador(nom, ape, pos, num);
        pumas.add(n3);
        
        
        
        
        
        return pumas;
    }
    
    
    /*
        
    */
    
}
