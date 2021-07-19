/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author abdul
 */
//class to make connection t data base, also contains methods to perform some operations on database 
public class makeConnection extends javax.swing.JFrame{
    private static String url ;
    private static String user;
    private static String pass;
    public makeConnection(){    
        //url of the data base, use -> username,and pass->database password
        url = "jdbc:derby://localhost:1527/ABC";
        user = "username";
        pass = "password";
    }
    //method to make connection to the required data base and return Connection obj that we can manipulate the data base through.
   public  Connection connectToDataBase(){
       Connection connection = null;
        try {
                connection = DriverManager.getConnection(url, user, pass);
                return connection;
        }
        catch (SQLException ex) {
                Logger.getLogger(makeConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       return connection;
   }
   //methode to return the result of specific query taking it as parameter.
   
   public int performQuerey(String query){
       Connection connection = connectToDataBase();
       PreparedStatement pst;
       //connection is ok
       if(connection != null){
           try {
               /* A SQL statement is precompiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times. 
               prepareStatement returns 1 if the row found, otherwise it returns 0
               */
                pst = connection.prepareStatement(query);
                return pst.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"error happend give the technichal support this code:makeConnection,LINE:128");
           }
       }
        return 0;       
    }
       /* public static Connection getConnection(){
        Connection connection = null;
        ResultSet res = null; 
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName("localhost");
        datasource.setUser("username");
        datasource.setPassword("password");
        datasource.setDatabaseName("ABC");
        datasource.setPort(1527);
        
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(makeConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
*/
}
        