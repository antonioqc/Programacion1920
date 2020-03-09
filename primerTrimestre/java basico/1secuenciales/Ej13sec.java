/** Realizar un algoritmos que lea un numero y que muestre su raiz cuadrada y su raiz cubica. 
 *  PSeInt no tiene ninguna funcion predefinida que permita calcular la raiz cubica, ¿como se puede calcular?.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;
import java.math.*;

public class Ej13sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos la variable.
    int num;
    
    //Leemos el numero.
    System.out.println("Introduce un numero: ");
    num = s.nextInt();
    
    //Raiz cuadrada usando la funcion Math.sqrt.
    System.out.println("La raiz cuadrada de "+num+" es "+Math.sqrt(num));
    
    //Raiz cubica elevando a 1/3 el numero.
    System.out.println("La raiz cubica de "+num+" es "+Math.pow(num,(double)1/3));
    
    

  }

}