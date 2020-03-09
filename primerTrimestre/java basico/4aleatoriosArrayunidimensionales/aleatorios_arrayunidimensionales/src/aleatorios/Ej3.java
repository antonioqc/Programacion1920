/**Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii 
 * entre el 32 y el 126. Puedes hacer casting con (char) para  convertir un entero en un carácter.
 * 
 * @author Antonio Quesada
 */

package aleatorios;

public class Ej3 {
  public static void main(String[] args) {

    //Números aleatorios entre 32 y 127. 
    //Utilizo casting con char para convertir el entero a caracteres.
   for(int i=0; i<100; i++) {
     System.out.println((char)((Math.random()*127)+32));
   }

  }

}
