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
public abstract class Automóvil extends Vehículo {
    String combustible, cambio; //combustibles: Gasolina o Diésel o Híbrido o Eléctrico, cambios: Manual o Automático
    int plazas;
    
    Automóvil(String combustible, String cambio, int plazas, String matrícula, String marca, String modelo, int potencia, 
            String color, String fechaMatriculacion, int kilometraje, double precio) {
        super(matrícula,marca,modelo,potencia,color,fechaMatriculacion,kilometraje,precio);
        this.combustible=combustible;
        this.cambio=cambio;
        this.plazas=plazas;
    }
    
    @Override
    public String toString() {
        return ", combustible: "+combustible+", cambio: "+cambio+", plazas: "+plazas+super.toString();
        
    }
}
