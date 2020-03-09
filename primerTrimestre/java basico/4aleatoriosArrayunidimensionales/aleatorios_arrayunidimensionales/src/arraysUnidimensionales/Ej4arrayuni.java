/**Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array
 * numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de
 * los valores que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores 
 * que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
 * 
 * @author Antonio Quesada
 */

package arraysUnidimensionales;

public class Ej4arrayuni {
  public static void main(String[] args) {
    
    //Definimos tres arrays.
    int[] numero = new int[20] ;
    int[] cuadrado = new int[20]; 
    int[] cubo = new int[20]; 
    
    System.out.println("numero aleatorio | numero al cuadrado | numero al cubo");
    System.out.println("--------------------------------------------------------");
    
    //Proceso. Bucle for.
    for (int i = 0; i<20; i++) {
      numero[i] = (int) (Math.random()*100); //Cargamos el array numero con valores aleatorios entre 0 y 100.
      cuadrado[i] = numero[i]+numero[i]; //Cuadrado es 2 veces los sumandos de numero.
      cubo[i] = cuadrado[i]+numero[i]; //Cubo es tres veces los sumandos de numero.
      
      //Mostramos el resultado.
      System.out.println(+numero[i]+"    |  "+cuadrado[i]+"   |  "+cubo[i]+"   |  " );
  }
    
}
  
}