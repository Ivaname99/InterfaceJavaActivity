/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Comparacion;

import Services.InterfaceComparableObjeto;

/**
 *
 * @author membr
 */
public class Producto implements InterfaceComparableObjeto<Producto> {
    
    public double precio;

    public Producto(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int comparar(Producto o) {
        return Double.compare(this.precio, o.precio);
    }
    
}
