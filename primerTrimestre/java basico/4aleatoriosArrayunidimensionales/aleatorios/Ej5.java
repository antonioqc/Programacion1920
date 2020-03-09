/**Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Muestra también el máximo, el mínimo, la moda, la media, la mediana y la desviación típica de esos números.
 * 
 * @author Antonio Quesada
 */

package aleatorios;

public class Ej5 {
  public static void main(String[] args) {
    
    int[] numero = new int[50];
    double minimo = Double.MAX_VALUE;
    double maximo = -Double.MIN_VALUE;
    double sumaNumeros = 0;
    double media = 0;
    double varianza;
    double desvTipica;
    double moda = 0;
    int mediana = 0;
    int maximaRepite = 0;
    int i;
    int j;
    int k;
    int l;
    
    //Numero aleatorio entre 100 y 199 para 50 numeros aleatorios.
    System.out.println("A continuación se muestran los números aleatorios:");
    for (i = 0; i<50; i++) {
     System.out.println(numero[i] = (int) Math.floor(Math.random()*(199-100+1)+100));
     
    //Proceso. Notas máximas y minimas.
     //La nota máxima.
     if (numero[i] > maximo) {
         maximo = numero[i];
     }
     
    //La nota mínima.
     if (numero[i] < minimo) { 
         minimo = numero[i];
     }
     
     //Calculamos la media de todos las numeros.
     sumaNumeros += numero[i]; //Sumatorio de todos los numeros.
     media = sumaNumeros/i; //Dividimos el sumatorio de los numeros aleatorios entre el numero de números aleatorios que hay.

    }
    
  //Proceso. Varianza para calcular la desviación típica. 
    for(j=0; j<50; j++) {
      
      //Sumatorio de la diferencia de cada numero menos la media al cuadrado dividido por el número de números aleatorios.
      sumaNumeros += Math.pow((numero[j]-media), 2);
    }
    
    varianza = sumaNumeros/j;
    
    //Desviación Típica = raiz cuadrada de la varianza.
    desvTipica = Math.sqrt(varianza);
    
    //Calculamos la moda. Número que más se repite en el array.
    for(k=0; k<50; k++){
      int repite = 0;
      for(l=0; l<50; l++){
        if(numero[k] == numero[l]) {
          repite++;
        }
      } //Comparamos las veces que se repite el número.
      
      if(repite > maximaRepite){
        moda = numero[k];
        maximaRepite = repite;
      }
   }
    
    //Calculamos la mediana.
    //Buscamos el numero que se encuentra en la posición central de los 50 números.
    for(i = 1; i < 50; i++){
      for(j = 0; j < 50 - i; j++){
        if(numero[j] > numero[j + 1]){
            mediana = numero[j];
            numero[j] = numero[j + 1];
            numero[j + 1] = mediana;
      }
    } 
  }  
    
    //Mostramos los resultados.
    System.out.println("---------------------------------------------------");
    System.out.println("El número máximo de todos los números es un " + maximo);
    System.out.println("El número mínimo de todos los números es un " + minimo);
    System.out.println("La moda de todos los números es "+moda+ ". Se repite "+maximaRepite+" veces.");
    System.out.println("La media de todos los numeros es " +media);
    System.out.println("La mediana de todos los numeros es " +mediana);
    System.out.println("La desviación típica de todos los numeros es " +desvTipica);
  }
  
  }
      
