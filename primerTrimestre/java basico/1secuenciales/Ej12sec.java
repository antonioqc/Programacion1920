/**Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
 * Calcula y muestra la distancia entre ellos.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;
import java.math.*;

public class Ej12sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double x1;
    double y1;
    double x2;
    double y2;
    double distancia;
    
    //Pedimos los datos de la primera coordenada.
    System.out.println("Inserte las coordenadas del primer punto:");
    System.out.print("x1: ");
    x1 = s.nextDouble();
    System.out.print("y1: ");
    y1 = s.nextDouble();
    

    //Pedimos los datos de la segunda coordenada.
    System.out.println("Inserte las coordenadas del segundo punto:");
    System.out.print("x2: ");
    x2 = s.nextDouble();
    System.out.print("y2: ");
    y2 = s.nextDouble();
    
    //Calculamos la distancia entre dos coordenadas.
    //Importamos Math.sqrt(raiz cuadrada) y Math.pow(elevado al cuadrado).
    
    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    //Mostramos la distancia.
    System.out.println("La distancia entre ambos puntos es " +distancia);

    

  }

}
