/**Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

public class Ej2arrayuni {
  public static void main(String[] args) {
    
    //Definición del array y reserva de memoria.
    char[]letra = new char[10];

    letra[0] = 'a';
    letra[1] = 'x';
    letra[4] = '@';
    letra[6] = ' ';
    letra[7] = '+';
    letra[8] = 'Q';
    
    //Mostramos el contenido del array.
    System.out.println("Los valores del array n son los siguientes: ");
    for (int i = 0; i < 10; i++) {
      System.out.println((0+i)+" = "+letra[i]);
    }
    
  }

}
