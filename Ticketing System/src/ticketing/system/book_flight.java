/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketing.system;

import javax.swing.JOptionPane;



/**
 *
 * @author TheGunner
 */
public class book_flight extends javax.swing.JFrame {
    String[] Domestic = {"Select","Ninoy Aquino International Airport (NAIA) - Manila","Mactan-Cebu International Airport - Cebu","Francisco Bangoy International Airport (Davao International Airport) - Davao City","Iloilo International Airport - Iloilo","Zamboanga International Airport - Zamboanga City","Kalibo International Airport - Kalibo, Aklan","Bacolod-Silay International Airport - Silay, Negros Occidental","Dumaguete-Sibulan Airport - Dumaguete City, Negros Oriental","Tagbilaran Airport - Tagbilaran City, Bohol","Cagayan North International Airport - Lal-lo, Cagayan"};        
    String[] internationalAirports = {"Select", "Hartsfield-Jackson Atlanta International Airport - Atlanta, USA","Beijing Capital International Airport - Beijing, China","Dubai International Airport - Dubai, UAE","London Heathrow Airport - London, UK","Tokyo Haneda Airport - Tokyo, Japan","Paris Charles de Gaulle Airport - Paris, France","Singapore Changi Airport - Singapore","Incheon International Airport - Seoul, South Korea","Los Angeles International Airport (LAX) - Los Angeles, USA","Frankfurt Airport - Frankfurt, Germany"};
    
    flightdb database = new flightdb();
    
    public book_flight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        option_label = new javax.swing.JLabel();
        flight_type_text = new javax.swing.JLabel();
        flight_type = new javax.swing.JComboBox<>();
        flight_from_text = new javax.swing.JLabel();
        flight_to_text = new javax.swing.JLabel();
        flight_from = new javax.swing.JComboBox<>();
        flight_to = new javax.swing.JComboBox<>();
        flight_tier_text = new javax.swing.JLabel();
        flight_tier = new javax.swing.JComboBox<>();
        p_option = new javax.swing.JLabel();
        passport_text = new javax.swing.JLabel();
        passport = new javax.swing.JTextField();
        namaewa = new javax.swing.JLabel();
        namae = new javax.swing.JTextField();
        ps_option1 = new javax.swing.JLabel();
        mdp = new javax.swing.JComboBox<>();
        mode_of_payment_text = new javax.swing.JLabel();
        date_of_flight_text = new javax.swing.JLabel();
        dtr = new javax.swing.JLabel();
        book_flight_button = new javax.swing.JButton();
        date_of_flight = new javax.swing.JTextField();
        date_of_return = new javax.swing.JTextField();
        stats = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        retturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticketing System: Booking a Flight");

        buttons.setBackground(new java.awt.Color(75, 75, 75));

        option_label.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        option_label.setForeground(new java.awt.Color(255, 255, 255));
        option_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        option_label.setText("Ticket Option :");

        flight_type_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flight_type_text.setForeground(new java.awt.Color(255, 255, 255));
        flight_type_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flight_type_text.setText("Flight Type:");

        flight_type.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        flight_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "International", "Domestic" }));
        flight_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flight_typeActionPerformed(evt);
            }
        });

        flight_from_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flight_from_text.setForeground(new java.awt.Color(255, 255, 255));
        flight_from_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flight_from_text.setText("Flight From:");

        flight_to_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flight_to_text.setForeground(new java.awt.Color(255, 255, 255));
        flight_to_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flight_to_text.setText("Flight To:");

        flight_from.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        flight_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flight_fromActionPerformed(evt);
            }
        });

        flight_to.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        flight_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flight_toActionPerformed(evt);
            }
        });

        flight_tier_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flight_tier_text.setForeground(new java.awt.Color(255, 255, 255));
        flight_tier_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flight_tier_text.setText("Flight Class:");

        flight_tier.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        flight_tier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flight_tierActionPerformed(evt);
            }
        });

        p_option.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        p_option.setForeground(new java.awt.Color(255, 255, 255));
        p_option.setText("Passenger Option :");
        p_option.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        passport_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        passport_text.setForeground(new java.awt.Color(255, 255, 255));
        passport_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passport_text.setText("Passport ID:");

        passport.setToolTipText("A0000000A");

        namaewa.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        namaewa.setForeground(new java.awt.Color(255, 255, 255));
        namaewa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaewa.setText("Full Name:");

        ps_option1.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        ps_option1.setForeground(new java.awt.Color(255, 255, 255));
        ps_option1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ps_option1.setText("Flight Option :");
        ps_option1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        mdp.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        mdp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit /Debit Card", "E-Wallet" }));
        mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpActionPerformed(evt);
            }
        });

        mode_of_payment_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        mode_of_payment_text.setForeground(new java.awt.Color(255, 255, 255));
        mode_of_payment_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mode_of_payment_text.setText("Payment Method:");

        date_of_flight_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        date_of_flight_text.setForeground(new java.awt.Color(255, 255, 255));
        date_of_flight_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date_of_flight_text.setText("Date of Flight:");

        dtr.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        dtr.setForeground(new java.awt.Color(255, 255, 255));
        dtr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dtr.setText("Date of Return:");

        book_flight_button.setBackground(new java.awt.Color(74, 144, 226));
        book_flight_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        book_flight_button.setText("Book!");
        book_flight_button.setBorder(null);
        book_flight_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book_flight_button.setFocusPainted(false);
        book_flight_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_flight_buttonActionPerformed(evt);
            }
        });

        date_of_flight.setText("yyyy-MM-dd");

        date_of_return.setText("yyyy-MM-dd");

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(flight_tier_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_to_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_from_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_type_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flight_type, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_from, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_to, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flight_tier, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(p_option, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addComponent(namaewa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namae, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addComponent(passport_text, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(book_flight_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ps_option1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mode_of_payment_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(date_of_flight_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mdp, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date_of_flight)
                            .addComponent(date_of_return))))
                .addContainerGap())
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option_label)
                    .addComponent(p_option))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flight_type_text)
                    .addComponent(flight_type, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passport_text)
                        .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flight_from_text)
                    .addComponent(flight_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaewa)
                    .addComponent(namae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flight_to_text)
                    .addComponent(flight_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flight_tier_text)
                    .addComponent(flight_tier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ps_option1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mode_of_payment_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_of_flight_text)
                    .addComponent(date_of_flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtr)
                    .addComponent(date_of_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(book_flight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(buttons, java.awt.BorderLayout.CENTER);

        stats.setBackground(new java.awt.Color(74, 144, 226));
        stats.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Ticketing System : Booking a Flight");

        retturn.setText("Return");
        retturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retturn)
                .addContainerGap())
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retturn))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(stats, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flight_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flight_typeActionPerformed
        
        if (flight_type.getSelectedItem() == "International"){
                //To and From dont get confused
            flight_to.removeAllItems();
            flight_tier.removeAllItems();
            flight_from.removeAllItems();
            for (int i = 0; i <= internationalAirports.length - 1; i++){
                flight_from.addItem(internationalAirports[i]);
            }
        } else if (flight_type.getSelectedItem() == "Domestic"){
                //To and From dont get confused
            flight_to.removeAllItems();
            flight_tier.removeAllItems();
            flight_from.removeAllItems();
            for (int i = 0; i <= Domestic.length - 1; i++){
                flight_from.addItem(Domestic[i]);
            }
        } else {
            flight_to.removeAllItems();
            flight_from.removeAllItems();
            flight_tier.removeAllItems();
        }
    }//GEN-LAST:event_flight_typeActionPerformed

    private void flight_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flight_fromActionPerformed
        flight_to.removeAllItems();
        if (flight_from.getSelectedItem() == "Select") {
            return;
        }
        if (flight_type.getSelectedItem() == "International"){
            for (int i = 0; i <= internationalAirports.length - 1; i++){
                if (internationalAirports[i] != flight_from.getSelectedItem() || internationalAirports[i] == "Select"){
                    flight_to.addItem(internationalAirports[i]);
                }
            }
        } else if (flight_type.getSelectedItem() == "Domestic"){
            for (int i = 0; i <= Domestic.length - 1; i++){
                if (Domestic[i] != flight_from.getSelectedItem() || Domestic[i] == "Select"){
                    flight_to.addItem(Domestic[i]);
                }
            }
        }
    }//GEN-LAST:event_flight_fromActionPerformed

    private void flight_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flight_toActionPerformed
        if (flight_to.getSelectedItem() == "Select") {
            return;
        }
        String[] tiers = {"Economy", "Premium Economy", "Business", "First Class"};
        
        flight_tier.removeAllItems();
        for (int i = 0; i <= tiers.length - 1; i++){
            flight_tier.addItem(tiers[i]);
        }
    }//GEN-LAST:event_flight_toActionPerformed

    private void retturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retturnActionPerformed
        this.setVisible(false);
        main_menu menu = new main_menu();
        menu.setBounds(this.getX(), this.getY(), 400 , 280);
        menu.setVisible(true);
    }//GEN-LAST:event_retturnActionPerformed

    private void mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpActionPerformed

    private void book_flight_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_flight_buttonActionPerformed
        if (flight_type.getSelectedItem() != "Select"){
            if (flight_from.getSelectedItem() != ""){
                if (flight_to.getSelectedItem() != ""){
                    if (flight_tier.getSelectedItem() != ""){
                        if (passport.getText() != "" && passport.getText().length() == 9){
                            if (namae.getText() != "" && namae.getText().length() >= 6){
                                var result = database.addFlight(
                                        flight_type.getSelectedItem().toString(),
                                        flight_to.getSelectedItem().toString(),
                                        flight_from.getSelectedItem().toString(),
                                        flight_tier.getSelectedItem().toString(),                                        
                                        namae.getText(),
                                        passport.getText(),
                                        mdp.getSelectedItem().toString(),
                                        date_of_flight.getText(),
                                        date_of_return.getText()
                                );
                                if (result != -1){
                                    alert("Booked! ID: "+result);
                                } else {
                                    alert("Failed to Book!");
                                }
                            } else {
                                alert("Please enter your Full name!");
                            } 
                        } else {
                            alert("Invalid Passport!");
                        }
                    } else {
                        alert("Please select a flight tier!");
                    }
                } else {
                    alert("Please select a flight to!");
                }
            } else {
                alert("Please select a flight from!");
            } 
        } else {
            alert("Please select a flight type!");
        }
    }//GEN-LAST:event_book_flight_buttonActionPerformed

    private void flight_tierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flight_tierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flight_tierActionPerformed

    public static void alert(String mess){
        JOptionPane.showMessageDialog(null, mess, "Alert!", JOptionPane.WARNING_MESSAGE);
    }
    
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
            java.util.logging.Logger.getLogger(book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book_flight().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_flight_button;
    private javax.swing.JPanel buttons;
    private javax.swing.JTextField date_of_flight;
    private javax.swing.JLabel date_of_flight_text;
    private javax.swing.JTextField date_of_return;
    private javax.swing.JLabel dtr;
    private javax.swing.JComboBox<String> flight_from;
    private javax.swing.JLabel flight_from_text;
    private javax.swing.JComboBox<String> flight_tier;
    private javax.swing.JLabel flight_tier_text;
    private javax.swing.JComboBox<String> flight_to;
    private javax.swing.JLabel flight_to_text;
    private javax.swing.JComboBox<String> flight_type;
    private javax.swing.JLabel flight_type_text;
    private javax.swing.JComboBox<String> mdp;
    private javax.swing.JLabel mode_of_payment_text;
    private javax.swing.JTextField namae;
    private javax.swing.JLabel namaewa;
    private javax.swing.JLabel option_label;
    private javax.swing.JLabel p_option;
    private javax.swing.JTextField passport;
    private javax.swing.JLabel passport_text;
    private javax.swing.JLabel ps_option1;
    private javax.swing.JButton retturn;
    private javax.swing.JPanel stats;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
