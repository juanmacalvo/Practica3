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
    }


    /**
     * Test of guardaExperto method, of class ManejaExperto.
     */
    @org.junit.Test
    public void testGuardaExperto() {
        System.out.println("guardaExperto");
        String codExperto = "E810";
        String nombre = "pepe";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, sexo, especialidad, null);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.guardaExperto(experto);

    }

    @org.junit.Test
    public void testGuardaExperto2() {
        System.out.println("guardaExperto2");
        String codExperto = "E110";
        String nombre = "pee";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, sexo, especialidad, null);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.guardaExperto(experto);

    }

    @org.junit.Test
    public void testGuardaExperto3() {
        System.out.println("guardaExperto3");
        String codExperto = "E111";
        String nombre = "";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, sexo, especialidad, null);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.guardaExperto(experto);

    }
    
    @org.junit.Test
    public void testGuardaExperto4() {
        System.out.println("guardaExperto4");
        String codExperto = "E666";
        String nombre = "juan";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, especialidad);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.guardaExperto(experto);

    }
    
    
    @org.junit.Test
    public void eliminaExperto() {
        System.out.println("guardaExperto4");
        String codExperto = "E666";
        String nombre = "juan";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, especialidad);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.eliminaExperto(experto);

    }
    
     @org.junit.Test
    public void actualizaExperto() {
        System.out.println("guardaExperto4");
        String codExperto = "E666";
        String nombre = "juan";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, especialidad);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.actualizaExperto(experto);

    }
    
    
     @org.junit.Test
    public void obtenerExperto() {
        System.out.println("guardaExperto4");
        String codExperto = "E666";
        String nombre = "juan";
        String pais = "esp";
        Character sexo = 'M';
        String especialidad = "policia";
        Experto experto = new Experto(codExperto, nombre, pais, especialidad);

        ManejaExperto instance = new ManejaExperto();

        instance.iniciaOperacion();
        instance.obtenerExperto(experto);

    }

}
