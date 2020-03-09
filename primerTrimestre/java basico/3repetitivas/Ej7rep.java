/**Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y 
 * así sucesivamente. Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después
 * de los 20 meses.
 * 
 *@author Antonio Quesada 
 */

import java.util.Scanner;

public class Ej7rep {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Inicializamos las variables.
    int pago = 10;
    int acumulado = 0;
    
    //Ciclo for. Rango de 1 a 20 de los 20 meses.
    for (int i=1; i<=20; i++) {
      
    //Acumulamos el pago y doblamos el pago 
      acumulado += pago;
      pago *= 2;
      
    }
    
    //Imprimimos el pago.
    System.out.println("Pagará después de los 20 meses "+acumulado);
  }

}
