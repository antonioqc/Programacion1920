/**Calcular la media de tres n�meros pedidos por teclado.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej6sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos los tres n�meros.
    double num1;
    double num2;
    double num3;
    
    //Pedimos que introduzca los tres n�meros.
    System.out.println("Introduce el primer n�mero: ");
    num1 = s.nextDouble();
    System.out.println("Introduce el segundo n�mero: ");
    num2 = s.nextDouble();
    System.out.println("Introduce el tercer n�mero: ");
    num3 = s.nextDouble();
    
    //Imprimimos la media de los tres sumando y divi�ndolo entre 3.
    System.out.println("La media de los tres n�meros es " +((num1+num2+num3)/3));
  
    
  }

}
