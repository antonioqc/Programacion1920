/**Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
 *
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej7sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int minutos;
    int minutosRes;
    int horasRes;
    
    //Introducimos la cantidad de minutos.
    System.out.println("Introduce una cantidad de minutos:");
    minutos = s.nextInt();
    
    //Cálculos
    horasRes = minutos/60; //Parte entera de los minutos para sacar las horas restantes.
    minutosRes = minutos%60; //Resto de los minutos
    
    //Imprime las horas y los minutos totales.    
    System.out.println(horasRes+" horas y "+minutosRes+" minutos.");
   
    
    
    
  }

}
