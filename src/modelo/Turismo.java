/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Automovil;
import java.io.Serializable;
import javax.swing.Icon;


public class Turismo extends Automovil implements Serializable {

    

    private String puertas;

    
    public Turismo(String puertas, String combustible, String cambio, String plazas, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(combustible, cambio, plazas, matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.puertas = puertas;
    }

    
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }


}
