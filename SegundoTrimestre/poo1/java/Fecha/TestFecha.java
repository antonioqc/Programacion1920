package poo1.Fecha;

public class TestFecha {
	public static void main(String[] args) {
		
		Fecha f1 = new Fecha(10,2,2020);
		Fecha f2 = new Fecha(29,2,2020);
		Fecha f3 = f1.clona();
		
		System.out.println("Fecha 1: "+f1);
		System.out.println("Fecha 2: "+f2);
		System.out.println("Fecha 3: "+f3);
		System.out.println("------------------------------------------------");
		
		System.out.println("¿Es correcta la fecha 10,2,2020?");
		System.out.println(f1.esCorrecta(10,2,2020));
		System.out.println("¿Es correcta la fecha 290,20,20200?");
		System.out.println(f2.esCorrecta(290,20,20200));
		System.out.println("------------------------------------------------");
		
		System.out.println("¿Es bisiesto el año 2020?");
		System.out.println(f1.esBisiesto(2020));
		System.out.println("¿Es bisiesto el año 2019?");
		System.out.println(f1.esBisiesto(2019));
		System.out.println("------------------------------------------------");
		
		System.out.println("¿Son iguales la fecha 1 y 2?");
		System.out.println(f1.equals(f2));
		System.out.println("¿Son iguales la fecha 1 y 3?");
		System.out.println(f1.equals(f3));
		System.out.println("------------------------------------------------");
		
		System.out.println("¿La fecha 1 es mayor que la 2?");
		System.out.println(f1.mayorQue(f2));
		System.out.println("¿La fecha 1 es mayor o igual que la 2?");
		System.out.println(f1.mayorIgual(f2));
		System.out.println("¿La fecha 2 es menor que la 1?");
		System.out.println(f1.menorQue(f2));
		System.out.println("------------------------------------------------");
		
		System.out.println("Suma 1 dia a la fecha 1:");
		System.out.println(f1.suma1Dia());
		System.out.println("Resta 1 dia a la fecha 2:");
		System.out.println(f2.resta1Dia());
		
	}
}
