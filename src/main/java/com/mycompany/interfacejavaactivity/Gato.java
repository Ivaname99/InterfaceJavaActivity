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
public class Gato implements AnimalInterface {

    @Override
    public void hacerSonido() {
        System.out.println("Ay mi gatito: Miau! Miau!");
    }

    @Override
    public void mover() {
        System.out.println("El gatito de media tonelada se dirige hacia ti...");
    }
    
}
