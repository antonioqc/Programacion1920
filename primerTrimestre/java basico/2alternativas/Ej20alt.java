/**Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur,
 * Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior 
 * se muestra en la tabla:
 * 
 * ZONA   UBICACIÓN        COSTO/GRAMO
 * 1    América del Norte   24.00 euros
 * 2    América Central     20.00 euros
 * 3    América del Sur     21.00 euros
 * 4    Europa              10.00 euros
 * 5    Asia                18.00 euros
 * 
 * Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y
 * de seguridad. 
 * Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 * 
 *@author Antonio Quesada 
 */

import java.util.Scanner;

public class Ej20alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int peso;
    
    //Petición de datos.
    System.out.println("Introduce el peso en gramos del paquete: ");
    peso = s.nextInt();
    
    //Muestra por pantalla que no se pueda introducir un valor mayor a 5000 gramos.
    if (peso>5000) {
      System.out.println("El paquete supera los 5kg. No puede ser transportado");
    } 
    
    //En el caso de que el peso sea menor de 5000 sigue ejecutándose el programa.    
    //Pedimos una opción en el menú.
      System.out.println("1. Cálculo del cobro para América del Norte.");
      System.out.println("2. Cálculo del cobro para América del Central.");
      System.out.println("3. Cálculo del cobro para América del Sur.");
      System.out.println("4. Cálculo del cobro para Europa.");
      System.out.println("5. Cálculo del cobro para Asia. ");
      System.out.print("Elige una de las opciones: ");
      int opcion = s.nextInt();
      
      //Si elegimos opcion (1,2,3,4,5) se mostrará el precio en euros por gramo.
        switch(opcion) {
        case 1:
          System.out.println("El precio será "+24.00*peso+" euros.");
          break;
        case 2:
          System.out.println("El precio será "+20.00*peso+" euros.");
          break;
        case 3:
          System.out.println("El precio será "+21.00*peso+" euros.");
          break;
        case 4:
          System.out.println("El precio será "+10.00*peso+" euros.");
          break;
        case 5:
          System.out.println("El precio será "+18.00*peso+" euros.");
          break;
          
        //En el caso de que se haya introducido una opción incorrecta en el menú se muestra por pantalla.
        default:
          System.out.println("Has introducido una opción incorrecta. Vuelve a intentarlo.");
      
        }
      
    }
  }


