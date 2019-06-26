package modelo;

import java.io.*;
import java.util.*;

public class Fichero {
    static ArrayList personas;
    static ArrayList vehículos;
    static ArrayList ventas;

    //############## Ventas ################
    static public ArrayList getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList ventas) {
        this.ventas = ventas;
    }
    
    static public void guardaVentas() {
        guarda(ventas,"Ventas");
    }
    //############## Fin Ventas ################
    
    /** Da de baja un vehículo por MATRÍCULA
     * @param matrícula
     * @return boolean */
    
    /** Guarda los datos de arrayList en el fichero
     * @param arrayList
     * @param fichero */
    static public void guarda(ArrayList arrayList, String fichero) { 
        try {
            /****** Serialización de los objetos ******/
            //Serialización de las personas
            FileOutputStream FOS = new FileOutputStream(fichero+".dat"); //true no hace falta appends solo se guarda 1 vez
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            //guarda el array de personas
            OOS.writeObject(arrayList); 
            FOS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardaDatos
    
    /** Carga los datos del arraylist del fichero
     * @param arrayList
     * @param fichero */
    public void carga(ArrayList arrayList, String fichero) { 
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream FIS = new FileInputStream(fichero+".dat");
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            arrayList = (ArrayList) OIS.readObject();
            FIS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargaDatos

    //############### Personas ################
    public boolean altaPersona(Persona persona) {
        if (!personas.contains(persona)) {
            personas.add(persona);
            return true;
        } else {
            return false;
        }

    }
    
    static public void guardaPersonas() {
        guarda(personas,"Personas");
    }
    
    public ArrayList getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList personas) {
        this.personas = personas;
    }
    
    public void cargaPersonas() {
        carga(personas,"Personas");
    }
    //############### Fin Personas ################

    //############### Vehículos ################
    static public boolean bajaVehículo(String matrícula) {
        if (vehículos.contains(matrícula)) {
            vehículos.remove(matrícula);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean altaVehículo(Vehículo vehículo) {
        if (!vehículos.contains(vehículo)) {
            vehículos.add(vehículo);
            return true;
        } else {
            return false;
        }

    }
    
    public boolean cierraVenta(Venta venta) {
        if (!ventas.contains(venta)) {
            ventas.add(venta);
            return true;
        } else {
            return false;
        }

    }
    
    static public void guardaVehículos() {
        guarda(vehículos,"vehículos");
    }
    
    public void cargaVehículos() {
        carga(vehículos,"vehículos");
    }
    
    static public ArrayList getVehículos() {
        return vehículos;
    }

    public void setVehículos(ArrayList vehículos) {
        this.vehículos = vehículos;
    }
    //############### Fin Vehículos ################
}
