/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Motocicleta extends Vehiculo implements Serializable {

    

    private String tipo;
    private String cilindrada;

    
    public Motocicleta(String tipo, String cilindrada, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

}
