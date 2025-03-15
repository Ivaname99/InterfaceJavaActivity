/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.FigurasGeometricas;

import Services.InterfazFiguraGeometrica;

/**
 *
 * @author membr
 */
public class Circulo implements InterfazFiguraGeometrica<Double> {

    public double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public Double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}
