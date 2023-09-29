package ejerciciosTema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	//Declaramos variable del primer número
	float numero1;
	//Declaramos la variable del segundo número
	float numero2;
	//creamos variable resultado
	boolean resultado;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//creamos localización
	sc.useLocale(Locale.US);
	//Pedimos al usuario el primero número
	System.out.println("Introduce un número");
	//leemos el primero número
	numero1=sc.nextFloat();
	//pedimos al usuario el segundo número
	System.out.println("Introduce el segundo número");
	//leemos el segundo número
	numero2=sc.nextFloat();
	//declaramos booleano
	resultado=(numero1==numero2); 
	//mostramos el 
	System.out.println("Ambos número son iguales: " + resultado);
	//cerramos escaner
	sc.close();
	
	
}
}
