/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import static gui0.Market.market;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author abdul
 */
public class makeConnection1{
    private String url ;
    private String user;
    private String pass;
    public makeConnection1(){    
        HardWareOnlineStore storeObj = new HardWareOnlineStore();
        url = storeObj.getUrl();
        user =storeObj.getUser();
        pass = storeObj.getPass();
    }
   //establish connection to database(ABC)
   public Connection connectToDataBase(){
       Connection connection = null;
        try {
                connection = DriverManager.getConnection(url, user, pass);
                return connection;
        }
        catch (SQLException ex) {
                Logger.getLogger(makeConnection1.class.getName()).log(Level.SEVERE, null, ex);
        }
       return connection;
   }
   /*returns ResultSet object suitable for the given querey
   VERY IMPORTANT NOTE!!! 
   THIS METHOD CAN RETURN NULL IF THERE'S NOTHING COMES BACK FROM THE DB
   */
   public  ResultSet resFromDataBase(String query){
        ResultSet res  = null;
        Connection connection = connectToDataBase();
         try {
            Statement st = connection.createStatement(); 
            res = st.executeQuery(query);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
       return res;
   }
   
   //method to check for info in signup to prevent duplication usernname or password:
   public boolean checkToPreventDuplication(String username,String pass){
        ResultSet res;
        String query = "SELECT * FROM CUSTOMERS";
        try{
            res = resFromDataBase(query);
            while(res.next()){
                if(res.getString("username").equals(username) || res.getString("password").equals(pass))    return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;
    }
   //insertData-> performQuerey
   //returns 1 a row @ least affected, otherwise it returns 0
   public int performQuerey(String query){
       Connection connection = connectToDataBase();
       //connection is ok
       if(connection != null){
               Statement st;
           try {    
                    st = connection.createStatement();
                    st.executeUpdate(query);
                    return 1;
              
           } catch (Exception ex) {
               
           }           
       }
       return 0;
   }
}