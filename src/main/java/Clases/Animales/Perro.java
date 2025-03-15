/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Animales;

import Services.InterfaceAnimal;

/**
 *
 * @author membr
 */
public class Perro implements InterfaceAnimal<String> {

    @Override
    public String hacerSonido(String objet) {
        return "Perro que muerde no ladra: Grrrrrr";
    }

    @Override
    public String mover(String objet) {
        return "El perrito llamado Princesa ve a un chico... RUN";
    }
}
