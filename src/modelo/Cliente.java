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
public abstract class Cliente extends Persona {
    //relacionOcasiónCar: ninguna, empleado, familiar 
    String DNI, email; //los datos del cliente al registrarse
    int telefono; 
    Vehículo vehículo;
    
    //no borrar descuento (att interno)
    Cliente(String nombre, String DNI, String email, String clave,
            int telefono,double descuento) {super(nombre, clave, 
                    descuento);} 

    /*ArrayList buscaVehículo(String marca, String modelo) {
        return vehículo.getVehículos();
    }*/
    
    @Override
    public String toString() {return super.toString();}
}
