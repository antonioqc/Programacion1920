/**Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo
 * que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej15sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int a;
    int b;
    int aux;
    
    //Pedimos un valor de a y b.
    System.out.println("Introduce el valor de a: ");
    a = s.nextInt();
    System.out.println("Introduce el valor de b: ");
    b = s.nextInt();
    
    //Intercambiamos el valor de cada variable usando una variable auxiliar.
    aux = a;
    a = b;
    b = aux;

    //Mostramos el nuevo valor de a y b.
    System.out.println("El nuevo valor de a es "+a);
    System.out.println("El nuevo valor de b es "+b);
  }

}
