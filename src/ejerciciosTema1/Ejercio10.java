package ejerciciosTema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercio10 {
public static void main(String[] args) {
	//Declaramos la variable longitud
	float longitud;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	//creamos la localización
	sc.useLocale(Locale.US);
	//creamos constantes
	final float cien=100;
	
	//Pedimos al usuario la longitud
	System.out.println("Introduce la longitud de lanzamiento en metros");
	//leemos el número introducido
	longitud=sc.nextFloat();
	//declaramos variable 
	float resultado=(longitud*cien);
	//mostramos por consola el cambio de unidad de metros a centímetros y casteamos a tipo int.
	System.out.println("El resultado es: " + (int)resultado + " cm.");
	//cerramos escanner
	sc.close();
}
}
