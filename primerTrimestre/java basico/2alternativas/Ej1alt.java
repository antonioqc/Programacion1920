/**Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej1alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int num1;
    int num2;
    
    //Petición de datos (numero 1 y 2).
    System.out.println("Introduce un numero: ");
    num1 = s.nextInt();    
    System.out.println("Introduce otro numero: ");
    num2 = s.nextInt();
    
    //Proceso.
    if (num1>num2) {   //Si numero 1 es mayor que el 2, muestra el mensaje.
      System.out.println(num1+" es mayor que "+num2);
    } else {   //Si no es mayor lo muestra.
        System.out.println(num1+" no es mayor que "+num2);
      }
  }

}
