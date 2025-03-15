/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejavaactivity;

import Services.InterfacePago;

/**
 *
 * @author membr
 */
public class PagoConEfectivo implements InterfacePago {

    @Override
    public Object procesarPago(Double cantidad) {
        return "Pago en efectivo recibido: $" + cantidad;
    }
    
}
