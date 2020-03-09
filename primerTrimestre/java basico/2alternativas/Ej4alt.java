/**Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, 
 * o un mensaje de aviso en caso contrario.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej4alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double num1;
    double num2;
    
  //Petición de datos (número 1 y 2).
    System.out.println("Introduce un numero: ");
    num1 = s.nextDouble();    
    System.out.println("Introduce otro numero: ");
    num2 = s.nextDouble();
    
    
    //Proceso.
    if (num2==0) {   //Si número 1 es igual a 0, muestra que no se puede dividir..
      System.out.println("No se puede dividir entre 0. Es un valor indeterminado.");
    } else {   //Si no es así divide ambos números.
        System.out.println("La division es "+(double)(num1/num2));  
    
    }

  }

}
