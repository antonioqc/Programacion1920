/**Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella
 * que se lee igual adelante que atrás.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej15rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //Inicializamos las variables a 0.
    int aux = 0;
    int igual = 0;
    String cadena;
    
    //Petición de datos.
    System.out.println("Introduce una cadena: ");
    cadena = s.nextLine();
    
    //Ciclo for obteniendo con la funcion length() la longitud de la palabra.
    for(int i=0; i < cadena.length(); i++) {
      
      //Evalúa si el texto en i de la variable cadena es igual al auxiliar. 
      if (cadena.charAt(i)==cadena.charAt(aux)) {
        igual+=1;
        aux+=1;     
      }
    }
    
    //Si ambos son iguales se incrementa la variable igual en 1.
    if (cadena.length()==igual) {
      System.out.println("La cadena es palíndroma");
    } else {
      System.out.println("La cadena no es palíndroma");
    }
  }

}
