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
public class CorreoElectronico implements InterfaceNotificable<String>{

    @Override
    public String enviarNotificacion(String Object) {
        return "Se ha enviado una notificacion por correo Electronico\nDestinatario: jaimecalentura@hotmail.com\nMensaje: Estas libre para ir al billar?";
    }
    
}
