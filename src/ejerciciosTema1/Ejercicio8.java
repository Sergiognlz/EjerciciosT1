package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//declaramos variable para la entrada de los adultos
		int nEntradaAdulto;
		//declaramos variable para la entrada de los niños
		int nEntradaInfantil;
		//declaramos constantes de la entrada de los adultos y los niños
		final float ENTRADA_ADULTO=20;
		final float ENTRADA_INFANTIL=15.50f;
		final int CIEN=100;
		final float CERO_COMA_CERO_CINCO=0.05f;
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
		float precioTotal=(nEntradaAdulto*ENTRADA_ADULTO)+(nEntradaInfantil*ENTRADA_INFANTIL);
		//Creamos una ternaria y lo aplicamos al computo total en euros
		System.out.println("El precio total de " + nEntradaAdulto + " entradas de adulto "
				+ "y " + nEntradaInfantil + " entradas de niño son " + 
				(precioTotal<CIEN ? precioTotal:precioTotal-(precioTotal*CERO_COMA_CERO_CINCO))+" euros en total.");
		//cerramos el escaner
		sc.close();
		
		
	}

}
