/**La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura,
 * de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos,
 * 70 céntimos, y a partir del décimo minuto, 50 céntimos.Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día,
 * en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto 
 * una persona que realiza una llamada.
 * 
 * Algoritmo:
 * Leer tiempo
 * Leer dia
 * Leer el turno y pago.
 * Si tiempo 0 a 5min = 1 euro
 * Si tiempo de 5 a 8 = 0,8 euro+1euro
 * Si 8 a 10 = 0,7 euro+0,8euro+1euro
 * A partir de 10 = 0,5 euro+0,7 euro+0,8euro+1euro
 * Si la llamada es en domingo  = pago*0,03
 * Si la llamada es otro día por la mañana  = pago*0,15
 * Si la llamada es otro día por la mañana  = pago*0,10
 * Mostrar coste final en euros
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej16alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double tiempo;
    String dia;
    String turno = " ";
    double pago = 0;
    
    //Petición de datos.
    System.out.println("¿Cuántos minutos dura la llamada telefónica?: ");
    tiempo = s.nextDouble();
    System.out.println("¿Se ha realizado la llamada telefónica en Domingo? Responda 'si' o 'no':");
    dia = s.nextLine();
    s.nextLine();
    
    if (dia!= "no") {
      System.out.println("¿El turno es de mañana(M) o tarde(T)?: ");
      turno = s.nextLine();
    }
    
    //Proceso. Tiempo de llamada y pago.
    if (tiempo >= 0 && tiempo <= 5) {
      pago = 100;
    } else if (tiempo <= 8) {
      pago = 100+0.8;
    } else if (tiempo <= 10) {
      pago = 100+0.8+0.7;
    } else if (tiempo > 10) {
      pago = 100+0.8+0.7+0.5;
    }
    
    else {
      System.out.println("No has introducido un valor correcto");
    }
    
    //Impuesto.
    if (dia.equals("si")) {
      System.out.println("Se ha cargado al coste "+(pago/100)*0.03);
    } else if (turno.toUpperCase().equals("M")) {
      System.out.println("Se ha cargado al coste "+(pago/100)*0.15);
    } else {
        System.out.println("Se ha cargado al coste "+(pago/100)*0.10);
    }
    
  }

}
