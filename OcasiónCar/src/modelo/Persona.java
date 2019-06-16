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
public class Persona {
   String nombre, clave;
   double descuento;
    
    Persona(String nombre, String clave, double descuento) {
        this.nombre=nombre; //el nombre del objeto instanciado administrador o cliente sera el de persona
        this.clave=clave;
        this.descuento=descuento;
    }
    
    void compraVehículo() {
        
    }
    
    void busca() {
        
    }
    
    void sal() {
        
    }
    
    @Override
    public String toString() {return "nombre: "+nombre+", clave: "+clave+
            ", descuento: "+descuento;}
}
