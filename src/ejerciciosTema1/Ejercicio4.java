package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos la variable base
		float base;
		//Declaramos la variable altura
		float altura;//Creamos escaner
		Scanner sc=new Scanner(System.in);
		//Pedimos la base
		System.out.println("Introduce la base del triángulo");
		//Leemos el número
		base = sc.nextFloat();
		//Pedimos la altura
		System.out.println("Introduce la altura del triángulo");
		//leemos el número
		altura=sc.nextFloat();
		//Declaramos la variable área
		float area = ((base*altura)/2);
		//Mostramos le área del triángulo
		System.out.println("El área del triángulo es " + area);
		//Cerramos escaner.
		sc.close();
		
		
		
		
	}

}
