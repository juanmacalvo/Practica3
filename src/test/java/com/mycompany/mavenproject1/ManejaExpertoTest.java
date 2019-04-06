/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

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
public class ManejaExpertoTest {
    
    public ManejaExpertoTest() {
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
     * Test of iniciaOperacion method, of class ManejaExperto.
     */
    @org.junit.Test
    public void testIniciaOperacion() {
        System.out.println("iniciaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.iniciaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalizaOperacion method, of class ManejaExperto.
     */
    @org.junit.Test
    public void testFinalizaOperacion() {
        System.out.println("finalizaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.finalizaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejaExcepcion method, of class ManejaExperto.
     */
    @org.junit.Test
    public void testManejaExcepcion() {
        System.out.println("manejaExcepcion");
        HibernateException he = null;
        ManejaExperto instance = new ManejaExperto();
        instance.manejaExcepcion(he);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardaExperto method, of class ManejaExperto.
     */
    @org.junit.Test
    public void testGuardaExperto() {
        System.out.println("guardaExperto");
        Experto experto = null;
        ManejaExperto instance = new ManejaExperto();
        instance.guardaExperto(experto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
