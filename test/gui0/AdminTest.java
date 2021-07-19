/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdul
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFilePath method, of class Admin.
     */
    
    /*
    @Test
    public void testGetFilePath() {
        System.out.println("getFilePath");
        Admin instance = new Admin();
        String expResult = "";
        String result = instance.getFilePath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of viewAdminsActivityHistory method, of class Admin.
     */
    
    /*
    @Test
    public void testViewAdminsActivityHistory() {
        System.out.println("viewAdminsActivityHistory");
        Admin instance = new Admin();
        instance.viewAdminsActivityHistory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    
    /**
     * Test of editProduct method, of class Admin.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        String productId = "78";
        Admin instance = new Admin();
        instance.editProduct(productId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProduct method, of class Admin.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        String id = "77";
        Admin instance = new Admin();
        instance.removeProduct(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Admin.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String productName = "test1";
        String productDescribtion = "just test the application";
        double poductPrice = 199;
        int quantity = 1;
        String imgPath = "noAvailable.jpg";
        Admin instance = new Admin();
        instance.addProduct(productName, productDescribtion, poductPrice, quantity, imgPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaysProductList method, of class Admin.
     */
    /*
    @Test
    public void testDisplaysProductList() {
        System.out.println("displaysProductList");
        Admin instance = new Admin();
        instance.displaysProductList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of main method, of class Admin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Admin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
