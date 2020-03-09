/**Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
 * Si introducimos otro número nos da un error.
 * 
 * Algoritmo:
 * Leemos variable dia.
 * Si el dia es 1 es lunes.
 * Si el dia es 2 es martes.
 * Si el dia es 3 es miercoles.
 * Si el dia es 4 es jueves.
 * Si el dia es 5 es viernes.
 * Si el dia es 6 es sabado.
 * Si el dia es 7 es domingo.
 * Si no mostramos que es un numero incorrecto.
 *  
 *@author Antonio Quesada
 *
 */

import java.util.Scanner;

public class Ej18alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos la variable.
    int dia;
    
    //Peticion de datos.
    System.out.println("Introduce el dia de la semana (del 1 al 7): ");
    dia = s.nextInt();
    
    //Proceso y salida.
    if (dia == 1) {
      System.out.println("Es Lunes");
    } else if (dia == 2) {
        System.out.println("Es Martes");
    } else if (dia == 3) {
        System.out.println("Es Miércoles");
    } else if (dia == 4) {
      System.out.println("Es Jueves");
    } else if (dia == 5) {
      System.out.println("Es Viernes");
    } else if (dia == 6) {
      System.out.println("Es Sábado");
    } else if (dia == 7) {
      System.out.println("Es Domingo");
    }
      
    //Mensaje de error. Numero de la semana incorrecto.
    else {
      System.out.println("ERROR.Número de la semana incorrecto");
    }
       
  }

}
