/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Automovil;
import java.io.Serializable;
import javax.swing.Icon;

/**
 * clase hija de vehiculo donde indicamos las caracteristicas de los turismos
 *
 * @author david
 */
public class Turismo extends Automovil implements Serializable {

    //Campos de la clase

    private String puertas;

    /**
     *constructor de turismo
     * @param puertas numero de puertas que tiene el turismo
     * @param combustible define el tipo de combustible
     * @param cambio define el tipo de cambio
     * @param plazas define el numero de plazas
     * @param matricula define la matricula
     * @param marca define la marca
     * @param modelo define el modelo
     * @param potencia define la potencia
     * @param color define el color
     * @param fechamat define el año de matriculacion
     * @param kilometros define los kilometros
     * @param foto define la foto
     * @param precio define el precio
     */
    public Turismo(String puertas, String combustible, String cambio, String plazas, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(combustible, cambio, plazas, matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.puertas = puertas;
    }

    /**
     * metodos getter and setter para acceder a los datos
     *
     * @return datos
     */
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
//fin de los getter and setter

}
