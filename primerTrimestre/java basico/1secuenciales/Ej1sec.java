/**Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 * 
 * @author Antonio Quesada
 * 
 */

import java.util.Scanner;

public class Ej1sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nombre; //Leemos nombre como cadena.
    System.out.print("Dime tu  nombre: "); //Pedimos el nombre.
    nombre = s.nextLine(); // Leemos el nombre introducido.
    System.out.println("Hola " + nombre); //Mostramos el mensaje por consola.
    }

}
