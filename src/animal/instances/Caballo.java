/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package animal.instances;

/**
 *
 * @author gustavotorti
 */
public class Caballo extends Animal{

     public Caballo(String nombre, String alimento, Integer edad, String raza) {
          super(nombre, alimento, edad, raza);
     }

     

     @Override
     public String alimentarse() {
          return "es hervívoro y come "+super.alimento;
     }
}
