/** Un alumno desea saber cual ser� su calificaci�n final en la materia de Algoritmos. Dicha calificaci�n
 * se compone de los siguientes porcentajes:
 * 55% del promedio de sus tres calificaciones parciales.
 * 30% de la calificaci�n del examen final.
 * 15% de la calificaci�n de un trabajo final.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej10sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double parcial1;
    double parcial2;
    double parcial3;
    double examenFinal;
    double trabajo;
    double notaFinal;
    
    //Petici�n de datos.
    System.out.println("Inserte la calificaci�n del primer parcial:");
    parcial1 = s.nextDouble();
    System.out.println("Inserte la calificaci�n del segundo parcial:");
    parcial2 = s.nextDouble();
    System.out.println("Inserte la calificaci�n del tercer parcial:");
    parcial3 = s.nextDouble();
    System.out.println("Inserte la calificaci�n del examen final:");
    examenFinal = s.nextDouble();
    System.out.println("Inserte la calificaci�n del trabajo:");
    trabajo = s.nextDouble();
    
    //C�lculo de la nota final.
    notaFinal = ((parcial1+parcial2+parcial3)/3)*0.55+0.3*examenFinal+0.15*trabajo;
    
    //Mostramos la nota final.
    System.out.println("La calificaci�n final ser� "+notaFinal);
 

  }

}
