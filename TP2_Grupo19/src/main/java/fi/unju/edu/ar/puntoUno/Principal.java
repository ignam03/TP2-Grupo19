package fi.unju.edu.ar.puntoUno;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero para el factorial");
		int numero ;
		int factorial = 1;
		numero = teclado.nextInt();
		
		
		if(numero < 10) {
			for(int i = 1; i <= numero; i++) {
				factorial *= i;
				
			}
			System.out.println("El factorial del numero " + numero + " es " + factorial);
		}
	}

}
