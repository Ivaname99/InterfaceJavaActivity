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
public class Gato implements InterfaceAnimal<String> {
    
    @Override
    public String hacerSonido(String objet) {
        return "Ay mi gatito: Miau! Miau!";
    }

    @Override
    public String mover(String Objet) {
        return "El gatito de media tonelada se dirige hacia ti...";
    }
    
}
