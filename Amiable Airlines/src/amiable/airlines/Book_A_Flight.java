/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amiable.airlines;

/**
 *
 * @author admin
 */
public class Book_A_Flight extends javax.swing.JFrame {
    
    String[] Local = {"Select", "Ninoy Aquino International Airport (NAIA) - Manila,", "AIMABLE AIRPORT - ANTIPOLSS"};
    String[] International = {"Select", };
    
    public Book_A_Flight() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Return_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        F_Type = new javax.swing.JComboBox<>();
        F_To = new javax.swing.JComboBox<>();
        F_From = new javax.swing.JComboBox<>();
        F_Class = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Return_button.setText("Return");
        Return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Flight Type:");

        jLabel4.setText("Flight From:");

        jLabel5.setText("Flight To:");

        jLabel6.setText("Flight Class:");

        F_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "International" }));
        F_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_TypeActionPerformed(evt);
            }
        });

        F_To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));

        F_From.setToolTipText("");
        F_From.setBorder(null);
        F_From.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F_From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_FromActionPerformed(evt);
            }
        });

        F_Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Return_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(F_Type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_To, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_Class, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(F_From, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 259, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(F_Type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(F_From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(F_To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(F_Class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(Return_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_buttonActionPerformed
    this.setVisible(false);
    AmiableAirlinesMM MM = new AmiableAirlinesMM();
    MM.setBounds(this.getX(), this.getY(), 570, 500);
    MM.setVisible(true);
    }//GEN-LAST:event_Return_buttonActionPerformed

    private void F_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_TypeActionPerformed
    
    if (F_Type.getSelectedItem() == "Local"){
        F_From.removeAllItems();
        F_To.removeAllItems();
        F_Class.removeAllItems();
        for (int i = 0; i <= Local.length -1; i++){
            F_From.addItem(Local[i]);
        }
    }
    if (F_Type.getSelectedItem() == "International"){
        F_From.removeAllItems();
        F_To.removeAllItems();
        F_Class.removeAllItems();
        for (int i = 0; i <= International.length -1; i++){
            F_From.addItem(International[i]);
        }
    }
    }//GEN-LAST:event_F_TypeActionPerformed

    private void F_FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_FromActionPerformed
    
    }//GEN-LAST:event_F_FromActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Book_A_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_A_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_A_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_A_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_A_Flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> F_Class;
    private javax.swing.JComboBox<String> F_From;
    private javax.swing.JComboBox<String> F_To;
    private javax.swing.JComboBox<String> F_Type;
    private javax.swing.JButton Return_button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
