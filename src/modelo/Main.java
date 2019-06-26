package modelo;

import java.io.File;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Main {
    String archivo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //################# VEHÍCULOS ##################
        /*File archivo1 = new File("vehículos.dat");
        
        archivo1.delete();*/
        
        /*ArrayList<Vehículo> vehículos = new ArrayList<>();
        
        Vehículo vehículo1 = new Todoterreno("2x4","Gasolina","manual",5,"9565FMY","Toyota","Avensis",300,"Plata","25/06/1999",250000,15000);
        Vehículo vehículo2=new Todoterreno("2x4","Gasolina","manual",5,"9564FMY","Toyota","Avensis",300,"Plata","25/06/1999",250000,15000);
        Vehículo vehículo3=new Todoterreno("4x4","Híbrido","manual",5,"9563FMY","Tesla","Model",500,"Rojo","25/06/1999",250000,15000);
        Vehículo vehículo4=new Turismo(5,"Eléctrico","automático",5,"0450GNZ","Tesla","Model 3",500,"Rojo","17/05/2018",0,30000);
        Vehículo vehículo5=new Turismo(5,"Eléctrico","automático",5,"0455GNZ","Tesla","Model 3",500,"Rojo","17/05/2018",0,30000);
        Vehículo vehículo6=new Turismo(6,"Diésel","automático",5,"0454GNZ","Tesla","Model 3",500,"Rojo","17/05/2018",0,30000);
        Vehículo vehículo7=new Motocicleta("ciclomotor",50,"0454GNZ","Harley","Iron 883",500,"Blanco","17/05/2018",0,50000);
        Vehículo vehículo8=new Motocicleta("sport",100,"0454GNZ","Harley","Iron 883",500,"Blanco","17/05/2018",0,50000);
        Vehículo vehículo9=new Motocicleta("custom",150,"0454GNZ","Harley","Iron 883",500,"Blanco","17/05/2018",0,50000);
        Vehículo vehículo10=new Motocicleta("cross",250,"0454GNZ","Harley","Iron 883",500,"Blanco","17/05/2018",0,50000);
       
        //Vehículo vehículo11=new Todoterreno("2x4","Gasolina","automático",5,"0450GNZ","Tesla","Avensis",500,"Rojo","25/06/1999",50000,15000);
        //vehículos.add(vehículo11);
        
        vehículos.add(vehículo1);
        vehículos.add(vehículo2);
        vehículos.add(vehículo3);
        vehículos.add(vehículo4);
        vehículos.add(vehículo5);
        vehículos.add(vehículo6);
        vehículos.add(vehículo7);
        vehículos.add(vehículo8);
        vehículos.add(vehículo9);
        vehículos.add(vehículo10);
        */
        
        //System.out.println(vehículos);
        //EscribeFichero escribeFicheroVehículos = new EscribeFichero(vehículos,"vehículos");
        
        LeeFichero leeFicheroVehículos=new LeeFichero("vehículos");
        
        for (Object vehículo : leeFicheroVehículos.getArrayList()) { //para verlos ordenados
            System.out.println(vehículo);
        }
        System.out.println(); //para diferenciar vehículos de clientes
        //################# Fin VEHÍCULOS ##################
        
        //################# CLIENTES ##################
        //File archivo2 = new File("personas.dat");
        
        //archivo2.delete();
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        /*Persona persona1 = new Administrador("David","50516553D",608401236);
        Persona persona2 = new Empleado("Hugo","50516553E","h@h.com","contraseña",608401237);
        Persona persona3 = new Empleado("Manuel","50516553F","m@m.es","pass",608401238);
        Persona persona4 = new NingunaRelación("Diego","50516553G","d@d.org","1234",608401239);
        Persona persona5 = new Familiar("Nacho","50516553H","n@n.pop","qwerty",608401230);
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);*/
        
        //System.out.println(personas);
        //EscribeFichero escribeFicheroPersonas = new EscribeFichero(personas,"personas");
        
        /*LeeFichero leeFicheroPersonas=new LeeFichero("personasIniciales");
        
        for (Object persona : leeFicheroPersonas.getArrayList()) { //para verlos ordenados
            System.out.println(persona);
        }*/
        //################# Fin CLIENTES ##################
    
    }
}
