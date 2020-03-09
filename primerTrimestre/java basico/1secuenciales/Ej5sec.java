/**Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
 * 
 *@author Antonio Quesada 
 */

 

import java.util.Scanner;

public class Ej5sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double celsius;
    double fahrenheit;
    
    //Leemos el valor en grados celsius.
    System.out.println("Introduce el valor en grados celsius:");
    celsius = s.nextDouble();
    
    //Imprimimos su valor utilizando la formula (celsius*9/5)+32).
    System.out.println("El valor en grados fahrenheit es "+((celsius*9/5)+32));
    
  }

}
