/**Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia,
 * de modo que el resultado sea siempre positivo).
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;
import java.math.*;

public class Ej11sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double num1;
    double num2;
    
    //Petición de datos.
    System.out.println("Inserte un número:");
    num1= s.nextDouble();
    System.out.println("Inserte otro número:");
    num2 = s.nextDouble();
    
    //Mostramos la distancia de dos números.
  //Importamos el módulo Math.abs (valor absoluto) para que el número sea siempre positivo.
    System.out.println("La distancia entre ambos números es "+(Math.abs(num1-num2))); 
    
  }

}
