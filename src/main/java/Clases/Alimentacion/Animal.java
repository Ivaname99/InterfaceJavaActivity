/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Alimentacion;

import Services.InterfaceAlimentacion;

/**
 *
 * @author membr
 */
public class Animal implements InterfaceAlimentacion<String>{

    @Override
    public String Comer(String Object) {
        return "Un lindo Gatito de 100 Kilos ve a un hombre fino y le va a dar un besito...";
    }
    
}
