/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Trabajador;

import Services.InterfaceTrabajador;

/**
 *
 * @author membr
 */
public class Desarrollador implements InterfaceTrabajador<String> {

    @Override
    public String trabajar(String object) {
        return "El desarrollador esta escribiendo codigo.";
    }
    
}
