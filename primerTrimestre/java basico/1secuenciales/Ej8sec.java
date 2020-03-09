/**Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber
 * cuanto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el total
 * que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
 * 
 * @author Antonio Quesada
 */


import java.util.Scanner;

public class Ej8sec {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Definimos las variables.
    double base;
    double venta1;
    double venta2;
    double venta3;
    double sueldo;
    double comision;
    
    //Petición de datos.
    System.out.println("Introduce cual es el salario base: ");
    base = s.nextDouble();
    System.out.println("Introduce el precio de la primera venta: ");
    venta1 = s.nextDouble();
    System.out.println("Introduce el precio de la segunda venta: ");
    venta2 = s.nextDouble();
    System.out.println("Introduce el precio de la tercera venta: ");
    venta3 = s.nextDouble();
    
    //Aplicamos el 10% de la comision a las tres ventas sumándole el sueldo base.
    comision = 10/100; 
    sueldo = base+comision*(venta1+venta2+venta3);
    
    //Mostramos la salida.
    System.out.println("El sueldo total que recibirá al mes será de "+sueldo+" euros");

  }

}
