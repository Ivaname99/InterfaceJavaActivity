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
public class Perro implements AnimalInterface<String> {

    @Override
    public String hacerSonido(String objet) {
        return "Perro que muerde no ladra: Grrrrrr";
    }

    @Override
    public String mover(String objet) {
        return "El perrito llamado Princesa ve a un chico... RUN";
    }
}
