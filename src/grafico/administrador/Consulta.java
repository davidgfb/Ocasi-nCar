/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.administrador;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Empresa;
import modelo.Vehiculo;


public class Consulta extends javax.swing.JFrame {

    private ArrayList<Vehiculo> mostrarVehiculos;
    private Empresa e;
    private int contador = 0;

    /**
     * Creates new form Consulta
     */
    
    public Consulta(Empresa e) {
        initComponents();
        this.e = e;
        Image icon = new ImageIcon(getClass().getResource("logo.png")).getImage();
        setIconImage(icon);
        this.setTitle("Consulta de vehiculos");
        this.setLocation(700, 300);
        siguiente.setEnabled(false);

    }

    public void mostrarSiguiente() {
        if (contador < mostrarVehiculos.size()) {
            String infoCoche = "El color es: " + mostrarVehiculos.get(contador).getColor()
                    + "\n" + "La marca es: " + mostrarVehiculos.get(contador).getMarca()
                    + "\n" + "La matricula es: " + mostrarVehiculos.get(contador).getMatricula()
                    + "\n" + "El modelo es: " + mostrarVehiculos.get(contador).getModelo()
                    + "\n" + "El fecha de matriculacion es: " + mostrarVehiculos.get(contador).getFechamat()
                    + "\n" + "Tiene " + mostrarVehiculos.get(contador).getKilometros() + " kilometros"
                    + "\n" + "Su potencia es: " + mostrarVehiculos.get(contador).getPotencia()
                    + "\n" + "El precio es: " + mostrarVehiculos.get(contador).getPrecio();
            txt_area.setText(infoCoche);
            contador++;
        } else {
            JOptionPane.showMessageDialog(this, "No hay mas vehiculos disponibles");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        todos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        buscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscar.setText("Busca");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        siguiente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        todos.setText("Muestra vehículos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(todos)
                .addGap(145, 145, 145)
                .addComponent(buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siguiente)
                            .addComponent(buscar)
                            .addComponent(todos))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        mostrarVehiculos = new ArrayList<>();
        contador = 0;
        for (int i = 0; i < e.getVehiculos().size(); i++) {
            if (e.getVehiculos().get(i).getMarca().equals(txt_marca.getText()) && e.getVehiculos().get(i).getModelo().equals(txt_marca.getText())) {
                mostrarVehiculos.add(e.getVehiculos().get(i));
            }
        }
        if (mostrarVehiculos.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay vehiculos con estas caracteristicas");
        } else {
            siguiente.setEnabled(true);

            mostrarSiguiente();
        }


    }//GEN-LAST:event_buscarActionPerformed

    
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        mostrarSiguiente();
    }//GEN-LAST:event_siguienteActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        mostrarVehiculos = e.getVehiculos();
        contador = 0;
        if (mostrarVehiculos.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay vehiculos");
        } else {
            siguiente.setEnabled(true);

            mostrarSiguiente();
        }
    }//GEN-LAST:event_todosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton todos;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    // End of variables declaration//GEN-END:variables
}
