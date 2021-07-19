/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;

import static gui0.Market.market;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author abdul
 */
public class signUp extends store {

    /**
     * Creates new form signUp
     */
    public signUp() {
        //new log()
        //new sign()
        initComponents();
        //center the program window in the middle of the screen
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UpUserName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        upPass = new javax.swing.JPasswordField();
        upRePass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phoneNoTxtField = new javax.swing.JTextField();
        addressTxtField = new javax.swing.JTextField();
        signUpButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        goToLoginButton = new javax.swing.JButton();
        goToCatalog = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(176, 186, 228));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 27, 49));
        jLabel5.setText("Enter user name");

        jLabel6.setText("type password");

        UpUserName.setText("user name");
        UpUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpUserNameActionPerformed(evt);
            }
        });

        jLabel9.setText("re-type password");

        upPass.setText("jPasswordField2");
        upPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upPassActionPerformed(evt);
            }
        });

        upRePass.setText("jPasswordField3");

        jLabel1.setText("phone no");

        jLabel2.setText("address");

        phoneNoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoTxtFieldActionPerformed(evt);
            }
        });

        addressTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtFieldActionPerformed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(190, 204, 232));
        signUpButton.setText("create account");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        goToLoginButton.setText("back to login panel");
        goToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginButtonActionPerformed(evt);
            }
        });

        goToCatalog.setText("continue discovering shop");
        goToCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToCatalogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goToLoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goToCatalog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goToLoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goToCatalog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upRePass, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(phoneNoTxtField)
                            .addComponent(addressTxtField)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpUserName)
                            .addComponent(upPass, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(321, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(phoneNoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpUserNameActionPerformed

    private void phoneNoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoTxtFieldActionPerformed

    private void addressTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtFieldActionPerformed
    private boolean checkPass(String pass){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!@#$%&]{8,10}$");
        Matcher matcher = pattern.matcher(pass);
        return matcher.find();
    }
     private boolean checkPhoneNo(String pass){
        if(pass.length()!=11)   return false;
        Pattern pattern = Pattern.compile("^[^\\W]+$*$");
        Matcher matcher = pattern.matcher(pass);
        return matcher.find();
    }
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        String userName = UpUserName.getText().trim();
        String pass1 = String.valueOf(upPass.getPassword());
        String pass2 = String.valueOf(upRePass.getPassword());
        String address = String.valueOf(addressTxtField.getText().trim());
        String phoneNo = String.valueOf(phoneNoTxtField.getText().trim());
        boolean isError = false;
        //checking the password
        //wrong pass pattern
        if(! checkPass(pass1) ){
            JOptionPane.showMessageDialog(null,"pass must be at 8-10 inclusive doesn't contain space(s)");
            isError = true;
        }
        if(! pass1.equals(pass2)&& !isError){
            JOptionPane.showMessageDialog(null,"passwords don't match!");
            isError = true;
        }
        if(!checkPhoneNo(phoneNo) && !isError){
            isError = true;
            JOptionPane.showMessageDialog(null,"phone number must be 11 numbers");
        }
        if(! isError ){
            makeConnection1 con = new makeConnection1();
            //checking for prevent duplicated pass or user or both ofcourse
            if(con.checkToPreventDuplication(userName,pass1)){
                JOptionPane.showMessageDialog(null,"try different user name and password ");
            }
            else    
            {con.performQuerey("INSERT INTO USERNAME.CUSTOMERS (USERNAME,PASSWORD,PHONENO,ADDRESS) VALUES ('"+userName+"','"+pass1+"','"+phoneNo+"','"+address+"') ");
                //no error ->account created!
               JOptionPane.showMessageDialog(null,"account created :D");
            }
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void goToLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginButtonActionPerformed
       store.getLog().setVisible(true);
       store.getSign().setVisible(false);
    }//GEN-LAST:event_goToLoginButtonActionPerformed

    private void goToCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToCatalogActionPerformed
        //hide market window
        market.setVisible(false);
        store.getSign().setVisible(false);
        market = new Market();
        market.setVisible(true);
    }//GEN-LAST:event_goToCatalogActionPerformed

    private void upPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upPassActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UpUserName;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JButton goToCatalog;
    private javax.swing.JButton goToLoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField phoneNoTxtField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPasswordField upPass;
    private javax.swing.JPasswordField upRePass;
    // End of variables declaration//GEN-END:variables
}
