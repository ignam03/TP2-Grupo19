package fi.unju.edu.ar.puntoDoce;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int h;

		System.out.println("Ingrese altura: ");
		Scanner teclado = new Scanner(System.in);
		h = teclado.nextInt();

		double resultado = Math.sqrt(2 * h / 9.81);

		System.out.println("El objeto tarda en caer: " + resultado);

	}

}
