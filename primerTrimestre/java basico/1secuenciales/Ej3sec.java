/**Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;
import java.math.*;

public class Ej3sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    
    double cateto1;
    double cateto2;
    double hipotenusa;
    
    //Pedimos los catetos y lo leemos.
    System.out.println("Introduce el primer cateto:");
    cateto1 = s.nextDouble();
    System.out.println("Introduce el segundo cateto:");
    cateto2 = s.nextDouble();
    
    //Calculamos la hipotenusa por el teorema de Pitágoras importando math.
    hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    
    //Mostramos el resultado.
    System.out.println("La hipotenusa es "+hipotenusa);


  }   
}
