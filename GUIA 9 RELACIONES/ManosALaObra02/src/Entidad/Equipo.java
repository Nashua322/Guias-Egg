/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


import java.util.List;

/**
 *
 * @author MI EQUIPO
 */
public class Equipo {
    
    
    private List<Jugador> equipos;

    public Equipo() {
    }

    public Equipo(List<Jugador> equipos) {
        this.equipos = equipos;
    }

    public List<Jugador> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Jugador> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Equipo{" + "equipos=" + equipos + '}';
    }

  

    
    
}
