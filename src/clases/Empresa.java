/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Cliente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * en este clase crearemos los arrays y hashmap donde poder almacenar los datos
 * que se vayan introduciendo
 *
 * @author david
 */
public class Empresa implements Serializable {

    //Campos de la clase

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private HashMap<String, Cliente> clientes = new HashMap<>();
    private ArrayList<Venta> ventas = new ArrayList<>();

    /**
     * getter and setter de los atributos para poder acceder a los datos
     * @return datos
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public Empresa() {
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }
//cierre de los getter and setter

    /**
     * Metodo para saber si el vehiculo ya esta registrado o no
     *
     * @param matricula define la matricula del vehiculo que se quiere comprobar
     * @return boolean
     *
     */

    public boolean estaRegistrado(String matricula) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }//cierre del metodo

    /**
     * Metodos para cargar y guardar los datos en su respectivo array/hashmap lo
     * que nos permite que los datos no desaparezcan al cerrar el programa
     */
    public void cargarDatosClientes() {
        try (
                FileInputStream archivo = new FileInputStream("usuarios.dat")) {
            ObjectInputStream input = new ObjectInputStream(archivo);
            this.clientes = (HashMap) input.readObject();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void guardarDatosClientes() {
        try {

            FileOutputStream archivo = new FileOutputStream("usuarios.dat");
            ObjectOutputStream output = new ObjectOutputStream(archivo);
            output.writeObject(clientes);
            archivo.close();

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void cargarDatosVehiculos() {
        try (
                FileInputStream archivo = new FileInputStream("vehiculos.dat")) {
            ObjectInputStream input = new ObjectInputStream(archivo);
            this.vehiculos = (ArrayList) input.readObject();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void guardarDatosVehiculos() {
        try {

            FileOutputStream archivo = new FileOutputStream("vehiculos.dat");
            ObjectOutputStream output = new ObjectOutputStream(archivo);
            output.writeObject(vehiculos);
            archivo.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void cargarDatosVentas() {
        try (
                FileInputStream archivo = new FileInputStream("ventas.dat")) {
            ObjectInputStream input = new ObjectInputStream(archivo);
            this.ventas = (ArrayList) input.readObject();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void guardarDatosVentas() {
        try {

            FileOutputStream archivo = new FileOutputStream("ventas.dat");
            ObjectOutputStream output = new ObjectOutputStream(archivo);
            output.writeObject(ventas);
            archivo.close();

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
//cierre de los metodos de guardar y cargar

}//Cierre de la clase empresa
