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
public class Circulo implements CalculosFormas{
     private double radio;

     public Circulo() {
     }

     public Circulo(double radio) {
          this.radio = radio;
     }

     public double getRadio() {
          return radio;
     }

     public void setRadio(double radio) {
          this.radio = radio;
     }
     
     
     
     @Override
     public double area() {
          return PI*Math.sqrt(radio);
     }

     @Override
     public double perimetro() {
          return PI*2*radio;
     }

     
}
