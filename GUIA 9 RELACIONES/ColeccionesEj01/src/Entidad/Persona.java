/*
   //2 clases persona y perro
        //atributos perro nombre raza edad y tamaño
        //nombre apellido edad documento y Perro
        //crear 2 personas y 2 perros
        //asignar 1 perro a cada persona
        //mostrar desde person la informacion del perro y la persona
 */
package Entidad;

/**
 *
 * @author MI EQUIPO
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascota=" + mascota + '}';
    }

    
    
    
}
