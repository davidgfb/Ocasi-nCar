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
    String[] tracciones={"4x2","4x4"};
    String tracción;
    
    Todoterreno(String tracción,String combustible, String cambio, int nPlazas,String matrícula, String marca, String modelo, int potencia, String color, String fechaMatriculacion, int kilometraje, double precio) {
        super(combustible, cambio, nPlazas,matrícula,marca,modelo,potencia,color,fechaMatriculacion,kilometraje,precio);
        this.tracción=tracción;
    }
    
    @Override
    public String toString() {
        return "Todoterreno{traccion: "+tracción+"}";
    }
}
