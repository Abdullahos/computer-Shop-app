/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;

import static gui0.Market.market;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author abdul
 */
public class login extends store {

    /**
     * Creates new form login
     */
    private makeConnection1 con;
    private String userNameOrEmail;
    private String  password;
    private  int id;
    private boolean isAdmin = false;
    public login() {
        initComponents();
        con = new makeConnection1();
        //center the program window in the middle of the screen
        this.setLocationRelativeTo(null);
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getUserNameOrEmail() {
        return userNameOrEmail;
    }

    public  int getId() {
            ResultSet res;
            Connection connection = con.connectToDataBase();
            
        try {
            Statement st ;
            st = connection.createStatement();
            if(isAdmin)
                    try {
                        res = st.executeQuery("select id from admin where name= '"+userNameOrEmail+"' and password= '"+password+"'");
                        res.next();
                        id = res.getInt("id");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return id;
    }

    public String getPassword() {
        return password;
    }
     //method to check the Credintials of the visitor either a customer or admin
    //NOTE: THIS METHODE OR MORE SECURE THAN USING  WHEER USERNAME='+USERNAME+"'+ AND PASSWORD = '"+PASS+"'
    //TO PREVEDNT SQL INJECTION --> U ALSO CAN USE A FIREWALL THAT CHECK FOR CERTAIN INPUTS LIKE  ANY OF "+"OR 1=1"TRUE,....
   public boolean checkCredintials(String username,String pass){ 
       ResultSet resCust = null;//to hold the result of query from customer table
       ResultSet resAdmin = null;//to hold the result of query from admin table
        //found--> to check at the end if there's account linked to the enterd data or not
        boolean found = false;
        String custQuery = "SELECT * FROM CUSTOMERS";
        String adminQuery = "SELECT * FROM ADMIN";
        
    //check if it's customer's data
        if(!isAdmin){
             resCust = con.resFromDataBase(custQuery);
            try {
                while(resCust.next()){
                    if(resCust.getString("USERNAME").equals(username) && resCust.getString("password").equals(pass)){
                        JOptionPane.showMessageDialog(null,"welcom "+username);
                        store.getLog().setVisible(false);
                        market = new Market();
                        market.setVisible(true);
                        found = true;
                        break;
                    }
                }
            }
            catch (Exception ex) {
            }
        }
        else{
            // check if it's admin's data
                try {
                    resAdmin = con.resFromDataBase(adminQuery);
                    while(resAdmin.next()){
                        if(resAdmin.getString("name").equals(username) && resAdmin.getString("password").equals(pass)){

                            Admin admin = new Admin();
                            admin.setVisible(true);
                            store.getLog().setVisible(false);
                            found = true;
                            break;
                        }
                    }  
                }
                catch (Exception ex) {

                }
        }
            if(found == false){
                JOptionPane.showMessageDialog(null,"wrong credintials");
                return false;
            }
            return true;
 }
   //method to check for info in signup to prevent duplication usernname or password:
   public boolean checkToPreventDuplication(String username,String pass){
        ResultSet res;
        String query = "SELECT * FROM CUSTOMERS";
        try{
            res = con.resFromDataBase(query);
            while(res.next()){
                if(res.getString("username").equals(username) || res.getString("password").equals(pass))    return true;
            }
        }
        catch(SQLException e){
            return false;
        }
        return false;
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(221, 235, 248));

        usernameLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(54, 50, 50));
        usernameLabel.setText("Enter email address");

        passLabel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(50, 50, 50));
        passLabel.setText("Enter your Password");

        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTextField.setText("E-mail or user name");
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
        });
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Don't have account?");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("easy let's creat one,it takes a moment !");

        createAccountButton.setBackground(new java.awt.Color(204, 204, 204));
        createAccountButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createAccountButton.setText("Creat Customer Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 50, 50));
        jLabel7.setText("or username");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createAccountButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(usernameLabel)
                            .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(emailTextField))))
                .addGap(63, 63, 63))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(310, 310, 310))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained

    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        userNameOrEmail = emailTextField.getText().trim();
        password = String.valueOf(jPasswordField1.getPassword());
       Connection connection = con.connectToDataBase();
       
       try{
            Statement st = connection.createStatement();
            ResultSet res;
            //if creditial is ok
            if(checkCredintials(userNameOrEmail, password)){

                //admin
                if(isAdmin)
                    res = st.executeQuery("select id from admin where name= '"+userNameOrEmail+"' and password= '"+password+"'");
                
                    
                //customer
                else
                    res = st.executeQuery("select id from customers where username='"+userNameOrEmail+"' and password='"+password+"'");

                    //it's only one record, moving parser
                    res.next();                                                              
                    id = res.getInt("id");
                }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
       }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        store.getSign().setVisible(true);
        store.getLog().setVisible(false);
    }//GEN-LAST:event_createAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
