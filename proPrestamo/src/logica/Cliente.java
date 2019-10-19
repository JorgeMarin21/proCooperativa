/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


public class Cliente extends Persona{
    private String id;

    public Cliente(String id, String nombre, long telCasa, long telMovil, String residencia) {
        super(nombre, telCasa, telMovil, residencia);
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelCasa() {
        return telCasa;
    }

    public long getTelMovil() {
        return telMovil;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelCasa(long telCasa) {
        this.telCasa = telCasa;
    }

    public void setTelMovil(long telMovil) {
        this.telMovil = telMovil;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
    
    
    @Override
    public String toString() {
        return super.toString() +"Identificación: "+ id;
    }

}
