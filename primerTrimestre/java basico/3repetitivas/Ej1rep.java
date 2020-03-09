/**Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
 * A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
 * a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el
 * número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;
import java.util.Random;

public class Ej1rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
       
   //Generamos el número aleatorio del 1 al 100.
    int numeroAleatorio =  (int) (Math.random()*99 + 1);

    //Bucle para que no pase de los 10 intentos.
    for (int i = 1; i<11; i++){
      System.out.println("Te quedan " + (11 - i)+ " intentos");
      
      //Va preguntando el numero hasta que termine el bucle.
      System.out.print("Introduce un número entre 1 y 100: ");
      int numeroIntroducido = s.nextInt();
      
      //Si se introducen numeros mayores a 100 muestra mensaje de error..
      if (numeroIntroducido > 100) {
        System.out.println("Sólo se permiten números entre 1 y 100.");
        break; //Rompe la ejecución.
      }
      
      //Va comprobando si el numero es mayor, igual o menor y cuantos intentos hay
      if (numeroIntroducido == numeroAleatorio) {
        System.out.println("Has ACERTADO el número");
        break; //Ganas el juego y termina el bucle for.
        
    } else if (numeroIntroducido > numeroAleatorio) {
        System.out.println("El numero que has introducido es mayor que el aleatorio");
        
    } else if (numeroIntroducido < numeroAleatorio) {
        System.out.println("El numero que has introducido es menor que el aleatorio");
    }

    //En el caso de que no se haya acertado el número y haya superado los 10 intentos, el programa termina.    
     if (i>=10) { 
       System.out.println("Has superado los 10 intentos. El número correcto era "+numeroAleatorio);
      }
     
    }

}

}
