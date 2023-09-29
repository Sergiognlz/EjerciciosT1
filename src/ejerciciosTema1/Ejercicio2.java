package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
	//Guardamos la variable del número que vamos a usar
	int  numero1;
	//creamos variable del resto
	int resto;
	//creamos constantes
	final int cero=0;
	final int siete=7;
	//Creamos el escaner
	Scanner sc=new Scanner(System.in);
	
	//Pedimos el número al usuario 
	System.out.println("Introduce un número");
	//Leemos el número introducido
	numero1 = sc.nextInt();
	resto= (numero1%7);
	System.out.println("Hay que sumar "+ (resto==cero ? cero:siete-resto )+ " a " + numero1 + " para que sea múltiplo de 7");
	
	//cerramos escaner
	sc.close();
	
}
}
