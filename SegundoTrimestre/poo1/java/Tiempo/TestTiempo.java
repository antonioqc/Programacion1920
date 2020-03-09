package poo1.Tiempo;

public class TestTiempo {

	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(1,20,30);
		Tiempo t2 = new Tiempo(2,10,50);
		
		//Mostramos tiempo 1.
		System.out.println("Tiempo 1: "+t1);
		System.out.println("Tiempo 2: "+t2);
		System.out.println("---------------------------");
		
		//Sumamos tiempo 1 al 2.
		System.out.println("Sumamos tiempo 1 a 2:");
		t1.sumaTiempo(t2);
		System.out.println(t1);
		
		//Restamos tiempo 1 al 2.
		System.out.println("Restamos tiempo 1 a 2:");
		t1.restaTiempo(t2);
		System.out.println(t1);
		System.out.println("---------------------------");
		
		//Sumamos horas.
		System.out.println("Suma 3 horas a tiempo 1:");
		t1.sumaHoras(3);
		System.out.println(t1);
		
		//Restamos horas.
		System.out.println("Resta 3 horas a tiempo 1:");
		t1.restaHoras(3);
		System.out.println(t1);
		System.out.println("---------------------------");
			
		//Suma minutos.
		System.out.println("Suma 30 minutos a tiempo 1:");
		t1.sumaMinutos(30);
		System.out.println(t1);
		
		//Resta minutos.
		System.out.println("Resta 30 minutos a tiempo 1:");
		t1.restaMinutos(30);
		System.out.println(t1);
		System.out.println("---------------------------");
		
		//Suma segundos.
		System.out.println("Suma 40 segundos a tiempo 1:");
		t1.sumaSegundos(40);
		System.out.println(t1);
		
		//Resta segundos.
		System.out.println("Resta 40 segundos a tiempo 1:");
		t1.restaSegundos(40);
		System.out.println(t1);
		
	}

}
