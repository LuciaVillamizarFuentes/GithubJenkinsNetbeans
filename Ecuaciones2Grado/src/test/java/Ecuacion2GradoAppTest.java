/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class Ecuacion2GradoAppTest {
    
    public Ecuacion2GradoAppTest() {
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
     * Test of calcular method, of class Ecuacion2GradoApp.
     */
    @org.junit.Test
    public void testCalcular() {
        System.out.println("calcular");
        int a = 2;
        int b = 9;
        int c = 10; 
        double i[]  = new double [2];
        i[0]=-2.0;
        i[1]=-2.5;
        double[] expResult = i;
        double[] result = Ecuacion2GradoApp.calcular(a, b, c);
        
        if(result[0]==i[0]){
        
        }else{
        fail("no");
        }
        //assertArrayEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Ecuacion2GradoApp.
     */
    
    
}
