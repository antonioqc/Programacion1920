/**Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 *
 * @author Antonio Quesada
 */

public class Ej8rep {
  public static void main(String[] args) {
    
    //Inicializamos las variables a 0.
    int segundos = 0;
    int minutos = 0;
    int horas = 0;
    
    while(true) {
        
        //Incrementar segundos.
      if(segundos!=59) {
        segundos++;
        
        //Incrementamos los minutos cada 60 segundos
      }else if(minutos!=59) {
          minutos++;
          segundos = 0;
         
          //Ponemos los segundos a 0 e incrementamos las horas cada 60 minutos.
        }else{
          horas++;
          minutos = 0; //Ponemos a 0 los minutos y asi sucesivamente.
        }
      }
      
    //Mostramos el cronómetro
      System.out.println(horas+":"+minutos+":"+segundos);
   
  }
}

