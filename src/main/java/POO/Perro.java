/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author marci
 */
public class Perro extends Animal
{
    public Perro(String Pelo, String Boca, String Cola, String Ojo, Integer Patas)
    {
        super(Pelo, Boca, Cola, Ojo, Patas);
    }
    
    @Override
    public void Sonido()
    {
        System.out.println("El perro ladra");
    }
}
