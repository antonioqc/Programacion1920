/** Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. 
 * El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia 
 * entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
 * tiempo (minutos) alcanzará el vehículo más rápido al otro.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej16sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double v1;
    double v2;
    double distancia;
    double tiempo;
    
    //Petición de datos.
    System.out.println("Inserte la velocidad en Km/h del coche 1: ");
    v1 = s.nextDouble();
    System.out.println("Inserte la velocidad en Km/h del coche 2: ");
    v2 = s.nextDouble();
    System.out.println("Inserte la distancia en Km entre los dos coches: ");
    distancia = s.nextDouble();
    
    //Calculamos el tiempo sabiendo que velocidad=distancia/tiempo.
    //Multiplicamos por 60 para pasar el tiempo a minutos.
    tiempo = (distancia/(v1-v2))*60;
    
    //Mostramos el tiempo.
    System.out.println("Tardará en alcanzarlo "+tiempo+" minutos.");

  }

}
