/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package electrodomesticos.instances;

import enums.ColoresElectro;
import enums.Efic;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class Electrodomestico {

     protected Double precio;
     protected ColoresElectro color;
     protected Efic eficiencia;
     protected Double peso;

     public Electrodomestico() {
     }

     public Electrodomestico(Double precio, ColoresElectro color, Efic eficiencia, Double peso) {
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

     public ColoresElectro getColor() {
          return color;
     }

     public void setColor(ColoresElectro color) {
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

     public Efic comprobarConsumoEnergetico(String letra) {
          for (Efic value : Efic.values()) {
               if (value.name().equalsIgnoreCase(letra)) {
                    return value;
               }
          }
          return Efic.F;
     }

     public ColoresElectro comprobarColor(String color) {
          for (ColoresElectro value : ColoresElectro.values()) {
               if (value.name().equalsIgnoreCase(color)) {
                    return value;
               }
          }
          return ColoresElectro.BLANCO;
     }

//          Electrodomestico el = new Electrodomestico();
     public void crearElectrodomestico() {
          Scanner scn = new Scanner(System.in).useDelimiter("\n");
          System.out.println("¿cuánto pesa el artículo?");
          this.peso = scn.nextDouble();
          System.out.println("ingrese el color del artículo");
          this.color = comprobarColor(scn.next());
          System.out.println("ingrese la eficiencia energética");
          this.eficiencia = comprobarConsumoEnergetico(scn.next().toUpperCase());
          this.precio = 1000d;
     }

     public double precioFinal() {
          
          double salida = 1000;
          switch (this.eficiencia) {
               case A:
                    salida += 1000d;
                    break;
               case B:
                    salida += 800;
                    break;
               case C:
                    salida += 600;
                    break;
               case D:
                    salida += 500;
                    break;
               case E:
                    salida += 300;
                    break;
               case F:
                    salida += 100;

          }
          if (this.peso >= 80) {
               salida += 1000;
          } else if (this.peso >= 50) {
               salida += 800;
          } else if (this.peso >= 20) {
               salida += 500;
          } else {
               salida += 100;
          }
          
          return salida;
     }

}
