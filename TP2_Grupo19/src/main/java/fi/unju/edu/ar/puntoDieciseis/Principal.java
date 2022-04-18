package fi.unju.edu.ar.puntoDieciseis;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		System.out.println("Ingrese un numero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		
		CalculoMatematico calc1 = new CalculoMatematico(n);
		
		System.out.println("El resultado de la sumatoria del numero " + n + " es " + calc1.calcularSumatoria() + " y su productoria es : " + calc1.calcularProductoria());
		
	}

}
