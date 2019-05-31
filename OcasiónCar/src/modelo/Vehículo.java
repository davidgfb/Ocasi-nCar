package modelo;


import java.util.ArrayList;
import java.util.Date;
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
public abstract class Vehículo {

    ArrayList vehículos;
    String matrícula, marca, modelo, color;
    int potencia, kilometraje;
    double precio;        
    String fechaMatriculacion;
       
    Vehículo(String matrícula, String marca, String modelo, int potencia, String color, String fechaMatriculacion, int kilometraje, double precio) {
        this.matrícula=matrícula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.color=color;
        this.fechaMatriculacion=fechaMatriculacion;
        this.kilometraje=kilometraje;
        this.precio=precio;
    }
    
    ArrayList getVehículos() {
        return vehículos;
    }
    
    @Override
    public String toString() {
        return "Vehículo{}";
    }
}
