/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.swing.Icon;

/**
 * Clase hija de vehiculo donde añadimos las caracteristicas de los automoviles
 *
 * @author david
 */
public class Automovil extends Vehiculo implements Serializable {

    //campos de la clase

    private String combustible;
    private String cambio;
    private String plazas;

    /**
     * Constructor para automovil
     *
     * @param combustible define el tipo de combustible del automovil
     * @param cambio define el tipo de cambio del automovil
     * @param plazas define el numero de plazas del automovil
     * @param matricula define la matricula del automovil
     * @param marca define la marca del automovil
     * @param modelo define el modelo del automovil
     * @param potencia defina la potenica del automovil
     * @param color define el color del automovil
     * @param fechamat define el año de matriculacion del automovil
     * @param kilometros define los kilometros del automovil
     * @param foto define la foto del automovil
     * @param precio define el precio del automivl
     */
    public Automovil(String combustible, String cambio, String plazas, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.combustible = combustible;
        this.cambio = cambio;
        this.plazas = plazas;
    }//Cierre del constructor

    /**
     * Inicio de los metodos getter and setter para acceder a los atributos de
     * automovil
     *
     * @return datos
     */
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

    //fin de los getter and setter
}
