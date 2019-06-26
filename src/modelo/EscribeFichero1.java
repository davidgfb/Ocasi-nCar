package modelo;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class EscribeFichero1 implements Serializable {

    /*EscribeFichero(String cadena,String nombre) {
        //String cadena = "Esto es una cadena.";
        try { //printwriter(,true) para añadir con append
            BufferedWriter bufferWritter = new BufferedWriter(new FileWriter(nombre+".txt",true));
            bufferWritter.write(cadena+"\n");
            bufferWritter.close(); //Cerramos el stream
        } catch (IOException error) {System.out.println("Error E/S: " + 
                error.toString());}
    }*/
    /*EscribeFichero1(ArrayList arrayList,String fichero) throws Exception {  
        ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(fichero+".dat"));
        os1.writeObject(arrayList);
        os1.close();

        ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream(fichero+".dat", true)) {
            protected void writeStreamHeader() throws IOException {
                reset();
            }
        };

        os2.writeObject(arrayList);
        os2.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fichero+".dat"));
        System.out.println(is.readObject());
        System.out.println(is.readObject());
    }
*/
}
