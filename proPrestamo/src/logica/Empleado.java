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
public class Empleado extends Persona {
    
    private double salBase;
    private String id;
    private String password;
    private boolean activo;

    public Empleado(double salBase, String id, String password, String nombre, long telCasa,long telMovil, String residencia) {
        super(nombre, telCasa, telMovil, residencia);
        this.salBase = salBase;
        this.id = id;
        this.password = password;
        this.activo = true;
    }

    public double getSalBase() {
        return salBase;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActivo() {
        return activo;
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

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
    
    

//    @Override
//    public String toString() {
//        return super.toString() +"Salario Base: " + salBase + "Identificación: " + id ;
//    }

    @Override
    public String toString() {
        return super.toString()+ "Salario Base: " + salBase + "Identificación: " + id + "Activo: " + activo ;
    }
    
    

    

   
    
    







}
