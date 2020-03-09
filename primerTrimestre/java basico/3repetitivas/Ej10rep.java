/**Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej10rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadena;
    String caracter;
    
    //Pedimos una cadena y un caracter.
    System.out.println("Introduce una cadena: ");
    cadena = s.nextLine();
    System.out.println("Introduce un caracter: ");
    caracter = s.nextLine();
   
    //Inicializamos el contador a 0.
    int contador = 0;
    
    //Bucle for. Devuelve la longitud de la cadena.
    //Compara la posicion del caracter en la cadena 
    for (int i = 0; i < cadena.length(); i++){
      if (cadena.charAt(i)==caracter.charAt(0)){
          contador++; //Contador para el número de veces que se repite el caracter.
          System.out.println("El carácter se repite " + contador + " veces");
      }
      
      //Si no se encuentra el caracter en la cadena lo muestra.
      else {
    } System.out.println("El caracter introducido no se encuentra en la cadena");
      break;
    }
      
  }

}
