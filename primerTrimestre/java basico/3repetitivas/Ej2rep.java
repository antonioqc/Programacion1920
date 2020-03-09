/**Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
 * El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej2rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int cantidad;
    
    System.out.println("Introduce un numero de repeticiones que vas a introducir: ");
    cantidad = s.nextInt();
    

//Bucle for con las repeticiones que ha indicado el usuario.
    for (int i=1; i<cantidad+1; i++) {
      System.out.println("Introduce un numero: ");
      int numero = s.nextInt();
      
      //Comprobamos que sea mayor, igual o menor y lo imprime por pantalla.
     if (numero == 0) {
       System.out.println("El numero es igual a 0");
     } else if (numero > 0) {
       System.out.println("El numero "+numero+" es mayor que 0");
     }
      
     else {
       System.out.println("El numero "+numero+" es menor que 0");
     }
     
    }
  }

}
