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
public class Circulo implements InterfazFiguraGeometrica {

    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public Object area(Double a) {
        return Math.PI * radio * radio;
    }

    @Override
    public Object perimetro(Double b) {
        return 2 * Math.PI * radio;
    }
    
}
