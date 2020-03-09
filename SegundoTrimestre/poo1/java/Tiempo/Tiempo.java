package poo1.Tiempo;

/**
 * Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 * Tiempo t1 = new Tiempo(1, 20, 30);
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente.
 * crea métodos para:
 * Sumar y restar otro objeto de la clase Tiempo.
 * Sumar y restar segundos, minutos y/o horas.
 * Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author antonio
 *
 */

//Atributos.
public class Tiempo {
	private int horas;
	private int minutos;
	private int segundos;
	
//Métodos.

/**
 * Método constructor de la clase.
 * @param horas
 * @param minutos
 * @param segundos
 */


public Tiempo(int horas, int minutos, int segundos) {
	this.horas = horas;
	this.minutos = minutos;
	this.segundos = segundos;
}

/**
 * Método getter de horas.
 * @return horas
 */

public int getHoras() {
	return horas;
}

/**
 * Método setter de horas.
 * @param horas
 */

public void setHoras(int horas) {
	this.horas = horas;
}

/**
 * Método getter de minutos.
 * @return minutos
 */

public int getMinutos() {
	return minutos;
}

/**
 * Método setter de minutos. 
 * @param minutos
 */

public void setMinutos(int minutos) {
	this.minutos = minutos;
}

/**
 * Método getter de segundos.
 * @return segundos
 */

public int getSegundos() {
	return segundos;
}

/**
 * Método setter de segundos.
 * @param segundos
 */

public void setSegundos(int segundos) {
	this.segundos = segundos;
}

//Método toString para mostrar el tiempo.
@Override
public String toString() {
	return (+this.horas+" h "+this.minutos+" m "+this.segundos+" s");
}

/**
 * Convertimos los segundos del tiempo total a horas, minutos y segundos.
 * @param tiempoTotal
 */

public void conversor(int tiempoTotal) {
	this.horas = tiempoTotal / 3600;
	this.minutos = (tiempoTotal % 3600) / 60;
	this.segundos = (tiempoTotal % 3600) % 60;
}

/**
 * Suma de tiempo 1 al 2.
 * @param t2
 */

public void sumaTiempo(Tiempo t2) {
	int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos + t2.horas * 3600 + t2.minutos * 60 + t2.segundos;
	this.conversor(tiempoTotal);
}

/**
 * Resta de tiempo 1 al 2.
 * @param t2
 */

public void restaTiempo(Tiempo t2) {
	int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos - t2.horas * 3600 - t2.minutos * 60 - t2.segundos;
	this.conversor(tiempoTotal);
}

/**
 * Suma horas a tiempo.
 * @param horas
 */

public void sumaHoras(int horas) {
	this.horas += horas;
}

/**
 * Resta horas a tiempo.
 * @param horas
 */

public void restaHoras(int horas) {
	this.horas -= horas;
}

/**
 * Suma minutos a tiempo.
 * @param t2
 * @param minutos
 */

public void sumaMinutos(int minutos) {
	int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos + minutos * 60;
	this.conversor(tiempoTotal);
	
}

/**
 * Resta minutos a tiempo.
 * @param minutos
 */

public void restaMinutos(int minutos) {
	int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos - minutos * 60;
	this.conversor(tiempoTotal);
	
}

/**
 * Suma segundos a tiempo.
 * @param segundos
 */

public void sumaSegundos(int segundos) {
	if (segundos >= 0) {
		int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos + segundos * 60;
		this.conversor(tiempoTotal);
	} else {
		System.out.println("ERROR: Dato erróneo.");
	}
}

/**
 * Resta segundos a tiempo.
 * @param segundos
 */

public void restaSegundos(int segundos) {
	if (segundos >= 0) {
		int tiempoTotal = this.horas * 3600 + this.minutos * 60 + this.segundos - segundos * 60;
		this.conversor(tiempoTotal);
	} else {
		System.out.println("ERROR: Dato erróneo.");
	}
}

}