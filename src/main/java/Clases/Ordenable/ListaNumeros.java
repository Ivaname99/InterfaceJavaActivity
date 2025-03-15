/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Ordenable;

import Services.InterfaceOrdenable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author membr
 */
public class ListaNumeros implements InterfaceOrdenable<List<Integer>> {

    public List<Integer> listaD;
    
    public ListaNumeros() {
        this.listaD = Arrays.asList(1,2,71,5,3,8,13,7,35,34);
    }
    
    @Override
    public List<Integer> ordenar() {
        Collections.sort(listaD);
        return listaD;
    }    
}
