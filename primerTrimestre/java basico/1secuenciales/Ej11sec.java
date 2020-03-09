/**Pide al usuario dos n�meros y muestra la "distancia" entre ellos (el valor absoluto de su diferencia,
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
    
    //Petici�n de datos.
    System.out.println("Inserte un n�mero:");
    num1= s.nextDouble();
    System.out.println("Inserte otro n�mero:");
    num2 = s.nextDouble();
    
    //Mostramos la distancia de dos n�meros.
  //Importamos el m�dulo Math.abs (valor absoluto) para que el n�mero sea siempre positivo.
    System.out.println("La distancia entre ambos n�meros es "+(Math.abs(num1-num2))); 
    
  }

}
