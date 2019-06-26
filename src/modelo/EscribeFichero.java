package modelo;

import java.io.*;
import java.util.*;

public class EscribeFichero {
    /** Da de baja una MATRÍCULA
     * @param objper
     * @return boolean 
    public static boolean bajaPersona(Persona objper) {
        if (personas.contains(objper)) {
            personas.remove(objper);
            return true;
        } else {
            return false;
        }
    }*/

    /** Guarda los datos de arrayList en el fichero */
    EscribeFichero(ArrayList arrayList, String fichero) { 
        try {
            /****** Serialización de los objetos ******/
            //Serialización de las personas
            FileOutputStream FOS = new FileOutputStream(fichero+".dat",true); //true
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
}
