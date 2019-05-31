package modelo;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public abstract class Automóvil extends Vehículo {
    String[] combustibles={"Gasolina", "Diésel", "Híbrido", "Eléctrico"}, cambios={"Manual", "Automático"};
    String combustible, cambio; 
    int numeroPlazas;
    
    Automóvil(String combustible, String cambio, int numeroPlazas, String matrícula, String marca, String modelo, int potencia, String color, String fechaMatriculacion, int kilometraje, double precio) {
        super(matrícula,marca,modelo,potencia,color,fechaMatriculacion,kilometraje,precio);
        this.combustible=combustible;
        this.cambio=cambio;
        this.numeroPlazas=numeroPlazas;
    }
}
