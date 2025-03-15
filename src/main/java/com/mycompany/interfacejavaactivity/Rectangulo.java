/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejavaactivity;

import Services.InterfazFiguraGeometrica;

/**
 *
 * @author membr
 */
public class Rectangulo implements InterfazFiguraGeometrica<Double> {

    public double largo, ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public Double area() {
        return largo * ancho;
    }

    @Override
    public Double perimetro() {
        return 2 * (largo + ancho);
    }
}
