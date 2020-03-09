/**Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), 
 * realiza un programa que cuente cuantas palabras tiene.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej11rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadena;
    
    //Pedimos una cadena y un caracter.
    System.out.println("Introduce una cadena: ");
    cadena = s.nextLine();
    
    //Inicializamos contador a 0.
    int contador = 0;
    for (int i = 0; i < cadena.length(); i++){
      if (cadena.charAt(i)== ' '){
        contador++; //Contamos el número de espacios entre palabra y palabra.  
    }

  }
    int palabras;
    palabras = contador+1; //Contamos las palabras.
    System.out.println("La cadena tiene "+palabras+" palabras."); //Imprimimos el numero de palabras.
  }
}
