package AgendaDeContactos;

/**
 * Una agenda está formada por una colección de de contactos, que a su vez son
 * objetos de la clase Contacto. 
 * Esta clase: 
 * • Tiene tres constructores: 
 * 	◦ El primero recibe un nombre y un teléfono.
 * 	◦ El segundo los datos anteriores y además una dirección.
 * 	◦ El tercero los datos anteriores y además un correo electrónico. 
 * 	◦ Los datos los validamos mediante expresiones regulares, si alguno es inválido lanzamos una excepción.
 * • Tiene getters para obtener el nombre, teléfono, dirección y correo electrónico.
 * • Tiene setters para asignar teléfono, dirección y correo electrónico. En caso de datos no válidos lanza una excepción.
 * 
 * Un contacto está definido por:
 * • Nombre. Será válido cuando esté compuesto por letras y espacios (solo en medio) y no haya otro con el mismo nombre.
 * • Teléfono. Será válido si está compuesto por nueve dígitos, el primero empieza por 6, 7 ó 9.
 * • Dirección. No se valida, puede estar vacía.
 * • Correo electrónico. Si existe hay que validarlo.
 * 
 * Ten en cuenta de que en ninguna de estas clases se interactúa con el usuario.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

public class Contacto {

  // Atributos
  private String nombre;
  private String telefono;
  private String direccion;
  private String correoElectronico;

  /**
   * Primer constructor.
   * @param nombre
   * @param telefono
   * @throws FormatoIntroducidoException 
   */
  public Contacto(String nombre, String telefono) throws FormatoIntroducidoException {	
    setNombre(nombre);
    setTelefono(telefono);
  }

  /**
   * Segundo constructor.
   * @param nombre
   * @param telefono
   * @param direccion
   * @throws FormatoIntroducidoException
   */
  public Contacto(String nombre, String telefono, String direccion) throws FormatoIntroducidoException {	
   setNombre(nombre);
   setTelefono(telefono);
   setDireccion(direccion);
  }
	
  /**
   * Tercer constructor.
   * @param nombre
   * @param telefono
   * @param direccion
   * @param correoElectronico
   * @throws FormatoIntroducidoException
   */
  public Contacto(String nombre, String telefono, String direccion, String correoElectronico) throws FormatoIntroducidoException {
   setNombre(nombre);
   setTelefono(telefono);
   setDireccion(direccion);
   setCorreoElectronico(correoElectronico);
 }

  /**
   * Salida formateada de los contactos.
   */
  @Override
  public String toString() {
    return "---------------------------" + "\n" + "NOMBRE DEL CONTACTO: " + nombre + "\n" + "TELÉFONO: " + telefono
     + "\n" + "DIRECCIÓN: " + direccion + "\n" + "CORREO ELECTRÓNICO: " + correoElectronico + "\n";
  }

  // Getters y setters
  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   * @throws FormatoIntroducidoException
   */
  public void setNombre(String nombre) throws FormatoIntroducidoException {
    if (!nombre.matches("^[a-zA-Z-_' ']{1,100}$"))
      throw new FormatoIntroducidoException("Nombre inválido (contiene caracteres que no son letras y espacios)");
    this.nombre = nombre;
  }

  /**
   * @return the telefono
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * @param telefono the telefono to set
   * @throws FormatoIntroducidoException
   */
  public void setTelefono(String telefono) throws FormatoIntroducidoException {
    if (!telefono.matches("^[6-7|9]{1}[0-9]{8}$"))
      throw new FormatoIntroducidoException("Formato de teléfono incorrecto. Debe tener 9 dígitos y empezar por 6,7 y 9.");
    this.telefono = telefono;
  }

  /**
   * @return the direccion
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * @param direccion the direccion to set
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  /**
   * @return the correoElectronico
   */
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  /**
   * @param correoElectronico the correoElectronico to set
   * @throws FormatoIntroducidoException
   */
  public void setCorreoElectronico(String correoElectronico) throws FormatoIntroducidoException {
    if (!correoElectronico.matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}"))
      throw new FormatoIntroducidoException("Formato de correo electrónico inválido. No contiene una @ y un dominio con su extensión.");
    this.correoElectronico = correoElectronico;
 }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
    Contacto other = (Contacto) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    return true;
  }

}
