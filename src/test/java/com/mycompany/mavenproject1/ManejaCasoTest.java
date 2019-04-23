/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JUANM
 */
public class ManejaCasoTest {
    
    public ManejaCasoTest() {
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
     * Test of iniciaOperacion method, of class ManejaCaso.
     */
    @Test
    public void testIniciaOperacion() {
        System.out.println("iniciaOperacion");
        ManejaCaso instance = new ManejaCaso();
        instance.iniciaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizaOperacion method, of class ManejaCaso.
     */
    @Test
    public void testFinalizaOperacion() {
        System.out.println("finalizaOperacion");
        ManejaCaso instance = new ManejaCaso();
        instance.finalizaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejaExcepcion method, of class ManejaCaso.
     */
    @Test
    public void testManejaExcepcion() {
        System.out.println("manejaExcepcion");
        HibernateException he = null;
        ManejaCaso instance = new ManejaCaso();
        instance.manejaExcepcion(he);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardaCaso method, of class ManejaCaso.
     */
    @Test
    public void testGuardaCaso() {
        System.out.println("guardaCaso");
        CasoPolicial caso = null;
        ManejaCaso instance = new ManejaCaso();
        instance.guardaCaso(caso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borraCaso method, of class ManejaCaso.
     */
    @Test
    public void testBorraCaso() {
        System.out.println("borraCaso");
        CasoPolicial caso = null;
        ManejaCaso instance = new ManejaCaso();
        instance.borraCaso(caso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listCaso method, of class ManejaCaso.
     */
    @Test
    public void testListCaso() throws Exception {
        System.out.println("listCaso");
        ManejaCaso instance = new ManejaCaso();
        ArrayList<CasoPolicial> expResult = null;
        ArrayList<CasoPolicial> result = instance.listCaso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
