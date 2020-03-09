/**Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
 * 
 * @author antonio
 */

import java.util.Scanner;

public class Ej6alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos cadena.
    String cadena;

    // Petición de datos
    System.out.print("Introduce una cadena: ");
    cadena = s.nextLine();
    
    //La cadena debe tener una longitud de una letra (función length) y de comparar que este entre A y Z mayúscula.
    if (cadena.length()==1 && (cadena.compareTo("A")>=0 && cadena.compareTo("Z")<=0)) {
      System.out.println("La cadena es una letra mayúscula");
      
      //En el caso de que no sea mayúscula mostrará que es minúscula. 
    } else {
      System.out.println("La cadena es una letra minúscula");
    }
    
    
  }

}
