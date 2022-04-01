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

     @Override
     public double area() {
          return base * altura;
     }

     @Override
     public double perimetro() {
          return 2*base + 2*altura;
     }
     
}
