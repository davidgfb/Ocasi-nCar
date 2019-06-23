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
public class Todoterreno extends Automóvil {
    String tracción; //traccion 4x2 o 4x4
    
    Todoterreno(String tracción, String combustible, String cambio, int plazas, String matrícula, String marca, String modelo, 
            int potencia, String color, String matriculacion, int kilometraje, double precio) {
        super(combustible, cambio, plazas, matrícula, marca, modelo, potencia, color, matriculacion, kilometraje, precio);
        this.tracción=tracción;
    }
    
    @Override
    public String toString() {return "Todoterreno{traccion: "+tracción+super.toString()+"}";}
}
