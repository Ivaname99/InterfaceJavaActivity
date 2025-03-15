/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacejavaactivity;

/**
 *
 * @author membr
 */
public class InterfaceJavaActivity {

    public static void main(String[] args) {
        
        System.out.println("--------------------------------------");
        System.out.println("--- Animales: Sonido y Movimiento");
        Perro perroObj = new Perro();
        Gato gatoObj = new Gato();
        
        System.out.println("##Perro");
        perroObj.hacerSonido();
        perroObj.mover();
        System.out.println("##Gato");
        gatoObj.hacerSonido();
        gatoObj.mover();
        System.out.println("--------------------------------------");
    }
}
