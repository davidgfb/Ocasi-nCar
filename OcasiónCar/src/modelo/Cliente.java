package modelo;

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
public class Cliente extends Persona {
    String DNI, email; //debemos los datos del cliente al registrarnos
    int telefono; 
    
    Vehículo vehículo;
    
    enum relacionOcasiónCar {ninguna, empleado, familiar}; 
    String[] relacionConOcasiónCar = {"ninguna", "empleado", "familiar"};
    
    Cliente(String nombre, String clave, double descuento) {
        super(nombre, clave, descuento); //le pasamos el nombre y clave del cliente al padre Persona
    }
    
    ArrayList buscaVehículo(String marca, String modelo) {
        return vehículo.getVehículos();
    }
    
    @Override
    public String toString() {
        return "Cliente{}";
    }
}
