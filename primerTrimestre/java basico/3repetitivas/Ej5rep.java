/**Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 
 * A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
 * La suma de los números que están dentro del intervalo (intervalo abierto).
 * Cuantos números están fuera del intervalo. Informa si hemos introducido algún número igual a los límites del intervalo.
 * 
 *@author Antonio Quesada 
 */

import java.util.Scanner;

public class Ej5rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Inicializamos las variables a 0.
    int suma = 0;
    int igual = 0;
    int fuera = 0;
    
    //Definimos las variables.
    int lim1;
    int lim2;
    int num;
    
    //Petición de datos.
    System.out.println("Introduce el limite inferior: ");
    lim1 = s.nextInt();
    System.out.println("Introduce el limite superior: ");
    lim2 = s.nextInt();
    
    while (lim1 > lim2) {
      System.out.println("Introduce el limite inferior: ");
      lim1 = s.nextInt();
      System.out.println("Introduce el limite superior: ");
      lim2 = s.nextInt();
    }
    
    //Pedimos numeros y decimos cuantos van fuera, cuales son iguales y cuales estan dentro del intervalo.
    do {
      System.out.println("Introduce un numero:");
      num = s.nextInt();
      
      if (num<lim2 && num>lim1) {
        suma+=num;
      }
      
      if (num==lim1 || num==lim2) {
        igual+=1;
      }
      
      if (num>lim2 || num<lim1) {
        fuera+=1; 
      }
        
    
    }while(num==0);
  
  //Muestra por pantalla
  System.out.println("La suma de los numeros del intervalo es " + suma);
  System.out.println("Los numeros que están fuera del intervalo "+ fuera);
  System.out.println("Son iguales a los límites del intervalo "+igual);

  }

}
