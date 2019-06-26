/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david
 */
public class NingunaRelación extends Cliente {
    
    public NingunaRelación(String nombre, String DNI, String email, String clave,int telefono) {super(nombre, DNI, email, clave, telefono, 0);}
    
    @Override
    public String toString() {return "Ninguna{"+super.toString()+"}";}
}
