/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;

/**
 *
 * @author abdul
 */
public class CustomerService {
    private Customer  customer;
     makeConnection1 connection;

    public CustomerService(Customer customer) {
        this.customer = customer;
        connection = new makeConnection1();
    }

    
    public int addCustomer(){
                                                                               //('"+userName+"','"+pass1+"','"+phoneNo+"','"+address+"') ")
        int addCustomerStatus = connection.performQuerey("INSERT INTO USERNAME.CUSTOMERS (USERNAME,PASSWORD,PHONENO,ADDRESS) VALUES ('"+customer.getCustomerName()+"','"+customer.getCustomerPassword()+"','"+customer.getCustomerPhoneNo()+"','"+customer.getCustomerAddress()+"')");
        return addCustomerStatus;
    }
    
    public Customer getCustomer(){  
        //customer = connection.performQuerey();
        return customer;
    }
    
    
}
