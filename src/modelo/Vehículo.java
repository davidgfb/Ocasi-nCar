package modelo;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public abstract class Vehículo implements Serializable {
    
    String matrícula, marca, modelo, color;
    int potencia, kilometraje;
    double precio;        
    String matriculacion;
       
    Vehículo(String matrícula, String marca, String modelo, int potencia, String color, String matriculacion, int kilometraje, 
            double precio) {
        this.matrícula=matrícula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.color=color;
        this.matriculacion=matriculacion;
        this.kilometraje=kilometraje;
        this.precio=precio;
    }
    
    @Override
    public String toString() {return ", matrícula: "+matrícula+", marca: "+marca+", modelo: "+modelo+", potencia: "+potencia+", color: "+color+
                ", matriculación: "+matriculacion+", kilometraje: "+kilometraje+", precio: "+precio;}
}
