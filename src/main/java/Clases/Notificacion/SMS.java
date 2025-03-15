/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Notificacion;

import Services.InterfaceNotificable;

/**
 *
 * @author membr
 */
public class SMS implements InterfaceNotificable<String>{

    @Override
    public String enviarNotificacion(String Object) {
        return "Mensaje de texto enviado\nDestinatario: 555-0123\nMensaje: El poder del infinito en la palma de mi mano?";
    }
    
}
