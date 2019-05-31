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
    
    Familiar(String nombre, String clave) {
        super(nombre,clave,0.1);
    }
}
