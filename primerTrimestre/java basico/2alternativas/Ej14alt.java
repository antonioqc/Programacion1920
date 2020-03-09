/**La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B,
 * y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar
 * cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A, se le cargan
 * 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos 
 * cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
 *
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej14alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double precioInicial;
    String tipo;
    int tamaño;
    
    //Petición de datos.
    System.out.println("Inserte cuál es el precio inicial al kilo de uva:");
    precioInicial = s.nextDouble();
    System.out.println("Inserte cuál es el tipo(A o B):");
    tipo = s.nextLine();
    s.nextLine();
    System.out.println("Inserte cuál es el tamaño(1 o 2): ");
    tamaño = s.nextInt();
    
    if (tipo.toUpperCase().equals("A") && tamaño == 1) {
      System.out.printf("La ganancia obtenida "+0,20+precioInicial+" al precio inicial.");
    } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
        System.out.printf("La ganancia obtenida "+0,30+precioInicial+" al precio inicial.");
    } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
        System.out.printf("La ganancia obtenida "+0,30-precioInicial+" al precio inicial.");
    } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
      System.out.printf("La ganancia obtenida "+0,50-precioInicial+" al precio inicial.");
    }      
  }

}
