package poo1.Fraccion;

public class Fraccion {
	
	//Atributos.
	private int numerador;
	private int denominador;
	
//Métodos.

/**
 * Método constructor de la clase.
 * @param numerador
 * @param denominador
 */

public Fraccion(int numerador, int denominador) {
	this.numerador = numerador;
	this.denominador = denominador;
}

/**
 * 
 * @return numerador
 */

public int getNumerador() {
	return numerador;
}

/**
 * 
 * @param numerador
 */

public void setNumerador(int numerador) {
	this.numerador = numerador;
}

/**
 * Getter del denominador.
 * @return denominador
 */

public int getDenominador() {
	return denominador;
}

/**
 * Setter del denominador.
 * @param denominador
 */

public void setDenominador(int denominador) {
	if (denominador != 0) {
		this.denominador = denominador;
	} else {
		System.out.println("ERROR, el denominador no puede ser 0.");
	}

}

//Método toString para mostrar la fraccion.
@Override
public String toString() {
	return (+this.numerador+"/"+this.denominador);
}

/**
 * Resultado de las fracciones.
 * @return division del numerador entre el denominador.
 */

public double resultado() {
	return this.numerador / this.denominador;
	
}

/**
 * Multiplica la fracción por un numero.
 * @param numero
 * @return multiplicacion de los numeradores entre denominadores.
 */

public int multiplicaNumero(int numero) {
	return (this.numerador * numero) / this.denominador;
}

/**
 * 
 * @param f2
 */

public void multiplicarFraccion(Fraccion f2) {
	this.numerador *= f2.numerador;
	this.denominador *= f2.denominador;
	
}

/**
 * Método que sumará una fracción pasada por parámetro a la fracción actual.
 * @param otra
 */
void sumaFraccion (Fraccion otra) {
  this.numerador = (this.numerador * otra.denominador) + (this.denominador * otra.numerador);
  this.denominador = (this.denominador * otra.denominador);
}

/**
 * Método que restará una fracción pasada por parámetro a la fracción actual.
 * @param otra
 */
void restaFraccion (Fraccion otra) {
  this.numerador = (this.numerador * otra.denominador) - (this.denominador * otra.numerador);
  this.denominador = (this.denominador * otra.denominador);
}

/**
 * Método que nos ayudará a hallar el máximo común divisor de la fracción para 
 * implementar el método simplifica
 * @return
 */
private int maximoComunDivisor() {
  
  int dividendo = this.numerador;
  int divisor = this.denominador;
  int resto = dividendo%divisor;
  int mcd = 0;
  
  while (resto != 0) {
    dividendo = divisor;
    divisor = resto;
    resto = dividendo%divisor;
    mcd = divisor;
  }
  return mcd;
}

/**
 * Simplifica la fraccíon dividiendo el numerador y el denominador por el mcd
 */
void simplifica() {
  int mcd;
  mcd = this.maximoComunDivisor();
  this.numerador /= mcd;
  this.denominador /= mcd;
}


}


