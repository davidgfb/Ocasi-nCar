/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * clase hija de vehiculo donde añadimos los atributos de las motocicletas
 *
 * @author david
 */
public class Motocicleta extends Vehiculo implements Serializable {

    //Campos de la clase

    private String tipo;
    private String cilindrada;

    /**
     *constructor de motocicleta
     * @param tipo define el tipo de motocicleta
     * @param cilindrada define la cilindrada
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
    public Motocicleta(String tipo, String cilindrada, String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        super(matricula, marca, modelo, potencia, color, fechamat, kilometros, foto, precio);
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }//fin del constructor

    /**
     * metodos getter and setter para acceder a los datos
     *
     * @return datos
     */
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
//fin de los getter and setter
}
