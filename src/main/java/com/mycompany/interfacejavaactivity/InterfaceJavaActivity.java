/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacejavaactivity;

import Clases.Alimentacion.Animal;
import Clases.Alimentacion.Persona;
import Clases.FigurasGeometricas.Rectangulo;
import Clases.Pagos.PagoConTargeta;
import Clases.Pagos.PagoConEfectivo;
import Clases.Ordenable.ListaNumeros;
import Clases.Trabajador.Diseñador;
import Clases.Trabajador.Desarrollador;
import Clases.Vehiculos.Coche;
import Clases.FigurasGeometricas.Circulo;
import Clases.Vehiculos.Bicicleta;
import Clases.Animales.Perro;
import Clases.Animales.Gato;
import Clases.Comparacion.Producto;
import Clases.Notificacion.CorreoElectronico;
import Clases.Notificacion.SMS;
import Clases.Descuento.DescuentoFijo;
import Clases.Descuento.DescuentoPorcentaje;

/**
 *
 * @author membr
 */
public class InterfaceJavaActivity {

    public static void main(String[] args) {
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("---> Animales: Sonido y Movimiento\n");
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
        
        System.out.println("\n--------------------------------------\n");
        System.out.println("---> Vehiculos: Arrancar y Detener\n");
        Coche cocheObj = new Coche();
        Bicicleta bicicletaObj = new Bicicleta();
        
        System.out.println("## Coche");
        System.out.println("Arrancar: " + cocheObj.arrancar(""));
        System.out.println("Detener: " + cocheObj.detener(""));
        System.out.println("");
        System.out.println("## Bicicleta");
        System.out.println("Arrancar: " + bicicletaObj.arrancar(""));
        System.out.println("Detener: " + bicicletaObj.detener(""));
        System.out.println("\n--------------------------------------\n");
        
        /*=================== Pagos ======================*/
        
        System.out.println("---> Pagos: Targeta Efectivo\n");
        PagoConTargeta pagoConTargetaObj = new PagoConTargeta();
        PagoConEfectivo pagoConEfectivoObj = new PagoConEfectivo();
        
        System.out.println("## Pago Con Targeta");
        System.out.println("Con Targeta: " + pagoConTargetaObj.procesarPago(7.0));
        System.out.println("");
        System.out.println("## Pago Con Efectivo");
        System.out.println("Con Efectivo: " + pagoConEfectivoObj.procesarPago(9.0));
        System.out.println("\n--------------------------------------\n");
        
        /*=================== Figuras: Areas y perimetros ======================*/
        
        System.out.println("---> Figuras: Area y Perimetro\n");
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
        System.out.println("\n--------------------------------------\n");

        /*=================== Trabajador ======================*/
        
        System.out.println("---> Trabajador: trabajar\n");
        Desarrollador desarrolladorObj = new Desarrollador();
        Diseñador diseñadorObj = new Diseñador();
        
        System.out.println("## Desarrollador");
        System.out.println("Trabajar: " + desarrolladorObj.trabajar(""));
        System.out.println("");
        System.out.println("## Disenador");
        System.out.println("Trabajar: " + diseñadorObj.trabajar(""));
        System.out.println("\n--------------------------------------\n");
        
        /*=================== LISTA ORDENABLE ======================*/
        
        System.out.println("---> Lista Ordenable\n");
        ListaNumeros listaNumerosObj = new ListaNumeros();
        
        System.out.println("## Lista Desordenada");
        System.out.println("> " + listaNumerosObj.listaD);
        System.out.println("## Lista Ordenada");
        System.out.println("> " + listaNumerosObj.ordenar());
        System.out.println("\n--------------------------------------\n");
        
        /*=================== ALIMENTACION ======================*/
        
        System.out.println("---> Trabajador: trabajar\n");
        Persona personaObj = new Persona();
        Animal animalObj = new Animal();
        
        System.out.println("## Persona");
        System.out.println("Persona: " + personaObj.Comer(""));
        System.out.println("");
        System.out.println("## Animal");
        System.out.println("Animal: " + animalObj.Comer(""));
        System.out.println("\n--------------------------------------\n");
        
        /*=================== NOTIFICACION ======================*/
        
        System.out.println("---> Notificacion: enviarNotificacion\n");
        CorreoElectronico correoEletronicoObj = new CorreoElectronico();
        SMS smsObj = new SMS();

        System.out.println("## Correo Electronico");
        System.out.println("Datos: " + correoEletronicoObj.enviarNotificacion(""));
        System.out.println("");
        System.out.println("## SMS");
        System.out.println("Datos: " + smsObj.enviarNotificacion(""));
        System.out.println("\n--------------------------------------\n");
        
        /*=================== COMPARACION  ======================*/
        
        System.out.println("---> Comparacion de Productos\n");
        Producto producto1 = new Producto(50.0);
        Producto producto2 = new Producto(75.0);

        System.out.println("## Producto 1:");
        System.out.println("Precio: " + producto1.precio);

        System.out.println("\n## Producto 2:");
        System.out.println("Precio: " + producto2.precio);

        int resultado = producto1.comparar(producto2);

        System.out.println("\nResultado de la comparacion:");
        if (resultado < 0) {
            System.out.println("El Producto 1 es mas barato que el Producto 2.");
        } else if (resultado > 0) {
            System.out.println("El Producto 1 es mas caro que el Producto 2.");
        } else {
            System.out.println("Ambos productos tienen el mismo precio.");
        }
        System.out.println("\n--------------------------------------\n");
        
        /*=================== DESCUENTO  ======================*/
        
        System.out.println("---> Descuentos");

        double precioOriginal = 100.0;

        DescuentoPorcentaje descuentoPorcentaje = new DescuentoPorcentaje(20);
        double precioConDescuentoPorcentaje = descuentoPorcentaje.calcularDescuento(precioOriginal);

        DescuentoFijo descuentoFijo = new DescuentoFijo(15);
        double precioConDescuentoFijo = descuentoFijo.calcularDescuento(precioOriginal);

        System.out.println("\nPrecio original: $" + precioOriginal);
        System.out.println("Precio con 20% de descuento: $" + precioConDescuentoPorcentaje);
        System.out.println("Precio con descuento fijo de $15: $" + precioConDescuentoFijo);
        System.out.println("\n--------------------------------------\n");
    }
}
