package estructurada.funciones.arrays20a28;

/***
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números 
 * enteros que contenga las siguientes funciones:
 *   
 * @author antonio
 * @version 1.8
 */

public class Arrays {
  
  /**
   * Muestra array para el Test.
   * @param x
   */
  
  public static void MostrarArray(int array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " | ");
    }
      System.out.println();
    }
  
  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo)
   * se indica como parámetro.
   * @param num
   * @param minimo
   * @param maximo
   * @return generaArrayInt
   */
  
  public static int[] GeneraArrayInt(int num, int minimo, int maximo) {
    int[] array = new int[num];
    
    for (int i=0; i<num; i++) {
      array[i] = (int) (Math.random()*(minimo-maximo)+maximo);
    }
    return array;
  }
  
  /**
   * Devuelve el mínimo del array que se pasa como parámetro.
   * @param num
   * @return minimoArrayInt
   */
  
  public static int MinimoArrayInt(int[]num) {
    int minimo = Integer.MAX_VALUE;
    for (int i=0; i<num.length; i++) {
      if (num[i] < minimo) { 
        minimo = num[i];
    }
    
   }
    return minimo;
  }
  
  /**
   * Devuelve el máximo del array que se pasa como parámetro.
   * @param num
   * @return maximoArrayInt
   */
  
  public static int MaximoArrayInt(int[]num) {
    int maximo = Integer.MIN_VALUE;
    for (int i=0; i<num.length; i++) {
      if (num[i] > maximo) { 
        maximo = num[i];
    }
    
   }
    return maximo;
  }
  
  /**
   * Devuelve la media del array que se pasa como parámetro.
   * @param num
   * @return media
   */
  
  public static int MediaArrayInt(int[]num) {
   int sumaNotas = 0;
   int media = 0;
   
   for (int i=1; i<num.length; i++) {
     sumaNotas += num[i]; 
     media = sumaNotas/i;
   }
   return media;
  }
  
  /**
   * Dice si un número está o no dentro de un array.
   * @param num
   * @return devuelve true si se encuentra en el array y false si no.
   */
  
  public static boolean EstaEnArrayInt(int[]array, int numBuscar) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == numBuscar) {
         return true;
      } 
   }
    return false; 
  }
  
  /**
   * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
   * @param array
   * @param num
   */
  
  public static void PosicionEnArray(int[]array, int numBuscar) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == numBuscar) {
         System.out.println(i+1);
      } 
   }
       
  }
  
  /**
   * Le da la vuelta a un array.
   * @param num
   * @return volteaArrayInt
   */
  
  public static int[] VolteaArrayInt(int[]array) {
    int aux;
    for (int i = 0; i < array.length / 2; i++) {
        aux = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = aux;
    }

    return array;
  }
  
  
  /**
   * Rota n posiciones a la derecha los números de un array.
   * 
   * 1 2 3 4 5
   * 4 5 1 2 3  Ejemplo: se recorre dos posiciones a la derecha
   * 
   * @param num
   * @return rotaDerechaArrayInt
   */
  
  public static void RotaDerechaArrayInt(int[]array, int n) {
    int[]copia = new int[array.length];
    int c = n; //contador array copia
    
    //llevando al array copia el desplazamiento.
    for(int i=0; i<array.length; i++) {
      copia[c] = array[i];
      c++;
      
      if (c == array.length) { 
        c = 0;
      }
    }
    
    //llevo la copia al array que me llega como parametro.
    for(int i=0; i<array.length; i++) {
      array[i] = copia[i];
    }
    
  }
  
  /**
   * Rota n posiciones a la izquierda los números de un array.
   * @param array
   * @param n
   */
  
  public static void RotaIzquierdaArrayInt(int[]array, int n) {
    int[]copia = new int[array.length];
    int c = n; //contador array copia
    
    //llevando al array copia el desplazamiento.
    for(int i=0; i<array.length-1; i++) {
      copia[c] = array[i];
      c++;
      
      if (c == array.length-1) { 
        c = 0;
      }
    }
    
    //llevo la copia al array que me llega como parametro.
    for(int i=0; i<array.length-1; i++) {
      array[i] = copia[i];
    }
    
  }
  
}
