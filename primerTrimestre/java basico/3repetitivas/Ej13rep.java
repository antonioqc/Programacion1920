/**Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej13rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cadenaNueva = " ";
    
    //Leemos una cadena.
    System.out.println("Introduce una cadena: ");
    String cadena = s.nextLine();
    
    //Recorre la longitud de la variable.
    for(int i=0;i<cadena.length();i++) {
      
      //Definimos los caracteres de la cadena.
      char caracter = cadena.charAt(i);
      
      //Conversión de minúscula a mayúscula de los caracteres de la cadena.
      if(caracter==Character.toLowerCase(cadena.charAt(i))) {
        cadenaNueva = cadenaNueva + Character.toUpperCase(cadena.charAt(i));
        
        //Si no al contrario conversión de mayúscula a minúscula.
      }else{
        cadenaNueva = cadenaNueva + Character.toLowerCase(cadena.charAt(i));
      }
    }
    
    //Imprimir la cadena nueva convertida.
    System.out.println(cadenaNueva);
    
  }

}
