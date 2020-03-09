/**Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
 * mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
 * dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
 * imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej8alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    String sexo;
    int nota;
    int edad;
    
    //Petición de datos.
    System.out.println("Introduce cuál es su sexo (M ó F): ");
    sexo = s.nextLine();
    System.out.println("Introduce la nota: ");
    nota = s.nextInt();
    System.out.println("Introduce su edad: ");
    edad = s.nextInt();
    
    //Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 y el sexo es femenino 'F' será aceptada.
    if (nota>=5 && edad>=18) {
      String F = " ";
      if (sexo == F ) {
      } System.out.println("ACEPTADA");
    }
    
    //Si la nota es mayor o igual a 5 y la edad es mayor o igual a 16 y el sexo es masculino 'M' será posible. 
    else if (nota>=5 && edad >= 16) {
      String M = " ";
      if (sexo == M) {
      } System.out.print("POSIBLE");
    }
    
    //Sino no será aceptada.
    else {
      System.out.println("NO ACEPTADA");
    }  
    
  }

}
