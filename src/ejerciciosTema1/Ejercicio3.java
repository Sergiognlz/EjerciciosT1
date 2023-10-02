package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Guardamos la variable del número que vamos a usar
		int  numero1;
		int numero2;
		int resto;
		//creamos la constante 0
		final int CERO=0;
		//Creamos el escaner
		Scanner sc=new Scanner(System.in);
		//Pedimos el número al usuario 
		System.out.println("Introduce un número");
		//Leemos el número introducido
		numero1 = sc.nextInt();
		//Pedimos el segundo número
		System.out.println("Introduce segundo número");
		//Leemos el segundo número
		numero2 = sc.nextInt();
		//Declaramos resto
		resto= (numero1%numero2);
		System.out.println("Hay que sumar "+ (resto==CERO ? CERO:numero2-resto )+ " a " + numero1 + " para que sea múltiplo de 7");
		//cerramos escaner
		sc.close();
		
	}
	}
