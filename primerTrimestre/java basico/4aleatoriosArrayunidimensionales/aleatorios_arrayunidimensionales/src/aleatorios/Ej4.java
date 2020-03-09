/**Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza se representará con 
 * el carácter @ y se debe colocar  exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo 
 * irá serpenteando de la siguiente manera: se generará de forma aleatoria un valor entre tres posibles que hará que el 
 * siguiente carácter se  coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a la
 * derecha del anterior. La longitud de la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato
 * correcto.
 * 
 * @author Antonio Quesada
 */

package aleatorios;

import java.util.Scanner;

public class Ej4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int longitud;
    
    //Pedimos la longitud de la serpiente incluyendo la cabeza.
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza:");
    longitud = sc.nextInt();
    
    //Colocamos la cabeza dejando 12 espacios.
    System.out.println("            @");
    
    //Ciclo do-while mientras que la longitud sea mayor que 1.
    do {
      int cuerpo = 13; //Inicializamos el cuerpo a la posición 13 para que se encuentre seguido de la cabeza.
      
      //Se generarán de forma aleatoria tres posiciones: izquierda, centrado, y derecha.
      cuerpo += (int)(Math.random() * 3);
      
      //Bucle for que pintará un espacio para el "serpenteo".
      for (int i = 1; i < cuerpo; i++) {
      System.out.print(" ");
      }
      
      //Muestra el cuerpo de la serpiente.
      System.out.println("*");
      longitud--;
      
    } while (longitud > 1);

  }
  
}