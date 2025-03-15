/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejavaactivity;

import Services.InterfaceVehiculo;

/**
 *
 * @author membr
 */
public class Coche implements InterfaceVehiculo<String>{

    @Override
    public String arrancar(String objet) {
        return "El coche esta arrancando.";
    }

    @Override
    public String detener(String objet) {
        return "El coche se ha detenido.";
    }
    
}
