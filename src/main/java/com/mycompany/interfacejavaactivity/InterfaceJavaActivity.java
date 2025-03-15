/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacejavaactivity;

import Clases.Alimentacion.Animal;
import Clases.Alimentacion.Persona;
import Clases.FigurasGeometricas.Rectangulo;
import Clases.Pagos.PagoConTargeta;
import Clases.Pagos.PagoConEfectivo;
import Ordenable.ListaNumeros;
import Clases.Trabajador.Diseñador;
import Clases.Trabajador.Desarrollador;
import Clases.Vehiculos.Coche;
import Clases.FigurasGeometricas.Circulo;
import Clases.Vehiculos.Bicicleta;
import Clases.Animales.Perro;
import Clases.Animales.Gato;

/**
 *
 * @author membr
 */
public class InterfaceJavaActivity {

    public static void main(String[] args) {
        
        System.out.println("--------------------------------------\n");
        System.out.println("---> Animales: Sonido y Movimiento");
        Perro perroObj = new Perro();
        Gato gatoObj = new Gato();
        
        System.out.println("## Perro");
        System.out.println("Sonido: " + perroObj.hacerSonido(""));
        System.out.println("Movimiento: " + perroObj.mover(""));
        System.out.println("");
        System.out.println("## Gato");
        System.out.println("Sonido: " + gatoObj.hacerSonido(""));
        System.out.println("Movimiento: " + gatoObj.mover(""));
        
        /*=================== Vehiculos: Arrancar y Detener ======================*/
        
        System.out.println("--------------------------------------\n");
        System.out.println("---> Vehiculos: Arrancar y Detener");
        Coche cocheObj = new Coche();
        Bicicleta bicicletaObj = new Bicicleta();
        
        System.out.println("## Coche");
        System.out.println("Arrancar: " + cocheObj.arrancar(""));
        System.out.println("Detener: " + cocheObj.detener(""));
        System.out.println("");
        System.out.println("## Bicicleta");
        System.out.println("Arrancar: " + bicicletaObj.arrancar(""));
        System.out.println("Detener: " + bicicletaObj.detener(""));
        System.out.println("--------------------------------------\n");
        
        /*=================== Pagos ======================*/
        
        System.out.println("---> Pagos: Targeta Efectivo");
        PagoConTargeta pagoConTargetaObj = new PagoConTargeta();
        PagoConEfectivo pagoConEfectivoObj = new PagoConEfectivo();
        
        System.out.println("## Pago Con Targeta");
        System.out.println("Con Targeta: " + pagoConTargetaObj.procesarPago(7.0));
        System.out.println("");
        System.out.println("## Pago Con Efectivo");
        System.out.println("Con Efectivo: " + pagoConEfectivoObj.procesarPago(9.0));
        System.out.println("--------------------------------------\n");
        
        /*=================== Figuras: Areas y perimetros ======================*/
        
        System.out.println("---> Figuras: Area y Perimetro");
        Circulo circuloObj = new Circulo(5);
        Rectangulo rectanguloObj = new Rectangulo(5, 3);
        
        System.out.println("## Circulo");
        System.out.println("Radio: " + circuloObj.radio);
        System.out.println("Area: " + circuloObj.area());
        System.out.println("Perimetro: " + circuloObj.perimetro());
        System.out.println("");
        
        System.out.println("## Rectangulo");
        System.out.println("Base: " + rectanguloObj.largo + "\nAncho: " + rectanguloObj.ancho);
        System.out.println("\nArea: " + rectanguloObj.area());
        System.out.println("Perimetro: " + rectanguloObj.perimetro());
        System.out.println("--------------------------------------\n");

        /*=================== Trabajador ======================*/
        
        System.out.println("---> Trabajador: trabajar");
        Desarrollador desarrolladorObj = new Desarrollador();
        Diseñador diseñadorObj = new Diseñador();
        
        System.out.println("## Desarrollador");
        System.out.println("Trabajar: " + desarrolladorObj.trabajar(""));
        System.out.println("");
        System.out.println("## Disenador");
        System.out.println("Trabajar: " + diseñadorObj.trabajar(""));
        System.out.println("--------------------------------------\n");
        
        /*=================== LISTA ORDENABLE ======================*/
        
        System.out.println("---> Lista Ordenable");
        ListaNumeros listaNumerosObj = new ListaNumeros();
        
        System.out.println("## Lista Desordenada");
        System.out.println("--> " + listaNumerosObj.listaD);
        System.out.println("## Lista Ordenada");
        System.out.println("--> " + listaNumerosObj.ordenar());
        System.out.println("--------------------------------------\n");
        
        /*=================== ALIMENTACION ======================*/
        
        System.out.println("---> Trabajador: trabajar");
        Persona personaObj = new Persona();
        Animal animalObj = new Animal();
        
        System.out.println("## Persona");
        System.out.println("Persona: " + personaObj.Comer(""));
        System.out.println("");
        System.out.println("## Animal");
        System.out.println("Animal: " + animalObj.Comer(""));
        System.out.println("--------------------------------------\n");

    }
}
