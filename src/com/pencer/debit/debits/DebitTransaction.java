/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pencer.debit.debits;


import java.awt.Color;

/**
 *
 * @author maina
 */
public class DebitTransaction extends javax.swing.JInternalFrame {
    
    private javax.swing.JDesktopPane desktopPane=null;
    private java.sql.Connection connection=null;
    private com.pencer.search.SearchDialog sd=null;
    
    /**
     * Creates new form CreditTransaction
     */
    public DebitTransaction(java.sql.Connection conn, javax.swing.JDesktopPane jdp) {
        
        connection=conn;
        desktopPane=jdp;
        
        desktopPane.add(this);
        
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
        java.awt.GridBagConstraints gridBagConstraints;

        motherjPanel = new javax.swing.JPanel();
        searchjPanel = new javax.swing.JPanel();
        debitjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        detailsjPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amtDebjTextField = new javax.swing.JTextField();
        acNojComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        datejTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        bankNamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reasonjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonsjPanel = new javax.swing.JPanel();
        clearFieldsjButton = new javax.swing.JButton();
        closejButton = new javax.swing.JButton();
        creditAcjButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Account Debit Transaction");
        setPreferredSize(new java.awt.Dimension(700, 370));
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        motherjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        motherjPanel.setLayout(new java.awt.GridBagLayout());

        searchjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchjPanel.setLayout(new java.awt.GridBagLayout());

        debitjTextField.setEditable(false);
        debitjTextField.setText("LEWIS MAINA KABUI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        searchjPanel.add(debitjTextField, gridBagConstraints);

        jLabel1.setText("Search Debitor Here");
        jLabel1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 25);
        searchjPanel.add(jLabel1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Search");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        searchjPanel.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        motherjPanel.add(searchjPanel, gridBagConstraints);

        detailsjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        detailsjPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Amount Debited");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        detailsjPanel.add(jLabel2, gridBagConstraints);

        amtDebjTextField.setColumns(10);
        amtDebjTextField.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        amtDebjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amtDebjTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amtDebjTextFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        detailsjPanel.add(amtDebjTextField, gridBagConstraints);

        try{
            java.sql.Statement stt=connection.createStatement();
            java.sql.ResultSet rset=stt.executeQuery("SELECT '-' AS account_no UNION SELECT account_no FROM income_accounts ORDER BY account_no");

            while(rset.next()){
                acNojComboBox.addItem(rset.getString(1));
            }

        }catch(java.sql.SQLException sqle){
            sqle.printStackTrace();
        }
        acNojComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acNojComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        detailsjPanel.add(acNojComboBox, gridBagConstraints);

        jLabel4.setText("Bank Name");
        jLabel4.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        detailsjPanel.add(jLabel4, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 25);
        jPanel1.add(jLabel3, gridBagConstraints);

        datejTextField.setEditable(false);
        datejTextField.setColumns(10);
        datejTextField.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(datejTextField, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("Set Date");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 12, 12);
        detailsjPanel.add(jPanel1, gridBagConstraints);

        bankNamejTextField.setEditable(false);
        bankNamejTextField.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        detailsjPanel.add(bankNamejTextField, gridBagConstraints);

        jLabel5.setText("Account Debited");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        detailsjPanel.add(jLabel5, gridBagConstraints);

        reasonjTextField.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        detailsjPanel.add(reasonjTextField, gridBagConstraints);

        jLabel6.setText("Occasion/ Reason");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        detailsjPanel.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 12, 0);
        motherjPanel.add(detailsjPanel, gridBagConstraints);

        buttonsjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonsjPanel.setLayout(new java.awt.GridBagLayout());

        clearFieldsjButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        clearFieldsjButton.setText("Clear Fields");
        clearFieldsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        buttonsjPanel.add(clearFieldsjButton, gridBagConstraints);

        closejButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        closejButton.setText("Close");
        closejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closejButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        buttonsjPanel.add(closejButton, gridBagConstraints);

        creditAcjButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        creditAcjButton.setText("Debit Account");
        creditAcjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditAcjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        buttonsjPanel.add(creditAcjButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 0);
        motherjPanel.add(buttonsjPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(motherjPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.Point point=debitjTextField.getLocationOnScreen();
        
        sd=new com.pencer.search.SearchDialog(true,connection,
        "SELECT creditor_name, address, relation FROM creditors ",
        "WHERE creditor_name LIKE '%", 
        "%' ORDER BY creditor_name");
        
        sd.addSearchDialogListener(new javax.swing.event.ListSelectionListener(){
            
            int selectedIndex=-1;
            
            public void valueChanged(javax.swing.event.ListSelectionEvent lse){
                
                selectedIndex=sd.getSearchJTable().getSelectionModel().getMinSelectionIndex();
                
                debitjTextField.setText(sd.getSearchJTable().getValueAt(selectedIndex, 0).toString());
                
                sd.dispose();
            }
        });

        sd.setLocation(point);
        sd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        com.pencer.utility.DatePicker dp=new com.pencer.utility.DatePicker(datejTextField);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearFieldsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsjButtonActionPerformed
        // TODO add your handling code here:
        //debitjTextField.setText("");
        datejTextField.setText("");
        acNojComboBox.setSelectedIndex(0);
        amtDebjTextField.setText("");
        bankNamejTextField.setText("");
        reasonjTextField.setText("");
    }//GEN-LAST:event_clearFieldsjButtonActionPerformed

    private void acNojComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acNojComboBoxActionPerformed
        // TODO add your handling code here:
        
        if(acNojComboBox.getSelectedItem().equals("-")){
            
            bankNamejTextField.setText("JACK SQUAT");
            
        }else{
            try{
                java.sql.Statement stat=connection.createStatement();
                java.sql.ResultSet nameSet=stat.executeQuery("SELECT bank FROM income_accounts WHERE account_no='"+acNojComboBox.getSelectedItem()+"'");
            
                while(nameSet.next()){
                    bankNamejTextField.setText(nameSet.getString(1));
                }
            
            }catch(java.sql.SQLException sqle){
                sqle.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_acNojComboBoxActionPerformed

    private void closejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closejButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closejButtonActionPerformed

    private void creditAcjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditAcjButtonActionPerformed
        // TODO add your handling code here:
        if(debitjTextField.getText()==null||debitjTextField.getText().length()<1||
                datejTextField.getText()==null||datejTextField.getText().length()<1||
            amtDebjTextField.getText()==null||amtDebjTextField.getText().length()<1||
                acNojComboBox.getSelectedItem().equals("-")||
                reasonjTextField.getText()==null||reasonjTextField.getText().length()<1){
            
            javax.swing.JOptionPane.showMessageDialog(this, "Please ensure the fields have valid data!",
                    "Error on save!",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            try{
                
                connection.setAutoCommit(false);
                java.lang.String accountID=null,creditorID=null;
                
                java.sql.Statement stt=connection.createStatement();
                java.sql.ResultSet rset=stt.executeQuery("SELECT account_id FROM income_accounts "
                                                        + "WHERE account_no= '"+acNojComboBox.getSelectedItem() + "' "
                                                        + "AND bank='"+bankNamejTextField.getText()+"'");
                while(rset.next()){
                    accountID=rset.getString(1);
                }
                
                rset.close();
                stt.close();
                
                stt=connection.createStatement();
                rset=stt.executeQuery("SELECT creditor_id FROM creditors WHERE creditor_name='"+debitjTextField.getText()+"'");
                while(rset.next()){
                    creditorID=rset.getString(1);
                }
                
                java.lang.String amtBilaCommas=amtDebjTextField.getText().replaceAll(",", "");
                
                
                java.sql.PreparedStatement savePs=connection.prepareStatement("INSERT INTO account_transactions (account_id, creditor_id, credit, debit, trans_date, description) VALUES (?,?,?,?,?,?)");
                savePs.setString(1, accountID);
                savePs.setString(2, creditorID);
                savePs.setString(3, "0.00");
                savePs.setString(4, amtBilaCommas);
                savePs.setString(5, datejTextField.getText());
                savePs.setString(6, reasonjTextField.getText().toUpperCase());
                
                savePs.executeUpdate();
                
                connection.commit();
                connection.setAutoCommit(true);
                
                javax.swing.JOptionPane.showMessageDialog(this, "Account Debit Successful!",
                    "Insert Successful!",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                clearFieldsjButton.doClick();
                
            }catch(java.sql.SQLException sqle){
                System.err.println("Commit error!");
                
                sqle.printStackTrace();
                
                try{
                    
                    connection.rollback();
                    connection.setAutoCommit(false);
                    
                }catch(java.sql.SQLException sqlex){
                    
                    System.err.println("Rollback error!");
                    
                    sqlex.printStackTrace();
                }
            }
                
        }
    }//GEN-LAST:event_creditAcjButtonActionPerformed

    private void amtDebjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amtDebjTextFieldFocusLost
        // TODO add your handling code here:
        java.text.NumberFormat nf=java.text.NumberFormat.getNumberInstance();

        try{
            amtDebjTextField.setText(nf.format(Double.parseDouble(amtDebjTextField.getText())));
            
        }catch(java.lang.NumberFormatException nfe){
            amtDebjTextField.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_amtDebjTextFieldFocusLost

    private void amtDebjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amtDebjTextFieldFocusGained
        // TODO add your handling code here:
        amtDebjTextField.setForeground(Color.black);
    }//GEN-LAST:event_amtDebjTextFieldFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox acNojComboBox;
    private javax.swing.JTextField amtDebjTextField;
    private javax.swing.JTextField bankNamejTextField;
    private javax.swing.JPanel buttonsjPanel;
    private javax.swing.JButton clearFieldsjButton;
    private javax.swing.JButton closejButton;
    private javax.swing.JButton creditAcjButton;
    private javax.swing.JTextField datejTextField;
    private javax.swing.JTextField debitjTextField;
    private javax.swing.JPanel detailsjPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel motherjPanel;
    private javax.swing.JTextField reasonjTextField;
    private javax.swing.JPanel searchjPanel;
    // End of variables declaration//GEN-END:variables
}