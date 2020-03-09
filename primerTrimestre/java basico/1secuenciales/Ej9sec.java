/**Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
 * cuanto deberá pagar finalmente por su compra.
 *
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej9sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double precio;
    double descuento;
    
    //Pedimos el precio de la compra.
    System.out.println("Inserte el precio de la compra:");
    precio = s.nextDouble();
    
    //Cálculo para aplicar el descuento
    descuento = (precio-precio*0.15);
    
    //Imprimos el descuento total de la compra.
    System.out.println("El descuetno total de la compra es "+descuento+ " euros");

  }

}
