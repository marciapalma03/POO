/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author marci
 */
public class Maritimos extends Vehiculos
{
    private String Helices;

    public Maritimos(String Helices, String Marca, String Color, String Motor) {
        super(Marca, Color, Motor);
        this.Helices = Helices;
    }

    public String getHelices() {
        return Helices;
    }

    public void setHelices(String Helices) {
        this.Helices = Helices;
    }
}
