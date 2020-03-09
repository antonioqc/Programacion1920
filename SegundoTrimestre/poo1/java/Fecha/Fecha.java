package poo1.Fecha;

/**
 * Implementamos la clase fecha basándonos en:
 * ----------------------------------------------- colección de métodos
 * orientados a objetos para manejar fechas en cadenas de caracteres. el formato
 * de la cadena es: aaaammdd. ejemplo: el 15 de diciembre de 2019 sería:
 * "20191215" colección de funciones: 1. fecha_correcta: dice si la fecha que se
 * pasa como parámetro es correcta. 2. fecha_mas_1dia: suma un día a la fecha
 * que se pasa como parámetro y lo devuelve. 3. fecha_mas_ndias: suma una serie
 * de días a la fecha que se pasa como parámetro y lo devuelve. 4.
 * fecha_menos_1dia: resta un día a la fecha que se pasa como parámetro y lo
 * devuelve. 5. fecha_menos_ndias: resta una serie de días a la fecha que se
 * pasa como parámetro y lo devuelve. 6. es_bisiesto: dice si la fecha que se
 * pasa como parámetro es bisiesto. 7. compara_fechas: recibe dos fechas y
 * devuelve un valor negativo si la 1ª es anterior a la segunda, cero si son
 * iguales, y un valor positivo si la 1ª es posterior a la segunda. 8.
 * fecha_formateada: recibe un fecha y devuelve una cadena con el formato: dd de
 * {mes} de aaaa (ejemplo: "15 de diciembre de 2019") 9. año, mes, dia,
 * nombre_mes: recibe un fecha y devuelve esos valores.
 * 
 * @author antonio
 *
 */

public class Fecha implements Comparable<Fecha> {

	// Atributos.
	private int dia;
	private int mes;
	private int anyo;

	// Métodos.

	/**
	 * Método constructor de la clase.
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 */

	public Fecha(int dia, int mes, int anyo) {
		assert esCorrecta(dia, mes, anyo) : "La fecha introducida no es correcta.";
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	/**
	 * Getter de día.
	 * 
	 * @return dia
	 */

	public int getDia() {
		return dia;
	}

	/**
	 * Setter de dia.
	 * 
	 * @param dia
	 */

	public void setDia(int dia) {
		assert esCorrecta(dia, this.mes, this.anyo) : "Día incorrecto.";
		this.dia = dia;
	}

	/**
	 * Getter de mes
	 * 
	 * @return mes
	 */

	public int getMes() {
		return mes;
	}

	/**
	 * Setter de mes.
	 * 
	 * @param mes
	 */

	public void setMes(int mes) {
		assert esCorrecta(this.dia, mes, this.anyo) : "Mes incorrecto.";
		this.mes = mes;
	}

	/**
	 * Getter de año.
	 * 
	 * @return anyo
	 */

	public int getAnyo() {
		return anyo;
	}

	/**
	 * Setter de año
	 * 
	 * @param anyo
	 */

	public void setAnyo(int anyo) {
		assert esCorrecta(this.dia, this.mes, anyo) : "Año incorrecto.";
		this.anyo = anyo;
	}

	/**
	 * Suma 1 dia a la fecha almacenada.
	 * 
	 * @return Fecha en formato dia,mes,año.
	 */

	public String suma1Dia() {
		int dia = this.dia + 1;
		int mes = this.mes;
		int anyo = this.anyo;

		if (dia > diasMes(mes, anyo)) {
			// mes siguiente
			dia = 1;
			mes += 1;
			if (mes > 12) { // nos pasamos a diciembre, año siguiente.
				mes = 1;
				anyo += 1;
			}

		}
		return (+dia + " de " + nombreMes() + " de " + anyo);
	}

	/**
	 * Resta 1 dia a la fecha.
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @return Fecha en formato dia,mes,año.
	 */

	public String resta1Dia() {
		int dia = this.dia - 1;
		int mes = this.mes;
		int anyo = this.anyo;

		if (dia == 0) {
			// mes siguiente
			mes -= 1;
			if (mes == 0) { // nos pasamos a diciembre, año siguiente.
				mes = 12;
				anyo -= 1;
			}
			dia = Fecha.diasMes(mes, anyo);
		}
		return (+dia + " de " + nombreMes() + " de " + anyo);
	}

	/**
	 * Almacenamos en un array los meses del año.
	 * 
	 * @return Un mes
	 */

	public String nombreMes() {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		return meses[this.mes - 1];
	}

	/**
	 * 
	 * @return Devuelve una copia.
	 */

	public Fecha clona() {
		return new Fecha(this.dia, this.mes, this.anyo);
	}

	@Override
	public String toString() {
		return dia + " de " + nombreMes() + " de " + anyo;
	}

//	public String añadir(int n) {
//		f = this.clona();
//		if (n > 0) {
//			for(int i=0; i>=n; i++) {
//				f = f.suma1Dia();
//			}
//		}else {
//			
//		}
//	}

	/**
	 * Devuelve verdadero si la fecha es mayor que la otra fecha
	 * 
	 * @param f2
	 * @return true or false
	 */

	public boolean mayorQue(Fecha f2) {
		if (this.anyo != f2.anyo) {
			return this.anyo > f2.anyo;
		} else if (this.mes != f2.mes) {
			return this.mes > f2.mes;
		} else {
			return this.dia > f2.dia;
		}
	}

	/**
	 * Devuelve verdadero si la fecha es menor que la otra fecha
	 * 
	 * @param f2
	 * @return true or false
	 */

	public boolean menorQue(Fecha f2) {
		if (this.anyo != f2.anyo) {
			return this.anyo < f2.anyo;
		} else if (this.mes != f2.mes) {
			return this.mes < f2.mes;
		} else {
			return this.dia < f2.dia;
		}
	}

	/**
	 * Devuelve verdadero si la fecha(f1) es mayor que la fecha(f2)
	 * 
	 * @param f2
	 * @return true or false
	 */

	public boolean mayorIgual(Fecha f2) {
		if (this.anyo != f2.anyo) {
			return this.anyo >= f2.anyo;
		} else if (this.mes != f2.mes) {
			return this.mes >= f2.mes;
		} else {
			return this.dia >= f2.dia;
		}
	}

	/**
	 * Devuelve verdadero si ambas fechas son iguales.
	 * 
	 * @param obj
	 * @return true or false
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anyo != other.anyo)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	/**
	 * Devuelve verdadero si el año es bisiesto.
	 * 
	 * @param anyo
	 * @return true or false.
	 */

	public static boolean esBisiesto(int anyo) {
		return anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0);
	}

	/**
	 * Devuelve verdadero si la fecha es correcta.
	 * 
	 * @param dia
	 * @param mes
	 * @param anyo
	 * @return esCorrecta
	 */

	public static boolean esCorrecta(int dia, int mes, int anyo) {
		if (anyo < 0) { // año correcto.
			return false;
		}
		if (mes < 1 || mes > 12) { // mes correcto.
			return false;
		}
		return dia > 0 && dia <= diasMes(mes, anyo); // dia correcto.
	}

	/**
	 * 
	 * @param mes
	 * @param anyo
	 * @return Días del mes actual.
	 */

	public static int diasMes(int mes, int anyo) {
		// almacenamos en un array los días del año.
		int[] diasMes_ = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (Fecha.esBisiesto(anyo)) { // comprobamos el dia correcto contando el año bisiesto.
			diasMes_[1] = 29;
		}
		return diasMes_[mes - 1];
	}

	/**
	 * Comparamos fechas.
	 */

	@Override
	public int compareTo(Fecha f2) {
		return 0;
	}

}
