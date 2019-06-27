/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import clases.Empresa;

/**
 * interfaz para dar de baja un vehiculo buscandolo en nuestro ArrayList y
 * eliminandolo
 *
 * @author david
 */
public class BajaVehiculo extends javax.swing.JFrame {

    //campos

    private Empresa e;

    /**
     * Creates new form BajaVehiculo
     */
    /**
     * constructor
     *
     * @param e es la empresa sobre la que estamos trabajando
     */
    public BajaVehiculo(Empresa e) {
        initComponents();
        this.e = e;
        Image icon = new ImageIcon(getClass().getResource("logo.png")).getImage();
        setIconImage(icon);
        this.setTitle("Baja de vehiculos");
        this.setLocation(700, 300);
        confirmar.setEnabled(false);

    }//fin constructor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        lbl_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        baja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula");

        confirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmar.setText("CONFIRMAR");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        baja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        baja.setText("Dar de baja");
        baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baja, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * metodo para eliminar el vehiculo del ArrayList de vehiculos
     *
     * @param evt metodo activado cuando se pulse el boton
     */
    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        for (int i = 0; i < e.getVehiculos().size(); i++) {
            if (e.getVehiculos().get(i).getMatricula().equals(txt_matricula.getText())) {
                e.getVehiculos().remove(i);
                e.guardarDatosVehiculos();
                JOptionPane.showMessageDialog(this, "Vehiculo dado de baja correctamente");
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_confirmarActionPerformed
//fin del metodo

    /**
     * metodo para buscar el vehiculo que queremos dar de baja y mostrar sus
     * caracteristicas
     *
     * @param evt
     */
    private void bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaActionPerformed
        if (e.getVehiculos().size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay vehciulos");
        } else {
            for (int i = 0; i < e.getVehiculos().size(); i++) {
                if (e.getVehiculos().get(i).getMatricula().equals(txt_matricula.getText())) {
                    String infoCoche = "El color es: " + e.getVehiculos().get(i).getColor()
                            + "\n" + "La marca es: " + e.getVehiculos().get(i).getMarca()
                            + "\n" + "La matricula es: " + e.getVehiculos().get(i).getMatricula()
                            + "\n" + "El modelo es: " + e.getVehiculos().get(i).getModelo()
                            + "\n" + "El color es: " + e.getVehiculos().get(i).getFechamat()
                            + "\n" + "El color es: " + e.getVehiculos().get(i).getKilometros()
                            + "\n" + "El color es: " + e.getVehiculos().get(i).getPotencia()
                            + "\n" + "El color es: " + e.getVehiculos().get(i).getPrecio();
                    txt_area.setText(infoCoche);
                    lbl_foto.setIcon(e.getVehiculos().get(i).getFoto());
                    confirmar.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Vehiculo no existente");
                }
            }
        }
    }//GEN-LAST:event_bajaActionPerformed
//fin del metodo

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baja;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_matricula;
    // End of variables declaration//GEN-END:variables
}
