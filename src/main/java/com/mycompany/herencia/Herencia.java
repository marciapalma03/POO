/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

import java.util.ArrayList;
import java.util.List;

/** 
 *
 * @author marci
 */
public class Herencia 
{

    public static void main(String[] args){
        Animal p = new Perro("Negro", "SI", "SI", "SI", 4);
        Animal g = new Gato("Blanco", "SI", "SI", "SI", 4);
        
        List<Animal> lista = new ArrayList<Animal>();
        lista.add(p);
        lista.add(g);
        lista.add(new Queco("NO", "SI", "SI", "SI", 4));
        
        for (Animal item : lista)
        {
           item.Sonido(); 
        }
    }
}
