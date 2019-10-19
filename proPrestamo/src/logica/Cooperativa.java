/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Jesús
 */
public class Cooperativa {
    
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Prestamo> listaPrestamos;

    public Cooperativa() {
        listaEmpleados= new ArrayList();
        listaClientes= new ArrayList();
        listaPrestamos= new ArrayList();
    }
    
    public String mostrarPrestamoClientes(){
        
        StringBuilder sb= new StringBuilder();
        
        for(Prestamo p: listaPrestamos){
            sb.append(p);
        }
        return sb.toString();
    }

    public String mostrarEmpleados(){
        StringBuilder sb= new StringBuilder();
        
        for(Empleado e: listaEmpleados){
            sb.append(e);
        }
        return sb.toString();
    }
    
    public boolean verificarIdentEmpleado(String id){
        for(Empleado e: listaEmpleados){
            if(e.getId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }
    
    public int verificarIdentCliente(String id){
        for(Cliente c: listaClientes){
            if(c.getId().equalsIgnoreCase(id)){
                return listaClientes.indexOf(c);
            }
        }
        return -1;
    }
    
    public String imprimirCuota(String id, int num){
        
        for(Prestamo p: listaPrestamos){
            if(p.getId().equalsIgnoreCase(id)){
                return p.getCuotas().get(num).toString();
            }
        }
        return null;
    }
}