package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Persona implements Serializable {
   String DNI, nombre, clave;
   double descuento;
   ArrayList personas;
    
    Persona(String nombre, String clave, double descuento, String DNI) {
        this.nombre=nombre; //el nombre del objeto instanciado administrador o cliente sera el de persona
        this.clave=clave;
        this.descuento=descuento;
        this.DNI=DNI;
    }
    
    public ArrayList getPersonas() {
        return personas;
    }
    
    void setPersonas(ArrayList personas) {
        personas=this.personas;
    }
       
    @Override
    public String toString() {return "nombre: "+nombre+", clave: "+clave+", descuento: "+descuento;}
}
