/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.practicajunit;

/**
 *
 * @author DANA
 */
public class Circulo { 
    private double radio; 

    public Circulo() {  
        this.radio = 0.0;  
    }

    public Circulo(double radio) {  
        this.radio = radio; 
    }  

    public double getRadio() {
        return radio; 
    } 
 
    public void setRadio(double radio) { 
        this.radio = radio; 
    } 
 
    public double calcularArea() { 
        return Math.PI * radio * radio; 
    } 

    public double calcularPerimetro() { 
        return 2 * Math.PI * radio; 
    } 

    public String mostrarRadio() { 
        return "Radio: " + radio; 
    } 

    public static Circulo mayorCirculo(Circulo c1, Circulo c2) { 
        return (c1.radio >= c2.radio) ? c1 : c2; 
    }
} 