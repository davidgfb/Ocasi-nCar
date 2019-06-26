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
public class Motocicleta extends Vehículo {
    String tipo; //tipos: ciclomotor, sport, scooter, custom, cross, trail
    int cilindrada; 
    
    public Motocicleta(String tipo, int cilindrada, String matrícula, String marca, String modelo, int potencia, String color, 
            String matriculacion, int kilometraje, double precio) {
        super(matrícula, marca, modelo, potencia, color, matriculacion, kilometraje, precio);
        this.tipo=tipo;
        this.cilindrada=cilindrada;
    }
    
    @Override
    public String toString() {return "Motocicleta{tipo: "+tipo+", cilindrada: "+cilindrada+super.toString()+"}";}
}
