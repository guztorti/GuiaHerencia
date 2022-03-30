/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package animal.instances;

/**
 *
 * @author gustavotorti
 */
public abstract class Animal {

     protected String nombre;
     protected String alimento;
     protected Integer edad;
     protected String raza;
     
     public abstract String alimentarse();

     public Animal(String nombre, String alimento, Integer edad, String raza) {
          this.nombre = nombre;
          this.alimento = alimento;
          this.edad = edad;
          this.raza = raza;
     }


     
}
