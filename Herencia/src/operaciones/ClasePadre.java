
package operaciones;
import java.util.Scanner;
public class ClasePadre {

     protected int resultado, valor1, valor2;
     protected Scanner entrada = new Scanner(System.in);
     
     public void entrarDatos(){
          System.out.print("Ingrese el primer valor: ");
          valor1 = entrada.nextInt();
          
          System.out.print("Ingrese el segundo valor: ");
          valor2 = entrada.nextInt();
     }
     
     public void MostrarResultado(){
          System.out.println(resultado);
     };
    
}
