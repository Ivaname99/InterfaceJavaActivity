/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejavaactivity;

import Services.AnimalInterface;

/**
 *
 * @author membr
 */
public class Perro implements AnimalInterface{

    @Override
    public void hacerSonido() {
        System.out.println("Perro que muerde no ladra: Grrrrrr");
    }

    @Override
    public void mover() {
        System.out.println("El perrito llamado princesa ve a un chico... RUN");
    }
    
}
