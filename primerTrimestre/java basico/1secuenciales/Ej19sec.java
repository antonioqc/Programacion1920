/**Escribir un algoritmo para calcular la nota final de un estudiante, considerando que por cada
 * respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej19sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int correcta;
    int incorrecta;
    int puntos;
    
    //Petición de datos.
    System.out.println("Introduce cuantas respuestas correctas has obtenido: ");
    correcta = s.nextInt();
    System.out.println("Introduce cuantas respuestas incorrectas has obtenido: ");
    incorrecta = s.nextInt();
    
    //Cálculo de las respuestas correcta e incorrectas.
    puntos = correcta*5+incorrecta*(-1);
    
    //Mostrar puntos.
    System.out.println("Los puntos que obtiene el estudiante son "+puntos);
    
    
  }

}
