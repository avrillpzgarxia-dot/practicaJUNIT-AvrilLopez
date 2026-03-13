
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.dam.practicajunit;

/**
 *
 * @author avril.lopezgarcia
 */
public class CirculoTest {
    private double radio;

    public CirculoTest() {
        this.radio = 0;
    }

    public CirculoTest(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String mostrarRadio() {
        return "El radio es: " + radio;
    }

    public static CirculoTest mayorCirculo(CirculoTest c1, CirculoTest c2) {
        if (c1.getRadio() >= c2.getRadio()) {
            return c1;
        } else {
            return c2;
        }
    }
}
