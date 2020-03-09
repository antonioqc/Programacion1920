/**Calcular la media de tres números pedidos por teclado.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej6sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos los tres números.
    double num1;
    double num2;
    double num3;
    
    //Pedimos que introduzca los tres números.
    System.out.println("Introduce el primer número: ");
    num1 = s.nextDouble();
    System.out.println("Introduce el segundo número: ");
    num2 = s.nextDouble();
    System.out.println("Introduce el tercer número: ");
    num3 = s.nextDouble();
    
    //Imprimimos la media de los tres sumando y diviéndolo entre 3.
    System.out.println("La media de los tres números es " +((num1+num2+num3)/3));
  
    
  }

}
