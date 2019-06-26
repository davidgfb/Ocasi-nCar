/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class LeeFichero {
    ArrayList arrayList;
    
    /** Carga los datos del arraylist del fichero */
    LeeFichero(String fichero) { 
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

    ArrayList getArrayList() {
        return arrayList;
    }
}
