/**Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
 * diferentes países. El array que contiene los nombres de los paises es el siguiente:
 * pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular
 * mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210.
 * Los decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando 
 * el array de países (no se pueden escribir directamente).
 * 
 * @author Antonio Quesada
 */

package estructurada.arrays.arraysBidimensionales;

import java.util.Scanner;

public class Ej13arraybi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Definimos el array paises.
    String[] paises = {"España", "Rusia", "Japon", "Australia"};
    
    //Definimos e inicializamos las variables.
    int[][] estaturas = new int[4][10];
    int filas;
    int columnas;
    double sumaEstaturas = 0;
    double media = 0;
    double minimo =  Double.MAX_VALUE;
    double maximo = Double.MIN_VALUE;
    
  //Se generan de forman aleatoria valores entre 140 y 210 cm para la estatura en los países.
    for(filas=0; filas<4; filas++) {
      for(columnas=0; columnas<10; columnas++) {
        System.out.println("Pais: "+(paises[filas]));
        System.out.println(estaturas[filas][columnas] = (int) Math.floor(Math.random()*(210-140+1)+140)); 
        
        
      //Proceso. Estaturas máximas y minimas.
        //La estatura máxima.
        if (estaturas[filas][columnas] > maximo) {
            maximo = estaturas[filas][columnas];
        }
        
        //La estatura mínima.
        if (estaturas[filas][columnas] < minimo) { 
            minimo = estaturas[filas][columnas];
        }
        
      //Calculamos la estatura media de todas las notas.
        sumaEstaturas += estaturas[filas][columnas]; //Sumatorio de todas las estaturas.
        media = sumaEstaturas/(4*10); //Dividimos el sumatorio entre el número de estaturas que hay.
    
      }    
       
    }  
       
    //Mostramos los resultados.
    System.out.println("---------------------------------------------------");
    System.out.println("La estatura máxima es " +maximo+ " cm.");
    System.out.println("La estatura minima es " +minimo+ " cm.");
    System.out.println("La media de todas las estaturas es "+media+ " cm.");

  }

}