/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Vehiculo;
import clases.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

/**
 * esta clase indica los atributos necesarios para crear una venta
 *
 * @author david
 */
public class Venta implements Serializable {

    //campos de la clase
    private Vehiculo v;
    private Cliente c;
    private Date fecha;
    private double precio;

    /**
     * metodo para ganerar una factura de la venta de un vehiculo a un cliente
     */
    public void generarFactura() {
        try (FileWriter fw = new FileWriter(v.getMatricula() + ".txt")) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Datos del vehículo:");
            pw.println("Matrícula: " + v.getMatricula());
            pw.println("Marca: " + v.getMarca());
            pw.println("Modelo: " + v.getModelo());
            pw.println("Potencia: " + v.getPotencia());
            pw.println("Color: " + v.getColor());
            pw.println("Año de fabricación: " + v.getFechamat());
            pw.println("Kilómetros: " + v.getKilometros());
            pw.println("Precio de venta: " + v.getPrecio());
            pw.println("Datos del comprador: ");
            pw.println("Nombre: " + c.getNombre());
            pw.println("NIF: " + c.getDni());
            pw.println("Relación con el concesionario o trabajador del mismo: " + c.getRelacion());
            pw.close();
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }//fin del metodo

    /**
     * constructor de venta
     *
     * @param v define el vehiculo utilizado
     * @param c define el cliente por el cual se ha accedido
     * @param fecha define la fecha de la venta
     * @param precio define el precio
     */
    public Venta(Vehiculo v, Cliente c, Date fecha, double precio) {
        this.v = v;
        this.c = c;
        this.fecha = fecha;
        this.precio = precio;
    }//fin dek constructor

    /**
     * getter and setter de los atributos para poder acceder a los datos
     * @return datos
     */
    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
//fin de los getter and setter
}
