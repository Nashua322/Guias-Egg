/*
 El estado de un objeto es una lista de variables conocidas como sus atributos, cuyos valores
representan el estado que caracteriza al objeto.

El comportamiento es una lista de métodos, procedimientos, funciones u operaciones que un
objeto puede ejecutar a solicitud de otros objetos. Los objetos también se conocen como
instancias.
 */
package Entidad;

/**
 *
 * @author MI EQUIPO
 */
public class Persona {

    public String nombre;
    public String nacionalidad;
    public String signo;
    public String persona;

   
    public Persona() {
    }

    public Persona(String nombre, String nacionalidad, String signo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.signo = signo;
    }

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

}
