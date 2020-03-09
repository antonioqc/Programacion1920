/**Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej4rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num1;
    int num2;
    
    //Petición de datos.
    System.out.println("Introduce un numero: ");
    num1 = s.nextInt();
    System.out.println("Introduce otro numero: ");
    num2 = s.nextInt();
    
  
    //Ciclo for. Imprime todos los números pares.
    //Si un numero (i) está entre el numero1 y numero2 se va incrementando.
    
    for (int i=num1; i<num2+1; i++) {
      
      //Si el número es par (%) es divisible entre 2, imprimirá todos los números que se encuentre entre ambos números.
      if (i%2 == 0) {
        System.out.println(i);
      }
      else { //Si no existe ningún numero entre ambos lo muestra.
        System.out.println("No existen números pares entre ambos números.");
      }
    }
    
  }

}
