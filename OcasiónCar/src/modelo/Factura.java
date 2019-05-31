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
public class Factura extends Venta {
    double precio;
    
    String ficheroTexto;
    
    Factura(String datosVehículo, String datosCliente, double precio) {
        super(datosVehículo, datosCliente);
        this.precio=precio;
    }
    
}
