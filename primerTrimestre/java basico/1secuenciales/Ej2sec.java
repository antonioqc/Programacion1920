/** Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej2sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double base; 
    double altura;
    double perimetro;
    double area;
    
    //Pedimos datos y leemos las variables.
    System.out.println("Introduce la base del rect�ngulo: ");
    base =  s.nextDouble();
    System.out.println("Introduce la altura del rect�ngulo: ");
    altura =  s.nextDouble();
    
    //Calculamos el area(b*h) y el per�metro(2*b*^h). Imprimimos datos. 
    perimetro = 2*base+2*altura;
    area = base*altura;
    System.out.println("El per�metro es "+perimetro+" y el �rea es "+area);
    

  }

}
