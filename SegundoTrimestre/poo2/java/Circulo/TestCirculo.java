package poo2.Circulo;


/**
 * Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su estado, lo haga crecer 27 veces, 
 * averigüe su área, lo haga decrecer 10 veces y muestre su estado final.
 * @author antonio
 *
 */

public class TestCirculo {
public static void main(String[] args) {

	//Creamos el objeto circulo.
	Circulo circulo = new Circulo(0); //si el radio es cero mostrará mensaje de error. En caso contrario no.
	
	//Estado.
	System.out.println(circulo);
	
	//Crece 27 veces.
	System.out.println("El circulo ha aumentado 27 veces su radio y su radio actual es "+circulo.creceRadio(27));
	
	//Área una vez crecido 27 veces.
	System.out.println("Y su area es "+circulo.getArea());
	System.out.println("------------------------------------");
	
	//Decrece 10 veces.
	System.out.println("El circulo ha decrementado 10 veces su radio y su radio actual es "+circulo.decrementaRadio(10));
	
	//Estado final del círculo.
	System.out.println(circulo);
		
 }

}