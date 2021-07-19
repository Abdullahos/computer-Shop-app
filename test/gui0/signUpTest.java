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
public class signUpTest {
    
    public signUpTest() {
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
     * Test of checkPass method, of class signUp.
     */
    /*@Test
    public void testCheckPass() {
        
    }
*/
    /**
     * Test of main method, of class signUp.
     */
    //pass must be at 8-10 inclusive doesn't contain space(s)
    @Test
    public void testMain() {
        String pass = "8ljnj.39 ";    
        signUp s = new signUp();
        boolean res = s.checkPass(pass);
        boolean expect = false;
        assertEquals(res, expect);        
    }
    
}
