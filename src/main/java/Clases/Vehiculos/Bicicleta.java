/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Vehiculos;

import Services.InterfaceVehiculo;

/**
 *
 * @author membr
 */
public class Bicicleta implements InterfaceVehiculo<String>{

    @Override
    public String arrancar(String objet) {
        return "La bicicleta comienza a rodar.";
    }

    @Override
    public String detener(String objet) {
        return "La bicicleta se ha detenido.";
    }
    
}
