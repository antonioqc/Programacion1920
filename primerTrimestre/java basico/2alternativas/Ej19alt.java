/**Escribe un programa que pida un número entero entre uno y doce e imprima el número de días 
 * que tiene el mes correspondiente.
 * 
 * Algoritmo:
 * Leer numero de mes como entero.
 * Si es el 1,3,5,7,8,10,12 el mes tiene 31 días.
 * Si es el 2 el mes tiene 28 o 29 días.
 * Si es el 4,6,9,11 el mes tiene 31 días.
 * Si no mostrará un mensaje de error ("Mes incorrecto").
 * 
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej19alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos número
    int num;
    
    //Peticion de datos.
    System.out.println("Introduce un número entre 1 y 12 que corresponda a un mes del año: ");
    num = s.nextInt();
    
    //Proceso y salida.
    if (num==1 || num==3 || num==5 || num == 7 || num == 8 || num == 10 || num == 12) {
      System.out.println("El mes tiene 31 días");
    } else if (num==4 || num==6 || num==9 || num==11) {
      System.out.println("El mes tiene 30 días");
    } else if (num==2) {
      System.out.println("El mes tiene 28 días o 29 días");
    } 
    
    //Mostramos un mensaje de error.
    else {
      System.out.println("ERROR. Mes incorrecto.");
    }
  }

}
