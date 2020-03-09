/**Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por 4,
 * pero no si es divisible por 100, excepto que también sea divisible por 400.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej12alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos año.
    int año;
    
    //Petición de datos.
    System.out.println("Introduce un año para saber si es bisiesto o no: ");
    año = s.nextInt();
    
    //Proceso y salida.
    //Si es divisible por 4 pero no por 100 es bisiesto pero si tambien por 400 lo es.
    if (año%4 == 0 && año%100!=0 || año%400==0) {
      System.out.println("Es un año bisiesto.");
      
      //Si no se trata de un año bisiesto.
    } else {
        System.out.println("No es un año bisiesto.");
    }
    
  }

}
