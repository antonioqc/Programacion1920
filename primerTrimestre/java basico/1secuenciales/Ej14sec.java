/**Dado un numero de dos cifras, diseñe un algoritmo que permita obtener el numero invertido.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej14sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    int decenas;
    int unidades;
    int invertido;
    int num;
    
    //Pedimos un numero de dos cifras.
    System.out.println("Inserte un numero de dos cifras: ");
    num = s.nextInt();
    
    
    decenas = num/10; //Division entera del numero entre 10.
    unidades = num%10; //El restante del numero al dividir entre 10.
    invertido = unidades*10+decenas;
    
    //Mostramos las decenas y unidades invertidas.
    System.out.println("El numero invertido es "+invertido);
    
  }

}
