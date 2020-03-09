package colecciones;
import java.util.Arrays;

public class Carta {

	//Almacenamos las cartas y los palos.
	String[] cartas = {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
	String[]palos = {"Bastos","Espadas","Copas","Oros"};

	private String numero;
	private String tipo;
	
	//Constructor
	public Carta() {
		this.numero = cartas[(int)(Math.random()*10)];
		this.tipo = palos[(int)(Math.random()*4)];
	}
	
	//Getter y setter.
	
	/**
	 * Getter de cartas.
	 * @return cartas
	 */
	public String[] getCartas() {
		return cartas;
	}

	/**
	 * Setter de cartas.
	 * @param cartas 
	 */
	public void setCartas(String[] cartas) {
		this.cartas = cartas;
	}
	/**
	 * Getter de palos.
	 * @return  palos
	 */
	public String[] getPalos() {
		return palos;
	}
	/**
	 * Setter de palos.
	 * @param palos 
	 */
	public void setPalos(String[] palos) {
		this.palos = palos;
	}

	@Override
	public String toString() {
		return numero + " de " + tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cartas);
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + Arrays.hashCode(palos);
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Carta other = (Carta) obj;
		if (!Arrays.equals(cartas, other.cartas))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (!Arrays.equals(palos, other.palos))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
}
