package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//declaramos variable para la entrada de los adultos
		int nEntradaAdulto;
		//declaramos variable para la entrada de los niños
		int nEntradaInfantil;
		//declaramos constantes de la entrada de los adultos y los niños
		final float entradaAdulto=20;
		final float entradaInfantil=15.50f;
		final int cien=100;
		final float cerocomacerocinco=0.05f;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//Pedimos al usuario el número de entradas de adultos
		System.out.println("Introduce el número de entradas de Adulto");
		//leemos el número
		nEntradaAdulto=sc.nextInt();
		//pedimos al usuario el número de entradas de adultos
		System.out.println("Introduce el número de entradas de niño");
		//leemos el número
		nEntradaInfantil=sc.nextInt();
		//creamos la variable precio total
		float precioTotal=(nEntradaAdulto*entradaAdulto)+(nEntradaInfantil*entradaInfantil);
		//Creamos una ternaria y lo aplicamos al computo total en euros
		System.out.println("El precio total de " + nEntradaAdulto + " entradas de adulto "
				+ "y " + nEntradaInfantil + " entradas de niño son " + 
				(precioTotal<cien ? precioTotal:precioTotal-(precioTotal*cerocomacerocinco))+" euros en total.");
		//cerramos el escaner
		sc.close();
		
		
	}

}
