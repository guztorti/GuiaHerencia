/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_herencia;

import animal.instances.Animal;
import animal.instances.Caballo;
import animal.instances.Gato;
import animal.instances.Perro;
import electrodomesticos.instances.Electrodomestico;
import electrodomesticos.instances.Lavadora;
import electrodomesticos.instances.Televisor;
import enums.ColoresElectro;
import enums.Efic;
import java.util.ArrayList;

/**
 *
 * @author gustavotorti
 */
public class Guia_herencia {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
//          //-->Declaración del objeto Animal como instancia de Perro
//          Animal perro = new Perro("Stich", "Carnívoro", 15, "Doverman");
//          System.out.println(perro.alimentarse());
//          //-->Declaración del objeto Perro como instancia de Perro
//          Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
//          System.out.println(perro1.alimentarse());
//          //-->Declaración del objeto Animal como instancia de Gato
//          Animal gato = new Gato("Pelusa", "Galletas",15,"Siames");
//          System.out.println(gato.alimentarse());
//          //-->Declaración del objeto Animal como instancia de Caballo
//          Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
//          System.out.println(caballo.alimentarse());

//          Lavadora l1 = new Lavadora();
//          l1 = l1.crearLavadora();
//          System.out.println(l1.precioFinal());
//          //--> objeto televisor
//          Televisor t1 = new Televisor();
//          t1 = t1.crearTelevisor();
//          System.out.println(t1.precioFinal());
          ArrayList<Electrodomestico> lista = new ArrayList();
          Lavadora l2 = new Lavadora(30d, 0d, ColoresElectro.NEGRO, Efic.C, 50d);
          l2.setPrecio(l2.precioFinal());
          lista.add(l2); 
          Lavadora l3 = new Lavadora(45d, 0d, ColoresElectro.ROJO, Efic.A, 60d);
          l3.setPrecio(l3.precioFinal());
          lista.add(l3);
          Televisor t2= new Televisor(45d, false, 0d, ColoresElectro.NEGRO, Efic.C,18d);
          t2.setPrecio(t2.precioFinal());
          lista.add(t2);
          Televisor t3= new Televisor(32d, true, 0d, ColoresElectro.NEGRO, Efic.C,18d);
          t3.setPrecio(t3.precioFinal());
          lista.add(t3);
          double PrecioTotal = 0;
          for (Electrodomestico elem : lista) {
               System.out.println(elem.toString());
               PrecioTotal += elem.getPrecio();
          }
          System.out.println("La suma del precio de TODOS los electrodomésticos es:"+PrecioTotal);
     }

}
