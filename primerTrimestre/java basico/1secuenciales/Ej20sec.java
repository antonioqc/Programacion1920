/**Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de pedirnos
 * cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).
 *
 *@author Antonio Quesada 
 */

import java.util.Scanner;

public class Ej20sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int dosEuros;
    int unEuro;
    int cincuentaCentimos;
    int veinteCentimos;
    int diezCentimos;
    int euros;
    int centimos;
    
    System.out.println("Introduce cuántas monedas de 2 euros tienes:");
    dosEuros = s.nextInt();
    System.out.println("Introduce cuántas monedas de 1 euros tienes:");
    unEuro = s.nextInt();
    System.out.println("Introduce cuántas monedas de 50 céntimos tienes:");
    cincuentaCentimos = s.nextInt();
    System.out.println("Introduce cuántas monedas de 20 céntimos tienes:");
    veinteCentimos = s.nextInt();
    System.out.println("Introduce cuántas monedas de 10 céntimos tienes:");
    diezCentimos = s.nextInt();
    
    //Calculamos el total de euros.
    euros = 2*dosEuros + 1*unEuro;
        
    //Calculamos el total de céntimos.
    centimos = 50*cincuentaCentimos + 20*veinteCentimos + 10*diezCentimos;

    //Convertimos de céntimos a euros.
    euros = euros + (centimos/100);
    centimos = centimos%100;
    
    //Mostramos los euros y centimos totales.
    System.out.println("Tienes "+euros+" euros y "+centimos+" centimos");

  }

}
