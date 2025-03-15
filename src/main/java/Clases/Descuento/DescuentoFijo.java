/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Descuento;

import Services.InterfaceDescontable;

/**
 *
 * @author membr
 */
public class DescuentoFijo implements InterfaceDescontable {

    public double cantidadFija;

    public DescuentoFijo (double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }
    
    @Override
    public double calcularDescuento(double precio) {
        double precioFinal = precio - cantidadFija;
        return Math.max(precioFinal, 0);
    }
    
}
