/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._a1;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class countjavafileTest {
    
    public countjavafileTest() {
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
     * Test of count method, of class countjavafile.
     */
    @Test
    public void testCount() {
        System.out.println("countjavafile");
        File f = new File("C:\\Users\\USER\\Desktop\\testfile");
        int expResult = 4;
        int result = countjavafile.count(f);
        assertEquals(expResult, result);
    }
    
}
