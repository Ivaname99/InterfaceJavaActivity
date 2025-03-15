/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejavaactivity;

import Services.InterfaceTrabajador;

/**
 *
 * @author membr
 */
public class Diseñador implements InterfaceTrabajador<String> {

    @Override
    public String trabajar(String object) {
        return "El disenador esta creando disenos graficos.";
    }
    
}
