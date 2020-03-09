/**Escribe un programa que lea un número e indique si es par o impar.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej3alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos el número.
    int num;
    
    //Pedimos el dato número.
    System.out.println("Introduce un numero: ");
    num = s.nextInt();
    
    //Calculamos si es par si el número es divisble entre 2 y devuelve como resto 0.
    if (num%2 == 0) {
      System.out.println("El número es par");
    } else {  //Si no es par muestra que es impar.
      System.out.println("El número es impar");
    }

  }

}
