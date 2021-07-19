/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author abdul
 */
public class Market extends javax.swing.JFrame {
    public static Market market;
 
    static{
         market = new Market();
    }
    //to get market object
    public static Market getMarket(){
        return market;
    }
    //some private stuff
    Admin  adminObj;
    boolean userStatus;
    private JPanel productsPane;
    private final ArrayList<String>allproductsList;
    private boolean anyProductCurrentlyDiplayed;
    
    public Market() {
        // not admin till it's
        adminObj = null;
        //initially not logged till it's.
        userStatus = false;
        //obj : log sign    ,ISADMIN FALSE
        store.initializeLogSignUp();
        setTitle("Shop");
        setPreferredSize(new Dimension(1920 ,1080));  //initially
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        allproductsList = new ArrayList<String>();
        
        JSplitPane splitPane = new JSplitPane();    //to split JFrame into 2 and only 2 components
        splitPane.setEnabled(false);                //user can't modify the size of the any panel
        initComponents();  
        //to center the windows
        setLocationRelativeTo(null);

        // the contentPane is the container that holds all our components
        setLayout(new GridLayout());  // the default GridLayout is like a grid with 1 column and 1 row,(1 cell)
        // we only add one element to the window itself
        add(splitPane);               // due to the GridLayout, our splitPane will now fill the whole window(whole window is the 1 cell)

        //configuring the panels:
        //for accountPane:
        //configuring search icon
        ImageIcon searchIcon = new ImageIcon("searchIcon.jpg");
        //set the size
        Image searchImage = searchIcon.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
        ImageIcon scaledSearchIcon = new ImageIcon(searchImage);
        searchButton.setIcon(scaledSearchIcon);
        accountPane.setBackground(Color.DARK_GRAY);
        //for productsPane
        productsPane = new JPanel();
        Color color = new Color(33,42,50);
        productsPane.setBackground(color);
        
        // let's configure our splitPane:
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);  // we want it to split the window verticaly
        splitPane.setDividerLocation(67);                    // the initial position of the divider is n
        splitPane.setTopComponent(accountPane);                  // at the top we want our "accountPane"
        splitPane.setBottomComponent(productsPane);            // and at the bottom we want our "productsPane"
        
        //diplaying all products
        displayAllProducts();   //diplays these products + put all products' names in allproducts
        anyProductCurrentlyDiplayed = true;
    }//market
    //method to be invoked by Login class
    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
        
    }
    
    //function to create Product Button  
    public JButton createProductButton(ResultSet searchRes){
            JButton imgHolder = null;
            //create image to set it as icon to (imgHolder)
            String productName;
        try {
                productName = searchRes.getString("product_name");
        
                ImageIcon icon = new ImageIcon(searchRes.getString("pictures"));
                Image img = icon.getImage();
                Image imgScaled = img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(imgScaled);
                //configure the (imgHolder)
                imgHolder = new JButton();
                imgHolder.setBackground(Color.DARK_GRAY);
                imgHolder.setForeground(Color.WHITE);
                imgHolder.setSize(200,250);          
                //set the image to the configured image holder
                imgHolder.setIcon(scaledIcon);                        //set button icon with scaledIcon(product image after resizing)
                //set name and price 
                imgHolder.setText(productName+" cost: "+searchRes.getString("products_price")+" LE");//set description as product name
                imgHolder.setHorizontalTextPosition(JButton.CENTER);//centerize description 
                imgHolder.setVerticalTextPosition(JButton.BOTTOM);  //place description below

                
        }
        catch (SQLException ex) {
            System.out.println("null pointer exception");
        }
        return imgHolder;
    }
    @SuppressWarnings("unchecked")
    public void displayAllProducts(){
        productsPane.removeAll();   //initially remove any displayed prodcut
        String querey = "SELECT* FROM PRODUCTS";
        ResultSet res  = new makeConnection1().resFromDataBase(querey); //return ResultSet containing all products in the db
        JButton productButton;
        try {
            //parse over the result(products in this case)
            while(res.next()){
                productButton = createProductButton(res);   //get the button containing all necessary info about that product
                productsPane.add(productButton);       //add this button to the panel
                allproductsList.add(productButton.getText());
                productButton.addActionListener(new ButtonAction());   //add actionListner to this button
            }
        }
        //when there's no more product do nothing, just to avoid null poiner exception
        catch(Exception e){
                
        }           
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountPane = new javax.swing.JPanel();
        loginButtonCustomer = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        loginButtonAdmin = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        showAlProductButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButtonCustomer.setText("log in");
        loginButtonCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonCustomerActionPerformed(evt);
            }
        });

        signupButton.setText("sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        loginButtonAdmin.setText("Admin");
        loginButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonAdminActionPerformed(evt);
            }
        });

        searchBar.setText("Enter product name to search for");

        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        showAlProductButton.setText("Show all products");
        showAlProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAlProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountPaneLayout = new javax.swing.GroupLayout(accountPane);
        accountPane.setLayout(accountPaneLayout);
        accountPaneLayout.setHorizontalGroup(
            accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPaneLayout.createSequentialGroup()
                .addGroup(accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPaneLayout.createSequentialGroup()
                        .addComponent(loginButtonCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupButton))
                    .addComponent(loginButtonAdmin))
                .addGroup(accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPaneLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAlProductButton))))
        );
        accountPaneLayout.setVerticalGroup(
            accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPaneLayout.createSequentialGroup()
                .addGroup(accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginButtonCustomer)
                        .addComponent(signupButton)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(accountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPaneLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(loginButtonAdmin))
                    .addGroup(accountPaneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showAlProductButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(accountPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(accountPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //function do displays products searched for 
    public boolean showSearchedProducts(ResultSet searchRes){
        int counter = 0;
        //anymatch inidcation if there's a matching for this search(false) or not
        //if there's a match then show these products, else then keep the current show and tell the user that to try different keyword.
        boolean anymatch = false;
        try {
            while(searchRes.next()){
                                                        //note this style:
                if(counter==0) {                        //
                    productsPane.removeAll();           //
                    anymatch = true;                    //
                    counter++;                          //  
                }                                       //
                JButton prodcutButton = createProductButton(searchRes);                
                String productName = prodcutButton.getText().split(" cost")[0];
                
                productsPane.add(prodcutButton);
                prodcutButton.addActionListener(new ButtonAction());   //add actionListner to this button
                
        }
        //no match with this key word, do nothing OR NO MORE RESULTS <- this isn't true!!!!!
        } catch (Exception ex) {
            
        }
        return anymatch;
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //get the search keyword
        String itemsNameToSearchFor = searchBar.getText().trim();
        ResultSet res = null;
        //if user entered thing except empty string or only space
        if(!itemsNameToSearchFor.equals("")){
            String[] keyWordsSearch = itemsNameToSearchFor.split(" ");

            String keyWords = "";
            for(int i = 0 ; i< keyWordsSearch.length; i++){
                //note: WHERE column LIKE "%%"    will always evaulte to true, so if the  keyWordsSearch[i].trim() is "" then don't cosider this as a keyword->don't search for it.
                //to avoid considereing space as a keyword for searching
                if(!keyWordsSearch[i].trim().equals("")){
                    keyWords += "'%"+keyWordsSearch[i]+"%'"; 
                    if(i!=keyWordsSearch.length-1)  keyWords += " OR PRODUCT_NAME LIKE ";
                }
            }
            System.out.println(keyWords);
            //querey using (keyWords)
            String querey = "SELECT* FROM PRODUCTS WHERE PRODUCT_NAME LIKE "+keyWords+" OR PRODUCT_DESCRIPTION LIKE "+keyWords;
            res = new makeConnection1().resFromDataBase(querey);

            //show the product of this result(res)
            if(showSearchedProducts(res))   {}  //if evaluated to true, then there's at least one match of this search, and it's already executed and products printed on sceen
            else JOptionPane.showMessageDialog(null,"Sorry there's no matching result for this search \n but you can try another input "); 
        }
        //if user didn't enter any thing, empty string, or only space
        else    JOptionPane.showMessageDialog(null,"Sorry there's no matching result for this search \n but you can try another input "); 
        
        
        productsPane.revalidate();   productsPane.repaint();    //to refresh the panel

    }//GEN-LAST:event_searchButtonActionPerformed

    private void loginButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonAdminActionPerformed
        //ask if the user is admin or not(already logged in or not)
        //not admin yet!
        if(String.valueOf(store.getLog().getAdminObj()).equals("null")){
            market.setVisible(false);
            //isn't admin yet
            store.getLog().setIsAdmin(true);    //to querey on admins table
            store.getLog().setVisible(true);
        }
        //already logged as admin
        else    {
            //hide market
            setVisible(false);
            //show admin page
            store.getLog().getAdminObj().setVisible(true);
        }
            
    }//GEN-LAST:event_loginButtonAdminActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        market.setVisible(false);
        store.getSign().setVisible(true);
    }//GEN-LAST:event_signupButtonActionPerformed

    private void loginButtonCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonCustomerActionPerformed
        market.setVisible(false);
        store.getLog().setVisible(true);
    }//GEN-LAST:event_loginButtonCustomerActionPerformed

    private void showAlProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAlProductButtonActionPerformed
        //clean
        productsPane.removeAll();
        //show all product
        displayAllProducts();
        //to refresh the panel
        refreshProductPanel();
    }//GEN-LAST:event_showAlProductButtonActionPerformed
    static class ButtonAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            String productName = ((JButton) ae.getSource()).getText().split("cost: ")[0];    //as the text is composed of product name +"cost: "+price
            ProductPage prodPage = new ProductPage(productName);
            
        }
    
}
    public void refreshProductPanel(){
        //to refresh the panel
        productsPane.revalidate();   
        productsPane.repaint();   
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
            java.util.logging.Logger.getLogger(Market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Market.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                market.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPane;
    private javax.swing.JButton loginButtonAdmin;
    private javax.swing.JButton loginButtonCustomer;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton showAlProductButton;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
