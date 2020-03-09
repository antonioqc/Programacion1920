/**Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa
 * debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * Si se cumple Pitágoras entonces es triángulo rectángulo
 * Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * Si los 3 lados son iguales entonces es equilátero.
 * Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;
import java.math.*;

public class Ej11alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double a;
    double b;
    double c;
    
    //Leemos los tres lados del triángulo; a,b,c.
    System.out.println("Introduce el lado a del triangulo: ");
    a = s.nextDouble();
    System.out.println("Introduce el lado b del triangulo: ");
    b = s.nextDouble();
    System.out.println("Introduce el lado c del triangulo: ");
    c = s.nextDouble();
    
    //Proceso y salida.
    //Comprobamos is es equilatero, en este caso es excluyente.
    if (a==b && b==c) {
      System.out.println("Se trata de un triángulo equilátero");
    } else {
      
      //Comprobamos si es rectángulo (puede ser rectangulo y isóceles o escaleno).
      //Si cumple el teorema de pitagoras se trata de un triangulo rectángulo: H^2 = C^2+C^2.
      
        if ((c == Math.sqrt(Math.pow(a,2)+Math.pow(b,2))) || (a == Math.sqrt(Math.pow(b,2)+Math.pow(c,2))) || (b == Math.sqrt(Math.pow(a,2)+Math.pow(c,2)))) {
          System.out.println("Se trata de un triángulo rectángulo");
        
          //Comprobamos si es isósceles o escaleno.
        } if (a==b || a==c || b==c) {
          System.out.println("Se trata de un triángulo isósceles");
        } else {
          System.out.println("Se trata de un triángulo escaleno");
        }
    }
    
  }

}
