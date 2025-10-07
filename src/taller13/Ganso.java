/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

/**
 *
 * @author marya
 */
public abstract class Ganso {
    
        double peso ;
        int edad;

    public Ganso(double peso, int edad) {
        this.peso = peso;
        this.edad = edad;
    }
         //ERROR: Modificador default no esta permitido aqui.
        public default void mostrarPeso(){
            System.out.println("El peso del ganso es: " + peso );
        }
        //ERROR: Modificador default no esta permitido aqui.
        public default void mostrarEdad(){
            System.out.println("La edad del ganso es: " + edad);
        }
}
