/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package animal.instances;

/**
 *
 * @author gustavotorti
 */
public class Gato extends Animal{

     public Gato(String nombre, String alimento, Integer edad, String raza) {
          super(nombre, alimento, edad, raza);
     }

     

     @Override
     public String alimentarse() {
          return "este GATO come: "+super.alimento;
     }
}
