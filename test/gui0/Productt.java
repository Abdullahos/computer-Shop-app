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
    private String produdct_name;
    private float product_price;
    private String product_describtion;

    public void setProdudct_name(String produdct_name) {
        this.produdct_name = produdct_name;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public void setProduct_describtion(String product_describtion) {
        this.product_describtion = product_describtion;
    }

    public String getProdudct_name() {
        return produdct_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public String getProduct_describtion() {
        return product_describtion;
    }

    public Product(String produdct_name, float product_price, String product_describtion) {
        this.produdct_name = produdct_name;
        this.product_price = product_price;
        this.product_describtion = product_describtion;
    }
    
}
