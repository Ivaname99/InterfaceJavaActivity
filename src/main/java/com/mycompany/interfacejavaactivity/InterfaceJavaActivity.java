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
        
        System.out.println("--------------------------------------\n");
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
        
        System.out.println("--------------------------------------\n");
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
        
        System.out.println("--------------------------------------\n");
        System.out.println("---> Pagos: Targeta Efectivo");
        PagoConTargeta pagoConTargetaObj = new PagoConTargeta();
        PagoConEfectivo pagoConEfectivoObj = new PagoConEfectivo();
        
        System.out.println("## Pago Con Targeta");
        System.out.println(pagoConTargetaObj.procesarPago(7.0));
        System.out.println("");
        System.out.println("## Pago Con Efectivo");
        System.out.println(pagoConEfectivoObj.procesarPago(9.0));
        System.out.println("--------------------------------------\n");
        
        System.out.println("---> Pagos: Targeta Efectivo");
        Circulo circuloObj = new Circulo(2);
        Rectangulo rectanguloObj = new Rectangulo();
        
        System.out.println("## Circulo");
        System.out.println(circuloObj.area(9.0));
        System.out.println(circuloObj.perimetro(4.0));
        System.out.println("");
        System.out.println("## Rectangulo");
        System.out.println(rectanguloObj.area(5.0));
        System.out.println(rectanguloObj.perimetro(9.0));
        System.out.println("--------------------------------------\n");

    }
}
