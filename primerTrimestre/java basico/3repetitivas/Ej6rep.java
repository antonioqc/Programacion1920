/**Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
 * saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej6rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int base;
    int exponente;
    int potencia;
    
    //Pedimos la base y el exponente.
    System.out.println("Introduce la base de la potencia: ");
    base = s.nextInt();
    System.out.println("Introduce el exponente de la potencia: ");
    exponente = s.nextInt();
    
   //Inicializamos potencia a 1.
    potencia = 1;
    
    //Si el exponente es negativo mostramos que debe ser positivo.
    if (exponente<0) {
      System.out.println("El exponente tiene que ser positivo.");
    }
    
    //Si el exponente es positivo sigue ejecutándose.
    else {
      
    //Ciclo for para calcular la potencia
    for (int i=1; i<exponente+1; i++) {
     potencia = potencia*base;
      
    }
     
    System.out.println("El resultado de la potencia es "+potencia);
  }

  }
}
 

