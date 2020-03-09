package poo2.Circulo;
import javax.swing.*; //Usamos la clase JOptionPane. Muestra en una ventana gráfica el mensaje de error.

/**
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 *	Un círculo puede crecer. Aumenta su radio.
 *	Un círculo puede menguar. Decrementa su radio.
 *	Un círculo me devuelve su área si se la pido.
 *	Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. Ocupo un área de 0.7853981633974483 metros cuadrados” (método toString())
 * @author antonio
 *
 */

public class Circulo {
	
	//Atributos.
	private double radio;
	private double area;
	
	//Métodos.
	
	/**
	 * Método constructor de la clase.
	 * @param r
	 */
	
	public Circulo(double r) {
		this.radio = r;
	}

	/**
	 * Getter del radio.
	 * @return radio
	 */
	
	public double getRadio() {
		return radio;
	}
	
	/**
	 * Setter del radio.
	 * @param radio
	 */

	public void setRadio(double radio) {
			this.radio = radio;
	}
	
	/**
	 * Cálculo del area del circulo.
	 * @return area
	 */
	
	public double getArea() {
		return (Math.PI*(Math.pow(this.radio, 2)));
	}

	/**
	 * Setter del area.
	 * @param area
	 */
	
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * Crece el radio del círculo.
	 * @param r2
	 * @return longitud del radio del círculo 1 mas la longitud del radio del círculo 2.
	 */
	
	public double creceRadio(double r2) {
		if (this.radio < 0) {	
			System.out.println("El radio no puede ser negativo.");
		}else if (radio == 0) {
			JOptionPane.showMessageDialog(null,"Soy un mísero punto sin área");
		} else {
		
		}
		return this.radio = radio+r2;
	}
	
	/**
	 * Decrece el radio del círculo.
	 * @param r2
	 * @return longitud del radio del círculo 1 menos la longitud del radio del círculo 2.
	 */
	
	public double decrementaRadio(double r2) {
		if (this.radio < 0) {	
			System.out.println("El radio no puede ser negativo.");
		}else if (radio == 0) {
			JOptionPane.showMessageDialog(null,"Soy un mísero punto sin área");
		} else {
		
		}
		return this.radio = radio-r2;
	}
	
	
	@Override
	public String toString() {
		return "Soy un círculo de radio " +getRadio()+ " metros. Ocupo un área de "+getArea()+ " metros cuadrados.";
	}
	
}