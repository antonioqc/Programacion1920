package estructurada.funciones.matematicas1a14;

import estructurada.funciones.matematicas1a14.Matematicas;

/**
 * Test de la Clase Matematicas.
 * 
 * @author Antonio Quesada
 * @version 1.8
 *
 */

public class Testmatematicas {
  public static void main(String[] args) {
    
    //Capicua.
     System.out.println("¿El número 101 es capicua? "+Matematicas.esCapicua(101));
     System.out.println("¿El número 123 es capicua? "+Matematicas.esCapicua(123));
     
    //Primos.
     System.out.println("¿El número 73 es primo? "+Matematicas.esPrimo(73));
     System.out.println("¿El número 100 es primo? "+Matematicas.esPrimo(100));
     
    //SiguientePrimo.
    System.out.println("El siguiente primo mayor a 5 es " +Matematicas.siguientePrimo(5));
    
    //Potencia.
    System.out.println("La potencia de 2 elevado a 4 es "+Matematicas.potencia(2, 4));
    
    //Digitos.
    System.out.println("El numero 1234 tiene "+Matematicas.digitos(1234)+" digitos.");
    
    //Voltea.
    System.out.println("El volteo de 1234 es "+Matematicas.voltea(1234));
    
    //DigitoN.
    System.out.println("El digito que se encuentra en la posicion 4 de 123456 es "+Matematicas.digitoN(123456));
    
    //posicionDeDigito.
    System.out.println(Matematicas.posicionDeDigito(1234, 2));
    
    //quitaPorDetras
    System.out.println("El numero 12345 si le quitas 1 digito por la derecha es "+Matematicas.quitaPorDetras(12345));
    
    //quitaPorDelante
    System.out.println("El numero 12345 si le quitas 1 digito por la izquierda es "+Matematicas.quitaPorDelante(12345));
    
   //pegaPorDetras
    System.out.println("El numero 12, con el 5 pegado por detrás es "+Matematicas.pegaPorDetras(12, 5));
   
   //pegaPorDelante
    System.out.println("El numero 13, con el 5 pegado por delante es "+Matematicas.pegaPorDelante(13, 5));
    
   //trozoDeNumero.
    System.out.println("Del numero 3175, si juntamos el primer digito y el ultimo forma "+Matematicas.trozoDeNumero(3175));
    
   //juntaNumeros.
    System.out.println("El numero 10 y 20 si los juntas forman "+Matematicas.juntaNumeros(10, 20));
    
  }

}
