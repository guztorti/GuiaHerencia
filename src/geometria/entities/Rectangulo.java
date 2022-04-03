/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package geometria.entities;

import geometria.CalculosFormas;

/**
 *
 * @author gustavotorti
 */
public class Rectangulo implements CalculosFormas{

     private double base;
     private double altura;

     public Rectangulo() {
     }

     public Rectangulo(double base, double altura) {
          this.base = base;
          this.altura = altura;
     }

     public double getBase() {
          return base;
     }

     public void setBase(double base) {
          this.base = base;
     }

     public double getAltura() {
          return altura;
     }

     public void setAltura(double altura) {
          this.altura = altura;
     }

     @Override
     public double area() {
          return base * altura;
     }

     @Override
     public double perimetro() {
          return 2*base + 2*altura;
     }
     
}
