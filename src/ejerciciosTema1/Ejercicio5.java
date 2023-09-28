package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	//Creamos escaner
	Scanner sc=new Scanner(System.in);
	//Declaramos variables
	double a,b,c,x,y;
	
	//Pedimos el valor a
	System.out.println("Introduce el valor a");
	//leemos el valor a
	a=sc.nextDouble();
	//pedimos el valor b
	System.out.println("Introduce el valor b");
	//leemos el valor b
	b=sc.nextDouble();
	//pedimos el valor c
	System.out.println("Introduce el valor c");
	//leemos el valor c
	c=sc.nextDouble();
	//pedimos le valor x
	System.out.println("Introduce el valor x");
	//leemos el valor x
	x=sc.nextDouble();
	//Una vez tenemos todos los valores declaramos la variable y
	y=(a*x*2)+(b*x)+c;
	//mostramos el resultado del polinomio
	System.out.println("Partiendo del polinomio y=ax2+bx+c el valor y corresponde a: " + y);
	//cerramos escaner
	sc.close();
	
}
}
