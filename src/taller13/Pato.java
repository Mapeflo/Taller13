/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

/**
 *
 * @author marya
 */
public class Pato implements Volador, Nadador {
    
    String especie;

    public Pato(String especie) {
        this.especie = especie;
    }
    @Override
    public void volar(){
        System.out.println("El pato de la especie: " +especie+ "esta volando");   
    }
    @Override
    public void nadar(){
        System.out.println("El pato de la especie: " + especie+ "esta nadando");
    }
}
