/**Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y 
 * muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
 * “ERROR: número incorrecto.”.
 * 
 * Algoritmo:
 * Si el número es 1 en la cara opuesta está el seis.
 * Si el número es 2 en la cara opuesta está el cinco.
 * Si el número es 3 en la cara opuesta está el cuatro.
 * Si el número es 4 en la cara opuesta está el tres.
 * Si el número es 5 en la cara opuesta está el dos.
 * Si el número es 6 en la cara opuesta está el uno.
 * Si no se ha insertado un valor incorrecto.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej17alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos numero.
    int num;
    
    //Petición de datos.
    System.out.println("Inserte un numero (1-6): ");
    num = s.nextInt();
    
    //Proceso y salida.
    if (num == 1) {
      System.out.println("La cara opuesta del dado es 6.");
    } else if (num == 2) {
      System.out.println("La cara opuesta del dado es 5.");
    } else if (num == 3) {
      System.out.println("La cara opuesta del dado es 4.");
    } else if (num == 4) {
      System.out.println("La cara opuesta del dado es 3.");
    } else if (num ==5) {
      System.out.println("La cara opuesta del dado es 2.");
    } else if (num == 6) {
      System.out.println("La cara opuesta del dado es 1.");
    }
    
    //Mensaje de error.
    else {
      System.out.println("ERROR. Has introducido un número incorrecto");
    }
        
  }

}
