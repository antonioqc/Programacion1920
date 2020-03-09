/**Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

import java.util.Scanner;

public class Ej5arrayuni {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Definimos las variables.
    int[]numero = new int[10];
    int menor = Integer.MAX_VALUE;
    int mayor = Integer.MIN_VALUE;
    int i;
    
    //Bucle for para que pregunte 10 veces, que se introduzca un numero.
    for (i=0; i<10; i++) { //de 0 a 9 que es como lo representa el array.
      System.out.println("Introduce el numero "+(1+i)+": ");
      numero[i] = sc.nextInt();
      
      //Proceso. 
      //Máximo.
      if (numero[i] > mayor) {
          mayor = numero[i];
      }
      
      //Mínimo.
      if (numero[i] < menor) {
          menor = numero[i];
      }
      
    }
   
    //Mostramos el máximo y mínimo.
    System.out.println(menor+ " es el número minimo.");
    System.out.println(mayor+ " es el número maximo.");
    
}

}
