/**Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos
 * entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 * 
 * @author Antonio Quesada
 */

package estructurada.arrays.arraysBidimensionales;

import java.util.Scanner;


public class Ej5arraybi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Definimos e inicializamos las variables.
    int[][]numero = new int[6][10]; //Array bidimensional.
    int filas;
    int columnas = 10;
    int minimo = Integer.MAX_VALUE;
    int maximo = -Integer.MIN_VALUE; 
    int filaMaximo;
    int filaMinimo;
    int fmax = 0;
    int cmax = 0;
    int fmin = 0;
    int cmin = 0;
    
  //Se generan de forman aleatoria valores entre 0 y 1000 en cada casilla.
    for(filas=0; filas<6; filas++) {
      for(columnas=0; columnas<10; columnas++) {
        System.out.println("Fila "+(filas+0)+ " | Columna "+(columnas+0)+" :");
        System.out.println(numero[filas][columnas] = (int) Math.floor(Math.random()*(1000-0+1)+0)); 
   
        //Proceso. Notas máximas y minimas.
        //La nota máxima.
        if (numero[filas][columnas] > maximo) {
            fmax = filas;
            cmax = columnas;
            maximo = numero[filas][columnas];
           
        }
        
       //La nota mínima.
        if (numero[filas][columnas] < minimo) { 
            fmin = filas;
            cmin = columnas;
            minimo = numero[filas][columnas];
            
        }
      }  
    } 
     
    //Mostramos los resultados.
    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("El número máximo está en la fila "+fmax+" y en la columna "+cmax+".El número máximo es "+maximo);
    System.out.println("El número minimo está en la fila "+fmin+" y en la columna "+cmin+".El número mínimo es "+minimo);
    
  }

}
