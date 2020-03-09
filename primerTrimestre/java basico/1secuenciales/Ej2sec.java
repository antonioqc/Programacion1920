/** Calcular el perímetro y área de un rectángulo dada su base y su altura.
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
    System.out.println("Introduce la base del rectángulo: ");
    base =  s.nextDouble();
    System.out.println("Introduce la altura del rectángulo: ");
    altura =  s.nextDouble();
    
    //Calculamos el area(b*h) y el perímetro(2*b*^h). Imprimimos datos. 
    perimetro = 2*base+2*altura;
    area = base*altura;
    System.out.println("El perímetro es "+perimetro+" y el área es "+area);
    

  }

}
