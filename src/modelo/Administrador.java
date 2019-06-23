package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Administrador extends Persona {
    String DNI,email="admin@ocasioncar.com";
    int telefono;
    //le pasamos el nombre y clave del administrador al padre Persona
    Administrador(String nombre, String DNI, int telefono) {
        super(nombre,"admin",0.25);
        this.DNI=DNI;
        this.telefono=telefono;
    }
    
    void altaVehículo() {
        
    }
    
    void daBaja() {
        
    }
    
    void consultaVehículo() {
        
    }
    
    void consultaVentas() {
        
    }
    
    @Override
    public String toString() {return "Administrador{DNI: "+DNI+
            ", email: "+email+", telefono: "+telefono+", "+
            super.toString()+"}";}
}
