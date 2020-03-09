/**Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince 
 * (15 filas) de forma que la probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la
 * probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Antonio Quesada
 */

package aleatorios;

import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    double apuesta;
    double limite = 0.5+1/3;
   
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 3; j++){
        apuesta = Math.random();
          if (apuesta<=0.5) {
            System.out.println("1");
          }if(apuesta<=limite) {
              System.out.println("2");
          } else {
            System.out.println("X");
          }
    }   
     
}    
  
}
 
}