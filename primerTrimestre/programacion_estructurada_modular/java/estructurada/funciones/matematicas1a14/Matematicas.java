package estructurada.funciones.matematicas1a14;

/**
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * 
 * @author Antonio Quesada
 * @version 1.8
 * 
 */

public class Matematicas {

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
   * en caso contrario.
   * 
   * @param num
   * @return true; si el número se lee igual empezando por la derecha que por la
   *         izquierda.
   */

  public static boolean esCapicua(int num) {
    int cifra;
    int inverso = 0;
    int numAux;
    numAux = num;

    while (num != 0) {
      cifra = num % 10;
      inverso = cifra + inverso * 10;
      num /= 10;
    }
    
    return numAux == inverso;
//    if (numAux == inverso) {
//      return true;
//    } else {
//      return false;
//    }
  }


  /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * 
   * @param n
   * @return true; si el numero es primo.
   */

  public static boolean esPrimo(int num) {
    int restosNoNulos = 0;
    for (int divisor = 2; divisor < num; divisor++) {
      if (num % divisor != 0) {
        restosNoNulos++;
      }
    }
    return (restosNoNulos == num - 2);
//    if (restosNoNulos == num-2) {
//      return true;
//    }else {
//        return false;
//    }

  }

  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param num
   * @return num; numero primo siguiente.
   */

  public static int siguientePrimo(int num) {
    int candidato = num+1;  //candidato a primo siguiente
    
    //proceso para encontrar el primo siguiente.
    while (! esPrimo(candidato)) {
      candidato++;
    }

    return candidato;
  }

  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * @param base
   * @param exponente
   * @return potencia
   */

  public static int potencia(int base, int exponente) {
    int potencia = 1;

    if (exponente < 0) {
      System.out.println("El exponente tiene que ser positivo.");
    } else {
      for (int i = 1; i < exponente + 1; i++) {
        potencia = potencia * base;
      }
    }
    return potencia;

  }

  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * @param num
   * @return num; numero de digitos.
   */

  public static int digitos(int num) {

    int cifras = 0;

    while (num != 0) {
      num = num / 10;
      cifras++;
    }

    return cifras;
  }

  /**
   * Le da la vuelta a un número.
   * 
   * @param num
   * @return voltea
   */

  public static int voltea(int num) {
    int cifra = 0;
    int inverso = 0;
    while (num != 0) {
      cifra = num % 10;
      inverso = cifra + inverso * 10;
      num /= 10;
    }

    return inverso;
  }

  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se empieza
   * contando por el 0 y de izquierda a derecha.
   * 
   * @param num
   * @return digitoN
   */

  public static char digitoN (int num) {
    String numCadena = String.valueOf(num);
    int posN = 4;
    char digito = numCadena.charAt(posN-1);
    return digito;
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1
   * @param num
   * @return devuelve la posición de la primera ocurrencia.
   */
  
  public static int posicionDeDigito (int num, int digito) {
    for(int i=0;i<digitos(num);i++) {
      if(digito == digitoN(num)) {
        return num;
      }
    }
    return -1;
  }
  
  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * @param num
   * @return quita un numero por la derecha.
   */
  
  public static String quitaPorDetras (int num) {
    String numCadena = String.valueOf(num);
    int cifra = num%10;
    
    return numCadena.substring(0, cifra-1);
  }
  
  /**
   * Le quita a un número n dígitos por delante (por la 
   * izquierda).
   * @param num
   * @return quitaPorDelante
   */
  
  public static String quitaPorDelante (int num) {
    String numCadena = String.valueOf(num);
    String quitarNum = numCadena.substring(0,1);
    String reemplazado=numCadena.replace(quitarNum,"");
    return reemplazado;
  }
  
  /**
   * Añade un dígito a un número por detrás.
   * @param num
   * @return pegaPorDetras
   */
  
  public static String pegaPorDetras (int num1, int num2) {
    String num1Cadena = String.valueOf(num1);
    String num2Cadena = String.valueOf(num2);
    
      return num1Cadena.concat(num2Cadena);
  }
  
  /**
   * Añade un dígito a un número por delante.
   * @param num1
   * @param num2
   * @return pegaPorDelante
   */
  
  public static String pegaPorDelante (int num1, int num2) {
    String num1Cadena = String.valueOf(num1);
    String num2Cadena = String.valueOf(num2);
    
      return num2Cadena.concat(num1Cadena);
  }
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y 
   * devuelve el trozo correspondiente.
   * @param num1
   * @param num2
   * @return trozoDeNumero; numInicial y final y devolver el trozo.
   */
  
  public static String trozoDeNumero (int num) {
     String numCadena = String.valueOf(num); //paso numero a cadena.
     String posInicial = numCadena.substring(0,1); //posicion inicial del numero.
     int posFinal = num%10;  //posicion final del numero y convertido a cadena.
     String posFinalCadena = String.valueOf(posFinal);
     
     return posInicial.concat(posFinalCadena);
  } 
  
  /**
   * Pega dos números para formar uno.
   * @param num1
   * @param num2
   * @return juntaNumeros; concatenación
   */
  
  public static String juntaNumeros (int num1, int num2) {
    String num1Cadena = String.valueOf(num1);
    String num2Cadena = String.valueOf(num2);
    
   return num1Cadena.concat(num2Cadena);
  }
}