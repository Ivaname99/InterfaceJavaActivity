/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacejavaactivity;

import Services.AnimalInterface;

/**
 *
 * @author membr
 */
public class InterfaceJavaActivity {

    public static void main(String[] args) {
        
        System.out.println("--------------------------------------");
        System.out.println("---> Animales: Sonido y Movimiento");
        Perro perroObj = new Perro();
        Gato gatoObj = new Gato();
        
        System.out.println("## Perro");
        System.out.println(perroObj.hacerSonido(""));
        System.out.println(perroObj.mover(""));
        System.out.println("");
        System.out.println("## Gato");
        System.out.println(gatoObj.hacerSonido(""));
        System.out.println(gatoObj.mover(""));
        
        /*=================== Vehiculos: Arrancar y Detener ======================*/
        
        System.out.println("--------------------------------------");
        System.out.println("---> Vehiculos: Arrancar y Detener");
        Coche cocheObj = new Coche();
        Bicicleta bicicletaObj = new Bicicleta();
        
        System.out.println("## Coche");
        System.out.println(cocheObj.arrancar(""));
        System.out.println(cocheObj.detener(""));
        System.out.println("");
        System.out.println("## Bicicleta");
        System.out.println(bicicletaObj.arrancar(""));
        System.out.println(bicicletaObj.detener(""));
        System.out.println("--------------------------------------");

    }
}
