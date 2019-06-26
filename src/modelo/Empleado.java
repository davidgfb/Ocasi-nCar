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
public class Empleado extends Persona { 
    String email;
    int telefono;
    
    public Empleado(String nombre, String DNI, String email, String clave,int telefono) {
        super(nombre, clave, 0.25, DNI);
        this.email=email;
        this.telefono=telefono;
    }
    
    @Override
    public String toString() {return "Empleado{"+super.toString()+"}";}
}
