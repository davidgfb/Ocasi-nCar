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
public class Turismo extends Automóvil {
    int puertas;
            
    Turismo(int puertas, String combustible, String cambio, int plazas, String matrícula, String marca, String modelo, int potencia, String color, 
            String matriculacion, int kilometraje, double precio) {
        super(combustible, cambio, plazas, matrícula, marca, modelo, potencia, color, matriculacion, kilometraje, precio);
        this.puertas=puertas;
    }
    
    @Override
    public String toString() {return "Turismo{puertas: "+puertas+super.toString()+"}";}
}
