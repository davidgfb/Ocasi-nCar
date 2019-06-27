/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.Empresa;
import clases.Venta;

/**
 * interfaz para visualizar las ventas realizadas filtrandolas por fecha si se
 * quiere
 *
 * @author david
 */
public class Ventas extends javax.swing.JFrame {
//campos

    private ArrayList<Venta> mostrarVentas;
    private int contador = 0;
    private Empresa e;

    /**
     * Creates new form Ventas
     */
    /**
     * constructor
     *
     * @param e empresa con la que estamos trabajando
     */
    public Ventas(Empresa e) {
        initComponents();
        this.e = e;
        Image icon = new ImageIcon(getClass().getResource("logo.png")).getImage();
        setIconImage(icon);
        this.setTitle("Consulta de ventas");
        this.setLocation(700, 300);
        siguiente.setEnabled(false);
    }//fin constructor

    /**
     * metodo para mostrar la venta correspondiente
     */
    public void mostrarSiguiente() {
        if (contador < mostrarVentas.size()) {
            String infoVenta = "Vehiculo vendido: " + e.getVentas().get(contador).getV().getMarca()
                    + e.getVentas().get(contador).getV().getModelo()
                    + " con matricula: " + e.getVentas().get(contador).getV().getMatricula()
                    + "\n" + "Cliente-- " + "Nombre: " + e.getVentas().get(contador).getC().getNombre()
                    + " con DNI: " + e.getVentas().get(contador).getC().getDni()
                    + " y correo: " + e.getVentas().get(contador).getC().getCorreo()
                    + "\n" + "Fecha: " + e.getVentas().get(contador).getFecha().getDay() + e.getVentas().get(contador).getFecha().getMonth()
                    + e.getVentas().get(contador).getFecha().getYear()
                    + "\n" + "Precio: " + e.getVentas().get(contador).getPrecio();
            txt_area.setText(infoVenta);
            contador++;
        } else {
            JOptionPane.showMessageDialog(this, "No hay mas ventas efectuadas");

        }
    }//fin del metodo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        siguiente = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar todas las ventas");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(mostrar)
                .addGap(18, 18, 18)
                .addComponent(siguiente)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(mostrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * metodo para comprobar que hay ventas y mostrar la primera de ellas
     *
     * @param evt
     */
    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        mostrarVentas = e.getVentas();
        contador = 0;
        if (e.getVentas().size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay ventas");
        } else {
            siguiente.setEnabled(true);

            mostrarSiguiente();
        }

    }//GEN-LAST:event_mostrarActionPerformed
//fin el metodo

    /**
     * metodo para visualizar la siguiente venta
     *
     * @param evt
     */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        mostrarSiguiente();
    }//GEN-LAST:event_siguienteActionPerformed
//fin del metodo

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton siguiente;
    private javax.swing.JTextArea txt_area;
    // End of variables declaration//GEN-END:variables
}
