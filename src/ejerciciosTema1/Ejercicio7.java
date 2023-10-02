package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	//declaro variable mm
	int mm;
	//declaro variable cm
	int cm;
	//declaro variable m
	int m;
	//creo variable distancia total
	double distanciaTotal;
	//creo constantes
	final int DIEZ= 10;
	final int CIEN=100;
	//creo escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario mm
	System.out.println("Introduce los mm");
	//leemos mm
	mm=sc.nextInt();
	//pedimos al usuario cm
	System.out.println("Introduce los cm");
	//leemos los cm
	cm=sc.nextInt();
	//pedimos los m
	System.out.println("Introduce los m");
	//leemos los m
	m=sc.nextInt();
	
	distanciaTotal=cm+(mm/DIEZ)+(m*CIEN);
	//mostramos la suma de las medias en cm
	System.out.println("La distancia total es: " + distanciaTotal + " centímetros");
	
	//cerramos escaner
	sc.close();
	
}
}
