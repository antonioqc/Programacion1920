/**Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de 
 * forma aleatoria (valores entre 100 y 999).
 * 
 * @author Antonio Quesada
 */

package estructurada.arrays.arraysBidimensionales;

import java.util.Scanner;

public class Ej3arraybi {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    
    //Definimos e inicializamos las variables.
    int[][]numero = new int[4][5]; //Array bidimensional.
    int filas;
    int columnas;
    int sumarColumnas = 0;
    int sumarFilas = 0;
    int sumaTotal = 0;
    
    //Se generan de forman aleatoria valores entre 100 y 999 en cada casilla.
    for(filas=0; filas<4; filas++) {
      for(columnas=0; columnas<5; columnas++) {
        System.out.println("Fila "+(filas+0)+ " | Columna "+(columnas+0)+" :");
        System.out.println(numero[filas][columnas] = (int) Math.floor(Math.random()*(999-100+1)+100));   
        
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
    System.out.println("La suma total será "+sumaTotal);
  }

}