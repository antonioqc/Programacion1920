/**Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

import java.util.Scanner;

public class Ej8arrayuni {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Reservamos espacio para que se introduzca la temperatura de los 12 meses.
    int[] temp = new int[12];
    
    //Almacenamos en un array todos los meses del año.
    String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio","julio", "agosto", "septiembre", "octubre", 
        "noviembre", "diciembre"};
    
    //Bucle para que pida al usuario la temperatura de cada mes.
    for (int i=0; i<12; i++) {
      System.out.println("Introduce la temperatura media (en grados) del mes "+(meses[i])+" :");
      temp[i] = sc.nextInt();
      
    }
    
    //Mostramos en un bucle la temperatura de cada mes.
    for (int j=0; j<12; j++) {
      System.out.println(meses[j]+" = "+temp[j]+" ºC");
    }

  }

}
