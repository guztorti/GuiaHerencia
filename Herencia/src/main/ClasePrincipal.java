
package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {

     public static void main (String[] args){
          ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
          mensajeroSuma.entrarDatos();
          mensajeroSuma.Sumar();
          System.out.print("EL RESULTADO DE LA SUMA ES: ");
          mensajeroSuma.MostrarResultado();
          
          ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
          mensajeroResta.entrarDatos();
          mensajeroResta.Restar();
          System.out.print("EL RESULTADO DE LA RESTA ES: ");
          mensajeroSuma.MostrarResultado();
     }
}
