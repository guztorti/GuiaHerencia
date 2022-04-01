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
public final class Televisor extends Electrodomestico{
     private Double resolucion;
     private boolean tdt;
     Scanner scn = new Scanner(System.in).useDelimiter("\n");

     public Double getResolucion() {
          return resolucion;
     }

     public void setResolucion(Double resolucion) {
          this.resolucion = resolucion;
     }

     public Televisor() {
     }

     public Televisor(Double resolucion, boolean tdt, Double precio, ColoresElectro color, Efic eficiencia, Double peso) {
          super(precio, color, eficiencia, peso);
          this.resolucion = resolucion;
          this.tdt = tdt;
     }
     

     public boolean isTdt() {
          return tdt;
     }

     public void setTdt(boolean tdt) {
          this.tdt = tdt;
     }
     
     public Televisor crearTelevisor(){
          Televisor t1 = new Televisor();
          t1.crearElectrodomestico();
          System.out.println("Ingrese la resolución en pulgadas");
          t1.resolucion = scn.nextDouble();
          System.out.println("posee sintonizador TDT?");
          if (scn.next().equalsIgnoreCase("SI")) {
               t1.tdt=true;
          }else{
               t1.tdt = false;
          }
          return t1;
     }
     
     @Override
     public double precioFinal(){
          double salida = super.precioFinal();
          if (this.resolucion>40) {
               salida *= 1.3;
          }
          if (tdt) {
               salida += 500;
          }
          return salida;
     }

     @Override
     public String toString() {
          String CadenaTdT = tdt?"con Sintonizador TDT":"sin sintonizador TDT";
          return "Televisor{" + "resolucion=" + resolucion + "'', "+CadenaTdT+ "color: " + color.name()+ " eficiencia: "+ eficiencia.name()+" precio: "+ precio+ '}';
     }
     
}
