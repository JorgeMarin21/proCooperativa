/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


public class Administrador {
    
    private static final String ID="jesusdlr";
    private final String PASSWORD="12345";

    public Administrador() {
    }

    public String getId() {
        return ID;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public boolean agregarEmpleado(Empleado e){
        return true;
    }
    
    public boolean destituirEmpleado(Empleado e){
        return true;
    }
    
    
}
