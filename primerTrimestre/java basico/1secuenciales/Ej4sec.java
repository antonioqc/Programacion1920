/**Dados dos n�meros, mostrar la suma, resta, divisi�n y multiplicaci�n de ambos.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej4sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double num1;
    double num2;
    
    //Pedimos que introduzca un n�mero y lo lea.
    System.out.println("Introduce el primer n�mero: ");
    num1 = s.nextDouble();
    System.out.println("Introduce el segundo n�mero: ");
    num2 = s.nextDouble();
    
    //Imprimimos y calculamos las operaciones sin utilizar variables para mostrarlo.
    System.out.println("La suma es "+(num1+num2));
    System.out.println("La resta es "+(num1-num2));
    System.out.println("La multiplicaci�n es "+(num1*num2));
    System.out.println("La divisi�n es "+(num1/num2));
    
        
    

  }

}
