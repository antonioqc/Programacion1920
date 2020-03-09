/**Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
 * circunferencias y las clasifique en uno de estos estados:
 * exteriores
 * tangentes exteriores
 * secantes
 * tangentes interiores
 * interiores
 * concéntricas
 * 
 * Algoritmo:
 *   Leer datos y calcular distancia entre los centros.
 *   Exteriores: La distancia entre los centros es mayor que la suma de los radios. Las circunferencias no tienen puntos en común.
 *   Secantes: La distancia es menor que la suma de los radios y mayor que su diferencia. Tienen dos puntos en común.
 *   Interiores: La distancia entre los centros es mayor que cero y menor que la diferencia entre los radios.Una circunferencia está 
 *   dentro de la otra, y por tanto no tienen puntos en común.
 *   Tangentes exteriores: La distancia entre los centros es igual a la suma de los radios. El centro de cada circunferencia es exterior a la otra 
 *   y tienen un punto en común, punto de tangencia.
 *   Tangentes interiores: La distancia entre los centros es igual a la diferencia entre los radios. El centro de una de las
 *   circunferencias está dentro de la otra. Tienen un punto en común.
 *   Concéntricas: Tienen el mismo centro entonces la distancia=0. 
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;
import java.math.*;;

public class Ej10alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double x1;
    double y1;
    double x2;
    double y2;
    double r1;
    double r2;
    double distancia;
    
    //Petición de datos.
    System.out.println("Introduce el punto (x1,y1) de la primera circunferencia:");
    System.out.print("x1: ");
    x1 = s.nextDouble();
    System.out.print("y1: ");
    y1 = s.nextDouble();
    System.out.println("Introduce el radio de la primera circunferencia: ");
    r1 = s.nextDouble();
    System.out.println("Introduce el punto (x2,y2) de la primera circunferencia");
    System.out.print("x2: ");
    x2 = s.nextDouble();
    System.out.print("y2: ");
    y2 = s.nextDouble();
    System.out.println("Introduce el radio de la segunda circunferencia: ");
    r2 = s.nextDouble();
    
    //Calculamos la distancia entre los centros de las circunferencias. Importamos Math.
    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    //Mostramos la posición relativa de las circunferencias.
    if (distancia > (r1+r2)) {
      System.out.println("Las circunferencias son exteriores");
    } else if (distancia <(r1+r2) && distancia > (r1-r2)) {
        System.out.println("Las circunferencias son secantes");
    } else if (distancia > 0 && distancia < (r1-r2)) {
        System.out.println("Las circunferencias son interiores");  
    } else if (distancia==(r1+r2)) {
        System.out.println("Las circunferencias son tangentes exteriores");
    } else if (distancia==(r1-r2)) {
        System.out.println("Las circunferencias son tangentes interiores");
    } else if (distancia == 0){
        System.out.println("Las circunferencias son concéntricas");
    }
    
    
  }

}
