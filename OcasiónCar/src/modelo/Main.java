package modelo;

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
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehículo vehículo=new Todoterreno("4x4","Gasolina","automático",5,"9566FMY","Toyota","Avensis",300,"Plata","25/06/1999",250000,15000);
        System.out.println(vehículo.toString());
    }
    
    void guarda() {
        
    }
    
    void carga() {
        
    }
    
}
