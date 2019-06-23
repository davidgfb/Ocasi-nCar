package modelo;


import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Venta {
    GregorianCalendar fechaVenta; 
    String datosVehículo, datosCliente; //datosCliente y datosVehiculo guardan toString     
            
    Venta(String datosVehículo, String datosCliente) {
        this.datosVehículo=datosVehículo;
        this.datosCliente=datosCliente;
    }
    
    void daBaja() {
        
    }    
}
