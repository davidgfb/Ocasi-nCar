package grafico.administrador;

import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Baja extends javax.swing.JFrame {

    private JFrame principal;
    private String tipo = "";

    /** Creates new form Altas */
    public Baja(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Baja = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Matrícula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Altas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Baja");

        Baja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Baja.setText("Baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grafico/OcasionCar_Logo.png"))); // NOI18N

        jLabel3.setText("Matrícula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(71, 71, 71)
                .addComponent(Matrícula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matrícula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(103, 103, 103)
                .addComponent(Baja)
                .addGap(57, 57, 57))
        );

        setSize(new java.awt.Dimension(415, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//alta    
private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
// TODO add your handling code here:
    System.out.println("Vehículo con matrícula "+Matrícula.getText()+" dado de baja");
}//GEN-LAST:event_BajaActionPerformed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
// TODO add your handling code here:
    //Volvemos a mostrar la ventana principal
    principal.setVisible(true);
}//GEN-LAST:event_formWindowClosed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baja;
    private javax.swing.JTextField Matrícula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
