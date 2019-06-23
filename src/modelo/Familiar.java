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
public class Familiar extends Cliente { //extiende a Cliente ya que tiene descuento en la compra
    Familiar(String nombre, String DNI, String email, String clave, 
            int telefono) {super(nombre, DNI, email, clave, telefono, 0.1);}
    
    @Override
    public String toString() {return "Familiar{"+super.toString()+"}";}
}
