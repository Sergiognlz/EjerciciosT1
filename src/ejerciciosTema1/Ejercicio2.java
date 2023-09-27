package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	//Guardamos la variable del número que vamos a usar
	int  numero1;
	int numero2;
	//Creamos el escaner
	Scanner sc=new Scanner(System.in);
	
	//Pedimos el número al usuario 
	System.out.println("Introduce un número");
	//Leemos el número introducido
	numero1 = sc.nextInt();
	System.out.println("Hay que sumar "+ (numero1%7) + " a " + numero1 + " para que sea múltiplo de 7");
	
	//cerramos escaner
	sc.close();
	
}
}
