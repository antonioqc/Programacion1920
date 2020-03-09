/**El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto
 * debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada
 * alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta
 * del autobús es de 4000 euros, sin importar el número de alumnos. 
 * Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;
import java.math.*;

public class Ej15alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos la variable alumnos.
    int alumnos;
    
    //Peticion de datos.
    System.out.println("¿Cuántos alummnos van?");
    alumnos = s.nextInt();
    
    //Proceso y salida.
    //Si los alumnos son menos de 0 es una cifra inexistente por lo que es incorrecto.
    if (alumnos < 0) {
      System.out.println("El dato introducido no es correcto");
    } else {  
        if (alumnos >= 100) {   //Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
          System.out.println("El costo por cada alumnos es de 65 euros");
        } else if (alumnos >=50 && alumnos <=99) {    //Si son entre 50 a 99 alumnos, el costo es de 70 euros.
            System.out.println("El costo es de 70 euros");
        } else if (alumnos >=30 && alumnos <=49) {    //Si son entre 30 a 49 alumnos, el costo es de 95 euros.
            System.out.println("El costo es de 95 euros");
        } else if (alumnos < 30) {    //Si son menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros.
            System.out.println("El costo de la renta del autobus es de 4000 euros");
        }
    }
  
  }

}
