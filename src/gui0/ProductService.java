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
public class ProductService {
    private Product product;
    private makeConnection1 connection;
    public ProductService(Product product){
        this.product = product;
        connection = new makeConnection1();
    }
    
    public int addProduct(){
        //"INSERT INTO USERNAME.PRODUCTS (PRODUCTS_PRICE, PRODUCT_NAME, PRODUCT_DESCRIPTION, pictures ,admin_id) VALUES ( "+poductPrice+",'"+productName+"','"+productDescribtion+"','"+ImagepathAdd+"',"+adminId+")")
        int res = connection.performQuerey("INSERT INTO USERNAME.PRODUCTS (PRODUCTS_PRICE, PRODUCT_NAME, PRODUCT_DESCRIPTION, PICTURES, ADMIN_ID, quantity)  VALUES ("+product.getProductPrice()+",'"+product.getProductName()+"','"+product.getProductDescription()+"','"+product.getProductImagePath()+"',"+product.getAdminID()+","+product.getQuantity()+")");
        return res;
    }
    public Product getProduct(){
        
        return product;
    }
}
