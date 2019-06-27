/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.swing.Icon;

public class Automovil extends Vehiculo implements Serializable {

    

    private String combustible;
    private String cambio;
    private String plazas;

    
    public Automovil(String combustible, String cambio, String plazas, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.combustible = combustible;
        this.cambio = cambio;
        this.plazas = plazas;
    }

    
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getPlazas() {
        return plazas;
    }

    public void setPlazas(String plazas) {
        this.plazas = plazas;
    }

    
}
