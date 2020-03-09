/**Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer
 * carácter en la cadena por el segundo carácter.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej12rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Leemos una cadena.
    System.out.println("Introduce una cadena: ");
    String cadena = s.nextLine();
    
    //Leemos el caracter de la cadena que queremos sustituir.
    System.out.println("Introduce el caracter a sustituir: ");
    String caracter1 = s.nextLine();
    
    //Leemos el caracter nuevo que vamos a sustituir en la cadena.
    System.out.println("Introduce el caracter nuevo a sustituir en la cadena: ");
    String caracter2 = s.nextLine();
    
    //Bucle do-while.
    do { //Reemplazamos el caracter 1 or el 2 mientras que la longitud de la cadena sea 1.
      String cadenaModificada = cadena.replace(caracter1, caracter2);   
      System.out.println("Se ha cambiado en la cadena "+caracter1+" por "+caracter2);
      System.out.println("La cadena final es "+cadenaModificada);
    } while(caracter1.length()!=1 && caracter2.length()!=1);
      
    } 
      
    }
    
  
