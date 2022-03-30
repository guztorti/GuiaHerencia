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
public final class Lavadora extends Electrodomestico{
     private Double carga;
     
     public Lavadora(){};
     
     Scanner scn = new Scanner(System.in).useDelimiter("\n");

     public Lavadora(Double carga, Double precio, ColoresElectro color, Efic eficiencia, Double peso) {
          super(precio, color, eficiencia, peso);
          this.carga = carga;
     }

     public Double getCarga() {
          return carga;
     }

     public void setCarga(Double carga) {
          this.carga = carga;
     }
     public Lavadora crearLavadora(){
          Lavadora e1 = new Lavadora();
          e1.crearElectrodomestico();
          System.out.println("ingrese la carga de la lavadora");
          e1.setCarga(scn.nextDouble());
          return e1;
     }
     
     @Override
     public double precioFinal(){
          
     }
     
}
