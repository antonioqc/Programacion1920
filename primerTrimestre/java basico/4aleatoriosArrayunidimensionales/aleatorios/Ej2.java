/**Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números
 * hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.
 * 
 * @author Antonio Quesada
 */

package aleatorios;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;  
    int numeroAleatorio = 0;
    
    //Mientras el numero aleatorio sea 24 u otro.
    while(numeroAleatorio!=24) {
      
      //Genera numero aleatorio hasta 100.
      numeroAleatorio =  (int) (Math.random()*100);
      if (numeroAleatorio%2 == 0) { //Cuando el numero aleatorio que genere sea par.
        System.out.println(numeroAleatorio); 
        contador++; //Cuenta el numero de veces que se repite hasta que llegue al 24.
      } 
    }
      
    //Muestra el resultado.
    System.out.println("Se han generado "+contador+" números hasta llegar al número 24.");
   
  }

}
