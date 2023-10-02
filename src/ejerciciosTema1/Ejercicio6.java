package ejerciciosTema1;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	//declaramos variables segundos
	int segundos;
	//declaramos la variable horas
	int horas;
	//declaramos la variable minutos
	int minutos;
	//declaramos la variable segundos sobrantes
	int segundosSobrantes;
	//declaramos la variable resto
	int resto;
	//declaro constantes
	final int TRES_MIL_SEISCIENTOS = 3600;
	final int SESENTA = 60;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//Pedimos que el usuario introduzca los segundos
	System.out.println("Introduce el número de segundos");
	//leemos los segundos
	segundos = sc.nextInt();
	//declaramos equivalencias
	horas=(segundos/TRES_MIL_SEISCIENTOS);
	resto=(segundos%TRES_MIL_SEISCIENTOS);
	minutos=resto/SESENTA;
	segundosSobrantes= 	resto%SESENTA;
	//mostramos el número de horas, minutos y segundos que hay en los segundos introducidos
	System.out.println("Hay " + horas + " horas , " + minutos + " minutos y " + segundosSobrantes + 
			" segundos es el número de segundos que has introducido");
	//cerramos escaner
	sc.close();
	
}
}
