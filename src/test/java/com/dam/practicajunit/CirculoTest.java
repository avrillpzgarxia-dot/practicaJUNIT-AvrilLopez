/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.practicajunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author avril.lopezgarcia
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0.0, c.getRadio());
    }

    @Test
    void testGetRadio() {
        Circulo c = new Circulo(5.5);
        assertEquals(5.5, c.getRadio());
    }

    @Test
    void testSetRadio() {
        Circulo c = new Circulo();
        c.setRadio(3.3);
        assertEquals(3.3, c.getRadio());
    }

    @Test
    void testCalcularArea() {
        Circulo c = new Circulo(2.0);
        assertEquals(Math.PI * 4.0, c.calcularArea(), 0.0);
    }

    @Test
    void testCalcularPerimetro() {
        Circulo c = new Circulo(2.0);
        assertEquals(2 * Math.PI * 2.0, c.calcularPerimetro(), 0.01);
    }

    @Test
    void testMostrarRadio() {
        Circulo c = new Circulo(7.0);
        assertEquals("Radio: 7.0", c.mostrarRadio());
    }

    @Test
    void testMayorCirculo() {
        Circulo c1 = new Circulo(3.0);
        Circulo c2 = new Circulo(5.0);
        assertEquals(c2, Circulo.mayorCirculo(c1, c2));
    }
    
}
