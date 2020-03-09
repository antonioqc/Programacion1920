/**Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números
 * primos que queremos mostrar.
 *
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej9rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int cantidad;
    
    //Petición de datos.
    System.out.println("Introduce la cantidad de números primos que quieres mostrar: ");
    cantidad = s.nextInt();
    
    //Ciclo for y salida.
    //Debe mostrar con un bucle for una x cantidad de numeros a partir de 2 que es el primer número primo.
    for (int primo=2; primo<=cantidad;primo++) {
        //Si el numero primo es divisible por el mismo o por 1, se cumple que es primo y lo imprime.
      if ((primo%2!=0 || primo==2) && (primo%3!=0 || primo==3) && (primo%5!=0 || primo==5) && (primo%7!=0 || primo==7)){
        System.out.println(primo);
    }
  }
    
  }
}
