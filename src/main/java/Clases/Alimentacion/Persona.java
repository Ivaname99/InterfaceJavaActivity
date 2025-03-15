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
public class Persona implements InterfaceAlimentacion<String> {

    @Override
    public String Comer(String Object) {
        return "Se coloca una servilleta en el cuello y disfuta de una fina comida";
    }
    
}
