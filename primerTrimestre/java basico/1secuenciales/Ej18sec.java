/**Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej18sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    String nombre;
    String apellido1;
    String apellido2;
    
    //Petición de datos.
    System.out.println("Inserte su nombre:");
    nombre = s.nextLine();
    System.out.println("Inserte su primer apellido:");
    apellido1 = s.nextLine();
    System.out.println("Inserte su segundo apellido:");
    apellido2 = s.nextLine();
    
    //Mostramos las iniciales usando la funcion charAt, que devuelve el caracter de la posicion 0 pasada por parámetro.
    System.out.println("La inicial de tu nombre es "+nombre.charAt(0)+" ,de tu primer apellido es "+apellido1.charAt(0)+" y la de tu segundo apellido es "+apellido2.charAt(0));
    
  }

}
