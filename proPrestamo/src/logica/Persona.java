/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Jesús
 */
public abstract class Persona {
    
    protected String nombre;
    protected long telCasa;
    protected long telMovil;
    protected String residencia;

    public Persona() {
    }
    public Persona(String nombre, long telCasa, long telMovil, String residencia) {
        this.nombre = nombre;
        this.telCasa = telCasa;
        this.telMovil = telMovil;
        this.residencia = residencia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "telefono: " + telCasa + "Telefono Móvil" + telMovil + "Dirección: " + residencia ;
    }
    
    
}

