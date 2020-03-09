/**Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina
 * cuando se introduce un espacio.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej3rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String caracter;
    
    //Pedimos caracteres.
    System.out.println("Introduce un caracter: ");
    caracter = s.nextLine();
    
    //Mientras el caracter sea igualo distinto a a,e,i,o,u es una vocal.
    while (caracter!=" ") {
      if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u") || caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O") || caracter.equals("U")) {
        System.out.println("Es una vocal");
        break; //Si es una vocal rompe el ciclo y termina.
        
      } else {
          System.out.println("No es una vocal");
          break; //Si no es una vocal rompe el ciclo y termina.
         
        }
      }
    }

  }


