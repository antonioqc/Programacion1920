/**Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

import java.util.Scanner;

public class Ej3arrayuni {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]numero = new int[10];

    //Bucle for para que pregunte 10 veces, que se introduzca un numero.
    for(int i=0; i<10; i++) {
      System.out.println("Introduce un número:");
      numero[i] = sc.nextInt();
    }
    
    //Bucle for para que decremente la posicion del array, y lo muestre en orden inverso.
    for (int i = numero.length-1  ; i > -1; i--) {
      System.out.println("el valor nuevo de la posición "+(0+i)+" es "+numero[i]);
    }
    
    
  }

}
