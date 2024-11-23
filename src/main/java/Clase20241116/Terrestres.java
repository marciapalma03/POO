/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author marci
 */
public class Terrestres extends Vehiculos
{
    private String Llantas;

    public Terrestres(String Llantas, String Marca, String Color, String Motor) {
        super(Marca, Color, Motor);
        this.Llantas = Llantas;
    }

    public String getLlantas() {
        return Llantas;
    }

    public void setLlantas(String Llantas) {
        this.Llantas = Llantas;
    }
}
