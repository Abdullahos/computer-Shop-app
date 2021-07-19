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
public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private int quantity;
    private String productDescription;
    private String productImagePath;
    private int adminID;
    

    public Product(String productName, double productPrice, int quantity, String productDescription, String productImagePath, int adminID) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.productDescription = productDescription;
        this.productImagePath = productImagePath;
        this.adminID = adminID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }
    
    
}
