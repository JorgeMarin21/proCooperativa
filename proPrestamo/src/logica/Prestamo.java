/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Jesús
 */
public class Prestamo {
    private String id;
    private Cliente solicitante;
    private Empleado empleado;
    private Calendar fechaAutorizacion;
    private Calendar fechaEntrega;
    private ArrayList<Cuota> cuotas;
    private double valor;

    
    public Prestamo(){
        cuotas= new ArrayList();
    }

    public Prestamo(String id, Cliente solicitante, Empleado empleado, Calendar fechaAutorizacion, Calendar fechaEntrega, ArrayList<Cuota> cuotas, double valor) {
        this.id = id;
        this.solicitante = solicitante;
        this.empleado = empleado;
        this.fechaAutorizacion = fechaAutorizacion;
        this.fechaEntrega = fechaEntrega;
        this.cuotas = cuotas;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public Cliente getSolicitante() {
        return solicitante;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Calendar getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public double getValor() {
        return valor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSolicitante(Cliente solicitante) {
        this.solicitante = solicitante;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setFechaAutorizacion(Calendar fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", solicitante=" + solicitante + ", empleado=" + empleado + ", fechaAutorizacion=" + fechaAutorizacion + ", fechaEntrega=" + fechaEntrega + ", cuotas=" + cuotas + ", valor=" + valor + '}';
    }
    
    
    
    
}
