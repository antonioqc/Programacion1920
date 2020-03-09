/**Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
 * El exponente sea positivo, sólo tienes que imprimir la potencia.
 * El exponente sea 0, el resultado es 1.
 * El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;
import java.math.*;

public class Ej7alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int base;
    int exponente;
    
    //Leemos y pedimos la base y el exponente.
    System.out.println("Introduce la base: ");
    base = s.nextInt();
    System.out.println("Introduce el exponente");
    exponente = s.nextInt();
    
    //Si el exponente es mayor a 0 será un número positivo y se muestra su resultado.
    if (exponente > 0) {
      System.out.println("El resultado de la potencia es "+Math.pow(base,exponente));
      
   //Si el exponente es igual a 0 sera uno ya que toda base elevada a 0 siempre será 1. 
    }else if (exponente == 0) {
      System.out.println("El resultado de la potencia es 1");
      
      //Sino el exponente es menor a 0 será un número negativo y se muestra su inversa 1/potencia.
    }else{
      System.out.println("El resultado de la potencia es "+1/(Math.pow(base,Math.abs(exponente))));
  }
     
            
  }

}
