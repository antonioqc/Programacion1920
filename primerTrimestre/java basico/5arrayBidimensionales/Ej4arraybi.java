/**Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en
 * la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda “pensando” 
 * antes de mostrar los números.
 *
 * @author Antonio Quesada
 */

package estructurada.arrays.arraysBidimensionales;

import java.util.Scanner;

public class Ej4arraybi {
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    
    //Definimos e inicializamos las variables.
    int[][]numero = new int[4][5]; //Array bidimensional.
    int filas;
    int columnas;
    int sumarColumnas = 0;
    int sumarFilas = 0;
    int sumaTotal = 0;
    
    //Pide 20 números enteros. Se introduce el numero en la posicion de esa fila y columna.
    for(filas=0; filas<4; filas++) {
      for(columnas=0; columnas<5; columnas++) {
        System.out.println("Introduce un número para la fila "+(filas+0)+ " y columna "+(columnas+0)+" :");
        numero[filas][columnas] = sc.nextInt();   
        
        //Retardo al mostrar las sumas parciales de 1000 milisegundos.
        Thread.sleep(1000);
        //Suma de las columnas.
        sumarColumnas += numero[filas][columnas];
        
        //Suma de las filas.
        sumarFilas += numero[filas][columnas];
      }
      
    }
    
    //Suma total.Se suma todos los valores de cada columna.
    //Cada resultado de cada columna se suma y sale la suma total de las filas y columnas. 
    sumaTotal += sumarColumnas;
    
    //Se muestra la suma total.
    System.out.println("---------------------------------");
    Thread.sleep(2000); //Espera de 2 segundos. 
    System.out.println("La suma total será "+sumaTotal);
    
  }

}
