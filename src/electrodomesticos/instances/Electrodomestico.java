/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package electrodomesticos.instances;

import enums.Efic;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Efic eficiencia;
    protected Double peso;

     public Electrodomestico() {
     }

     public Electrodomestico(Double precio, String color, Efic eficiencia, Double peso) {
          this.precio = precio;
          this.color = color;
          this.eficiencia = eficiencia;
          this.peso = peso;
     }

     public Double getPrecio() {
          return precio;
     }

     public void setPrecio(Double precio) {
          this.precio = precio;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public Efic getEficiencia() {
          return eficiencia;
     }

     public void setEficiencia(Efic eficiencia) {
          this.eficiencia = eficiencia;
     }

     public Double getPeso() {
          return peso;
     }

     public void setPeso(Double peso) {
          this.peso = peso;
     }
    
    public abstract void comprobarConsumoEnergetico(String letra);
    public abstract void comprobarColor( String color);
    
    public Electrodomestico crearElectrodomestico(){
         Electrodomestico el = new Electrodomestico();
         Scanner scn = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("ingrese el color del artículo");
         el.comprobarColor(scn.next());
         System.out.println("ingrese la eficiencia energética");
         el.comprobarConsumoEnergetico(scn.next().toUpperCase());
         el.precio = 1000d;
    return el;
    }
    
    public void precioFinal(){
         a
    }
    
}
