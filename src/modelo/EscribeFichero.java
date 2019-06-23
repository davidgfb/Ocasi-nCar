package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribeFichero {

    EscribeFichero(String cadena,String nombre) {
        //String cadena = "Esto es una cadena.";
        try { //printwriter(,true) para añadir con append
            BufferedWriter bufferWritter = new BufferedWriter(new FileWriter(nombre+".txt",true));
            bufferWritter.write(cadena+"\n");
            bufferWritter.close(); //Cerramos el stream
        } catch (IOException error) {System.out.println("Error E/S: " + 
                error.toString());}
    }
}
