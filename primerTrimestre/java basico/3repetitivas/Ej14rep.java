/**Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
 * introducen por teclado.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej14rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Leemos una cadena y subcadena.
    System.out.println("Introduce una cadena: ");
    String cadena = s.nextLine();
    System.out.println("Introduce una cadena: ");
    String subcadena = s.nextLine();
    
    //Mientras que la cadena contenga (contains())a la subcadena lo muestra. 
  while(cadena.contains(subcadena)) {
    System.out.println("La cadena contiene la subcadena.");
    break;
  }
       //Si la cadena no contiene a la subcadena.
    if(!cadena.contains(subcadena)) {
      System.out.println("La cadena no contiene a la subcadena");
     
    }
    } 
 
  }


