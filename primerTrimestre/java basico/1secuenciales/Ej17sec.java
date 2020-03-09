/**Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo de viaje hasta
 * llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine la hora de llegada a la
 * ciudad B.
 * 
 * @author Antonio Quesada
 */

import java.util.Scanner;

public class Ej17sec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Definimos las variables.
    int h;
    int m;
    int s;
    int tiempoTardado;
    int tiempoInicial;
    int tiempoFinal;
    
    //Petición de datos.
    System.out.println("Inserte la hora de partida: ");
    h = sc.nextInt();
    System.out.println("Inserte el minuto de partida: ");
    m = sc.nextInt();
    System.out.println("Inserte el segundo de partida: ");
    s = sc.nextInt();
    System.out.println("Inserte el tiempo en segundos que has tardado: ");
    tiempoTardado = sc.nextInt();
    
    //Convierto las horas, minutos y segundos de partida a segundos.
    tiempoInicial = h*3600+m*60+s;

    //Sumo los segundos de partida de la ciudad A a el tiempo que ha tardado hasta la ciudad B.
    tiempoFinal = tiempoInicial + tiempoTardado;

    //Convierto el tiempo_final de segundos a horas, minutos y segundos.
    h = (tiempoFinal/3600);
    m = ((tiempoFinal%3600)/60);
    s = ((tiempoFinal%3600)%60);

    //Mostramos la salida.
    System.out.println("La hora de llegada será a las "+h+" horas "+m+" minutos y "+s+" segundos");


  }

}
