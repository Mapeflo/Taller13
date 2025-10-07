/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

/**
 *
 * @author marya
 */
public class Triangulo extends Figura {
    
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
      double area = (base*altura)/2;
      System.out.println("El area del triangulo es: " + area);
      return area;
  }
}
