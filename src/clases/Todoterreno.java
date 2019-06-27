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
 * clase hija de automovil donde agregamos los parametros de los todoterrenos
 *
 * @author david
 */
public class Todoterreno extends Automovil implements Serializable {

    //Campos de la clase

    private String traccion;

    /**
     *constructor de todoterreno
     * @param traccion define la traccion del todoterreno
     * @param combustible define el tipo de combustible
     * @param cambio define el tipo de cambio
     * @param plazas define las plzas
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
    public Todoterreno(String traccion, String combustible, String cambio, String plazas, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(combustible, cambio, plazas, matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.traccion = traccion;
    }//fin del constructor

    /**
     * metodos getter and setter para acceder a los datos
     *
     * @return datos
     */
    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
 //fin de los getter and setter   

}
