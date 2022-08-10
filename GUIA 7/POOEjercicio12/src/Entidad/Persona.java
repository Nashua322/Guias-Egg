/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author MI EQUIPO
 */
public class Persona {
    
    private String per1;
    private Date fecha;
    private String per2;
    private Date fecha_per2;

    public Persona() {
    }

    public Persona(String per1, Date fecha, String per2, Date fecha_per2) {
        this.per1 = per1;
        this.fecha = fecha;
        this.per2 = per2;
        this.fecha_per2 = fecha_per2;
    }

    public String getPer1() {
        return per1;
    }

    public void setPer1(String per1) {
        this.per1 = per1;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPer2() {
        return per2;
    }

    public void setPer2(String per2) {
        this.per2 = per2;
    }

    public Date getFecha_per2() {
        return fecha_per2;
    }

    public void setFecha_per2(Date fecha_per2) {
        this.fecha_per2 = fecha_per2;
    }

   

   

  

  
    
    
    
    
}
