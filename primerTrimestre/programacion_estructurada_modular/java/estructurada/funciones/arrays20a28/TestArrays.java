package estructurada.funciones.arrays20a28;

import java.util.Scanner;

/**
 * Test de la clase Arrays.
 * 
 * @author Antonio Quesada
 * @version 1.8
 */

public class TestArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //generaArrayInt. 10 números aleatorios comprendidos entre 1 y 10.
    int[] array = Arrays.GeneraArrayInt(10, 1, 10);
      
    //muestraArray.
    System.out.println("Muestra Array: ");
    Arrays.MostrarArray(array);
    System.out.println("------------------------------------------");
    System.out.println("\t");

    //minimoArrayInt.
    System.out.println("Imprime el valor MINIMO del array: "+Arrays.MinimoArrayInt(array)+"\n");

    //maximoArrayInt.
    System.out.println("Imprime el valor MAXIMO del array: "+Arrays.MaximoArrayInt(array)+"\n");
    
    //mediaArrayInt.
    System.out.println("Imprime la MEDIA del array: "+Arrays.MediaArrayInt(array)+"\n");
    System.out.println("-------------------------------------------------------------------");
   
    //estaEnArrayInt.
    System.out.println("Introduce un número para saber si se encuentra en el array: " );
    int encuentraArray = sc.nextInt();
    System.out.println("¿El número "+encuentraArray+"  se ENCUENTRA en el array? "+Arrays.EstaEnArrayInt(array, encuentraArray));
    System.out.println("-----------------------------------------------------------------------");
    
    //posicionEnArray.
    System.out.println("Introduce un número para encontrar su posición en el array: " );
    int posicion = sc.nextInt();
    System.out.println("El número " +posicion+ " se encuentra en la posición: ");
    Arrays.PosicionEnArray(array, posicion);
    System.out.println("-----------------------------------------------------------------------");
    
    //volteaArrayInt.
    System.out.println("VOLTEO del array: ");
    Arrays.VolteaArrayInt(array);
    Arrays.MostrarArray(array);
    System.out.println("------------------------------------------------------------");
    
    //rotaDerechaArrayInt.
    Arrays.RotaDerechaArrayInt(array, 2);
    System.out.println();
    System.out.println("Array después de rotar 2 posiciones a la DERECHA: ");
    Arrays.MostrarArray(array);
    
    
    //rotaIzquierdaArrayInt.
    Arrays.RotaIzquierdaArrayInt(array, 2);
    System.out.println();
    System.out.println("Array después de rotar 2 posiciones a la IZQUIERDA: ");
    Arrays.MostrarArray(array);
    
  }
  
}
