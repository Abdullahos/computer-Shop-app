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
public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerPassword;
    private String customerAddress;
    private String customerPhoneNo;

    public Customer(String customerName, String customerPassword, String customerAddress, String customerPhoneNo) {
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerAddress = customerAddress;
        this.customerPhoneNo = customerPhoneNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }
    
    
    
}
