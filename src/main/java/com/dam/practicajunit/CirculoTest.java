
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.dam.practicajunit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author avril.lopezgarcia
 */
public class CirculoTest {

    @Test
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0, c.getRadio());
    }

    @Test
    public void testGetRadio() {
        Circulo c = new Circulo(5.0);
        assertEquals(5.0, c.getRadio());
    }

    @Test
    public void testSetRadio() {
        Circulo c = new Circulo();
        c.setRadio(10.0);
        assertEquals(10.0, c.getRadio());
    }

    @Test
    public void testCalcularArea() {
        Circulo c = new Circulo(1.0);
        assertEquals(Math.PI, c.calcularArea(), 0.0);
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo c = new Circulo(2.0);
        assertEquals(12.56, c.calcularPerimetro(), 0.01);
    }

    @Test
    public void testMostrarRadio() {
        Circulo c = new Circulo(4.0);
        assertEquals("El radio es: 4.0", c.mostrarRadio());
    }

    @Test
    public void testMayorCirculo() {
        Circulo c1 = new Circulo(5.0);
        Circulo c2 = new Circulo(3.0);
        Circulo resultado = Circulo.mayorCirculo(c1, c2);
        assertEquals(c1, resultado);
    }
}
