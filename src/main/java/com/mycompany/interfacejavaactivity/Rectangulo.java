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
public class Rectangulo implements InterfazFiguraGeometrica {

    private double largo, ancho;
    
    
    
    @Override
    public Object area(Double a) {
        return largo * ancho;
    }

    @Override
    public Object perimetro(Double b) {
        return 2 * (largo + ancho);
    }
    
}
