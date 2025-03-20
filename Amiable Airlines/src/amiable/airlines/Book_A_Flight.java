/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amiable.airlines;

import java.awt.Dimension;
import java.awt.IllegalComponentStateException;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicComboPopup;

/**
 *
 * @author admin
 */
public class Book_A_Flight extends javax.swing.JFrame {
    //SORT THESE ALPHABETICALLY
    String[] Local = {"Select", "Ninoy Aquino International Airport (NAIA) - Manila", "Mactan-Cebu International Airport - Cebu", "Clark International Airport - Pampanga", "Francisco Bangoy Internaitnoal Airport - Davao", "Iloilo International Airport - Iloilo", "Cagayan de Oro Airport - Cagayan de Oro", "Kalibo Internaitnoal Airport - Kalibo, Aklan", "Zamboanga Internaional Airport - Zamboanga", "Diosdado Macapagal International AIrport - Diosdado", "Puerto Princesa International Airport - Palawan"};
    String[] International = {"Select", "Los Angeles International Airport - USA", "Dubai International Airport - UAE", "Changi Airport - Singapore", "Tokyo Haneda Airport - Londow hearthrow Airport - UK", "Hong Kong International Airport - HongKong","Paris Charles de Gaulle  - France", "Incheon International Airport - South Korea", "John F. Kennedy International Airport - USA","Beijing Capital International Airport - China", "São Paulo-Guarulhos International Airport - Brazil", "Kuala Lumpur International Airport - Malaysia","Rome Fiumicino Airport - Italy"};
    String[] FromPH = {"Select", "Ninoy Aquino International Airport (NAIA) - Manila", "Mactan-Cebu International Airport - Cebu", "Clark International Airport - Pampanga", "Francisco Bangoy Internaitnoal Airport - Davao", "Iloilo International Airport - Iloilo", "Cagayan de Oro Airport - Cagayan de Oro", "Kalibo Internaitnoal Airport - Kalibo, Aklan", "Zamboanga Internaional Airport - Zamboanga", "Diosdado Macapagal International AIrport - Diosdado", "Puerto Princesa International Airport - Palawan"};
    
    public Book_A_Flight() {
        initComponents();
        WiderDropDownCombo wider = new WiderDropDownCombo(Local);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdp = new javax.swing.JComboBox<>();
        mode_of_payment_text = new javax.swing.JLabel();
        date_of_flight_text = new javax.swing.JLabel();
        dtr = new javax.swing.JLabel();
        book_flight_button = new javax.swing.JButton();
        date_of_flight = new javax.swing.JTextField();
        date_of_return = new javax.swing.JTextField();
        ps_option1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        F_Type = new javax.swing.JComboBox<>();
        F_To = new javax.swing.JComboBox<>();
        F_From = new javax.swing.JComboBox<>();
        F_Class = new javax.swing.JComboBox<>();
        Return_button = new javax.swing.JButton();
        passport = new javax.swing.JTextField();
        passport_text = new javax.swing.JLabel();
        namaewa = new javax.swing.JLabel();
        namae = new javax.swing.JTextField();
        p_option = new javax.swing.JLabel();
        mdp1 = new javax.swing.JComboBox<>();
        mode_of_payment_text1 = new javax.swing.JLabel();
        date_of_flight_text1 = new javax.swing.JLabel();
        dtr1 = new javax.swing.JLabel();
        book_flight_button1 = new javax.swing.JButton();
        date_of_flight1 = new javax.swing.JTextField();
        date_of_return1 = new javax.swing.JTextField();
        ps_option2 = new javax.swing.JLabel();
        p_option1 = new javax.swing.JLabel();
        flightTypeText = new javax.swing.JLabel();
        flightFromText = new javax.swing.JLabel();
        flightToText = new javax.swing.JLabel();
        flightClassText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        ps_option1.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        ps_option1.setForeground(new java.awt.Color(255, 255, 255));
        ps_option1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ps_option1.setText("Flight Option :");
        ps_option1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        jPanel2.setBackground(new java.awt.Color(91, 202, 226));
        jPanel2.setForeground(new java.awt.Color(176, 208, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "International" }));
        F_Type.setMinimumSize(new java.awt.Dimension(28, 22));
        F_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_TypeActionPerformed(evt);
            }
        });
        jPanel2.add(F_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 41, -1, -1));

        F_To.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                F_ToPopupMenuWillBecomeVisible(evt);
            }
        });
        F_To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_ToActionPerformed(evt);
            }
        });
        jPanel2.add(F_To, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 105, 88, -1));

        F_From.setToolTipText("");
        F_From.setBorder(null);
        F_From.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        F_From.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                F_FromPopupMenuWillBecomeVisible(evt);
            }
        });
        F_From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_FromActionPerformed(evt);
            }
        });
        jPanel2.add(F_From, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 72, 88, -1));

        jPanel2.add(F_Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 138, 88, -1));

        Return_button.setBackground(new java.awt.Color(51, 51, 255));
        Return_button.setText("Return");
        Return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(Return_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 293, 70, 30));

        passport.setToolTipText("A0000000A");
        jPanel2.add(passport, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 171, -1));

        passport_text.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        passport_text.setForeground(new java.awt.Color(255, 255, 255));
        passport_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passport_text.setText("Passport ID:");
        jPanel2.add(passport_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 85, -1));

        namaewa.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        namaewa.setForeground(new java.awt.Color(255, 255, 255));
        namaewa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        namaewa.setText("Full Name:");
        jPanel2.add(namaewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 85, -1));

        namae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaeActionPerformed(evt);
            }
        });
        jPanel2.add(namae, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 171, -1));

        p_option.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        p_option.setForeground(new java.awt.Color(255, 255, 255));
        p_option.setText("Passenger Option :");
        p_option.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(p_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        mdp1.setFont(new java.awt.Font("Aller", 1, 12)); // NOI18N
        mdp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit /Debit Card", "E-Wallet" }));
        mdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdp1ActionPerformed(evt);
            }
        });
        jPanel2.add(mdp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 197, 265, -1));

        mode_of_payment_text1.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        mode_of_payment_text1.setForeground(new java.awt.Color(255, 255, 255));
        mode_of_payment_text1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mode_of_payment_text1.setText("Payment Method:");
        jPanel2.add(mode_of_payment_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 199, 245, -1));

        date_of_flight_text1.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        date_of_flight_text1.setForeground(new java.awt.Color(255, 255, 255));
        date_of_flight_text1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date_of_flight_text1.setText("Date of Flight:");
        jPanel2.add(date_of_flight_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 225, 245, -1));

        dtr1.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        dtr1.setForeground(new java.awt.Color(255, 255, 255));
        dtr1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dtr1.setText("Date of Return:");
        jPanel2.add(dtr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 251, 245, -1));

        book_flight_button1.setBackground(new java.awt.Color(74, 144, 226));
        book_flight_button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        book_flight_button1.setText("Book");
        book_flight_button1.setBorder(null);
        book_flight_button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book_flight_button1.setFocusPainted(false);
        book_flight_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_flight_button1ActionPerformed(evt);
            }
        });
        jPanel2.add(book_flight_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 292, 528, 33));

        date_of_flight1.setText("yyyy-MM-dd");
        jPanel2.add(date_of_flight1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 225, 265, -1));

        date_of_return1.setText("yyyy-MM-dd");
        jPanel2.add(date_of_return1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 251, 265, -1));

        ps_option2.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        ps_option2.setForeground(new java.awt.Color(255, 255, 255));
        ps_option2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ps_option2.setText("Flight Option :");
        ps_option2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(ps_option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 172, 528, -1));

        p_option1.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        p_option1.setForeground(new java.awt.Color(255, 255, 255));
        p_option1.setText("Ticketing Option:");
        p_option1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(p_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 210, -1));

        flightTypeText.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flightTypeText.setForeground(new java.awt.Color(255, 255, 255));
        flightTypeText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightTypeText.setText("Flight Type:");
        jPanel2.add(flightTypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, 99, -1));

        flightFromText.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flightFromText.setForeground(new java.awt.Color(255, 255, 255));
        flightFromText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightFromText.setText("Flight From:");
        jPanel2.add(flightFromText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 99, -1));

        flightToText.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flightToText.setForeground(new java.awt.Color(255, 255, 255));
        flightToText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightToText.setText("Flight To:");
        jPanel2.add(flightToText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 99, -1));

        flightClassText.setFont(new java.awt.Font("Aller", 1, 13)); // NOI18N
        flightClassText.setForeground(new java.awt.Color(255, 255, 255));
        flightClassText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        flightClassText.setText("Flight Class:");
        jPanel2.add(flightClassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 99, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\output-onlinepngtools (1).png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_buttonActionPerformed
    this.setVisible(true);
    AmiableAirlinesMM MM = new AmiableAirlinesMM();
    MM.setBounds(this.getX(), this.getY(), 570, 500);
    MM.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Return_buttonActionPerformed

    private void F_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_TypeActionPerformed

    if (F_Type.getSelectedItem() == "Local"){
        F_From.removeAllItems();
        F_To.removeAllItems();
        F_Class.removeAllItems();
        this.F_From.setPreferredSize(new Dimension (20, 28));
        for (int i = 0; i <= Local.length -1; i++){
            F_From.addItem(Local[i]);
        }
    }else if (F_Type.getSelectedItem() == "International"){
        F_From.removeAllItems();
        F_To.removeAllItems();
        F_Class.removeAllItems();
        this.F_From.setPreferredSize(new Dimension (20, 28));
        for (int i = 0; i <= International.length -1; i++){
            F_From.addItem(International[i]);
        }
    }else{
        F_To.removeAllItems();
        F_From.removeAllItems();
        
    }
    }//GEN-LAST:event_F_TypeActionPerformed

    private void F_FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_FromActionPerformed
        F_To.removeAllItems();
        if (F_From.getSelectedItem() == "Select") {
            return;
        }
        if (F_Type.getSelectedItem() == "International"){
            for (int i = 0; i <= International.length - 1; i++){
                if (International[i] != F_From.getSelectedItem() || International[i].equals("Select")){
                    F_To.addItem(International[i]);
                }
            }
            for (int i = 0; i <= FromPH.length - 1; i++){
                if (FromPH[i] != F_From.getSelectedItem() || FromPH[i].equals("Select")){
                    F_To.addItem(FromPH[i]);
                }
            }
        } else if (F_Type.getSelectedItem() == "Local"){
            for (int i = 0; i <= Local.length - 1; i++){
                if (Local[i] != F_From.getSelectedItem() || Local[i].equals("Select")){
                    F_To.addItem(Local[i]);
                }
            }
        }
    }//GEN-LAST:event_F_FromActionPerformed
        
    private void F_FromPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_F_FromPopupMenuWillBecomeVisible
         @SuppressWarnings("unchecked")
    JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
    
    BasicComboPopup popup = (BasicComboPopup) comboBox.getAccessibleContext().getAccessibleChild(0);

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JScrollPane scrollPane = (JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, popup.getList());
        
        int popupWidth = popup.getList().getPreferredSize().width;
        
        Dimension scrollPaneSize = scrollPane.getPreferredSize();
        scrollPaneSize.width = Math.max(popupWidth, 330);
        scrollPane.setPreferredSize(scrollPaneSize);
        scrollPane.setMaximumSize(scrollPaneSize);
        
        try {
          Point location = comboBox.getLocationOnScreen();
          int height = comboBox.getPreferredSize().height;
          popup.setLocation(location.x, location.y + height - 1);
          popup.setLocation(location.x, location.y + height);
        } catch(IllegalComponentStateException exc) {
        }
      }
    });
    }//GEN-LAST:event_F_FromPopupMenuWillBecomeVisible

    private void F_ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_ToActionPerformed
        if (F_To.getSelectedItem() == "Select") {
            return;
        }
        String[] tiers = {"Economy", "Premium Economy", "Business", "First Class"};
        
        F_Class.removeAllItems();
        for (int i = 0; i <= tiers.length - 1; i++){
            F_Class.addItem(tiers[i]);
        }
    }//GEN-LAST:event_F_ToActionPerformed

    private void F_ToPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_F_ToPopupMenuWillBecomeVisible
        @SuppressWarnings("unchecked")
    JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
    
    BasicComboPopup popup = (BasicComboPopup) comboBox.getAccessibleContext().getAccessibleChild(0);

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JScrollPane scrollPane = (JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, popup.getList());
        
        int popupWidth = popup.getList().getPreferredSize().width;
        
        Dimension scrollPaneSize = scrollPane.getPreferredSize();
        scrollPaneSize.width = Math.max(popupWidth, 330);
        scrollPane.setPreferredSize(scrollPaneSize);
        scrollPane.setMaximumSize(scrollPaneSize);
        
        try {
          Point location = comboBox.getLocationOnScreen();
          int height = comboBox.getPreferredSize().height;
          popup.setLocation(location.x, location.y + height - 1);
          popup.setLocation(location.x, location.y + height);
        } catch(IllegalComponentStateException exc) {
        }
      }
    });
    }//GEN-LAST:event_F_ToPopupMenuWillBecomeVisible

    private void namaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaeActionPerformed

    private void mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpActionPerformed

    private void book_flight_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_flight_buttonActionPerformed
        if (F_Type.getSelectedItem() != "Select"){
            if (F_From.getSelectedItem() != ""){
                if (F_To.getSelectedItem() != ""){
                    if (F_Class.getSelectedItem() != ""){
                        if (passport.getText() != "" && passport.getText().length() == 9){
                            if (namae.getText() != "" && namae.getText().length() >= 6){
                                var result = flightdb.addFlight(
                                    F_Type.getSelectedItem().toString(),
                                    F_To.getSelectedItem().toString(),
                                    F_From.getSelectedItem().toString(),
                                     F_Class.getSelectedItem().toString(),
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

    private void mdp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdp1ActionPerformed

    private void book_flight_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_flight_button1ActionPerformed
        if (F_Type.getSelectedItem() != "Select"){
            if (F_From.getSelectedItem() != ""){
                if (F_To.getSelectedItem() != ""){
                    if (F_Class.getSelectedItem() != ""){
                        if (passport.getText() != "" && passport.getText().length() == 9){
                            if (namae.getText() != "" && namae.getText().length() >= 6){
                                
                                
                                
                                var result = flightdb.addFlight(
                                    F_Type.getSelectedItem().toString(),
                                    F_To.getSelectedItem().toString(),
                                    F_From.getSelectedItem().toString(),
                                    F_Class.getSelectedItem().toString(),
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
        
        
        
    }//GEN-LAST:event_book_flight_button1ActionPerformed
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton book_flight_button;
    private javax.swing.JButton book_flight_button1;
    private javax.swing.JTextField date_of_flight;
    private javax.swing.JTextField date_of_flight1;
    private javax.swing.JLabel date_of_flight_text;
    private javax.swing.JLabel date_of_flight_text1;
    private javax.swing.JTextField date_of_return;
    private javax.swing.JTextField date_of_return1;
    private javax.swing.JLabel dtr;
    private javax.swing.JLabel dtr1;
    private javax.swing.JLabel flightClassText;
    private javax.swing.JLabel flightFromText;
    private javax.swing.JLabel flightToText;
    private javax.swing.JLabel flightTypeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mdp;
    private javax.swing.JComboBox<String> mdp1;
    private javax.swing.JLabel mode_of_payment_text;
    private javax.swing.JLabel mode_of_payment_text1;
    private javax.swing.JTextField namae;
    private javax.swing.JLabel namaewa;
    private javax.swing.JLabel p_option;
    private javax.swing.JLabel p_option1;
    private javax.swing.JTextField passport;
    private javax.swing.JLabel passport_text;
    private javax.swing.JLabel ps_option1;
    private javax.swing.JLabel ps_option2;
    // End of variables declaration//GEN-END:variables
}
