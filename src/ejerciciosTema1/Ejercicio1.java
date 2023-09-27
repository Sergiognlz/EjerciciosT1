package ejerciciosTema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
	//Declaramos variable del número decimal
	float numero1;
	//Creamos escaner
	Scanner sc=new Scanner(System.in);
	//Creamos la localización
		sc.useLocale(Locale.US);
	//Pedimos al usuario que introduzca un número 
	System.out.println("Introduce un número con decimales");
	//Leemos el número 
	numero1 =sc.nextFloat();
	//Mostramos el número redondeado
	System.out.println("Tu número redondeado es: "+ (int) (numero1+0.5));
	//cerramos escaner
	sc.close();
}
}
