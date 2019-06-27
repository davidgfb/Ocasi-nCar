package clases;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * esta clase define los atributos que tiene cliente
 *
 * @author david
 */
public class Cliente implements Serializable {

    //Campos de la clase

    private String nombre;
    private String dni;
    private String relacion;
    private String correo;
    private String contraseña;
    private String telefono;

    /**
     *constructor de cliente
     * @param nombre define el nombre del cliente
     * @param dni define el dni del cliente
     * @param relacion define la relacion del cliente con la empresa
     * @param correo define el correo del cliente
     * @param contraseña define la contaseña con la que el cliente accedera a su
     * cuenta
     * @param telefono define el telefono del cliente
     */
    public Cliente(String nombre, String dni, String relacion, String correo, String contraseña, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.relacion = relacion;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
    }//fin del constructor

    /**
     * getter and setter de los atributos para poder acceder a los datos
     * @return datos
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
//fin de los getter and setter

}
