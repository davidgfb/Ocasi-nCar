/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.Serializable;
import javax.swing.Icon;

/**
 * esta clase define los parametros que deben de tener todos los vehiculos
 *
 * @author david
 */
public class Vehiculo implements Serializable {

    //Campos de la clase

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private String color;
    private int fechamat;
    private int kilometros;
    private Icon foto;
    private int precio;

    /**
     * constructor para vehiculo
     *
     * @param matricula define la matricula del vehiculo
     * @param marca define la marca del vehiculo
     * @param modelo define el modelo del vehiculo
     * @param potencia define la potencia del vehiculo
     * @param color define el color del vehiculo
     * @param fechamat define el año de matriculacion del vehiculo
     * @param kilometros define los kilometros del vehiculo
     * @param foto define la foto del vehiculo
     * @param precio define el precio del vehiculo
     */

    public Vehiculo(String matricula, String marca, String modelo, int potencia, String color, int fechamat, int kilometros, Icon foto, int precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.fechamat = fechamat;
        this.kilometros = kilometros;
        this.foto = foto;
        this.precio = precio;
    }//fin del constructor

    /**
     * Inicio de los metodos getter and setter para acceder a los atributos de
     * vehiculo
     *
     * @return datos
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFechamat() {
        return fechamat;
    }

    public void setFechamat(int fechamat) {
        this.fechamat = fechamat;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
//fin de los getter and setter

    @Override

    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", color=" + color + ", fechamat=" + fechamat + ", kilometros=" + kilometros + ", foto=" + foto + ", precio=" + precio + '}';
    }

}
