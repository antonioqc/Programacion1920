/**Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 * El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante)
 * y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

public class Ej10arrayuni {
  public static void main(String[] args) {
    int[] numero = new int[20] ;
    int[] par = new int[20];
    int pares = 0;
    int impares = 0;
    int[] impar = new int[20];
    
    //Genera 20 numeros aleatorios entre 0 y 100.
    for (int i = 0; i<20; i++) {
      numero[i] = (int) (Math.random()*101);
      
      //Decimos si es par o impar.
      if(numero[i]%2 == 0) {
        par[pares++]=numero[i];
      } else {
        impar[impares++]=numero[i]; 
      }
      
     
    //Pasamos los numeros pares a las primeras posiciones.
      for (i = 0; i < pares; i++) {
        numero[i] = par[i];
      }
      
   //Pasamos los numeros impares a las celdas restantes.
      for (i = pares; i < 20; i++) {
        numero[i] = impar[i - pares];
      }

   //Mostramos el resultado por pantalla.
      for (i = 0; i < 20; i++) {
        System.out.println(numero[i]);
      } 

    }
    
  }

}
