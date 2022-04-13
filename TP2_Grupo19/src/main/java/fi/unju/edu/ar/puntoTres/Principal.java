package fi.unju.edu.ar.puntoTres;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ncondicion = 5;
		int num;

		for (int i = 1; i <= 5; i++) {

			System.out.println("Ingrese un numero entero para determinar si es par: ");
			Scanner teclado = new Scanner(System.in);
			num = teclado.nextInt();

			if (num % 2 == 0) {

				System.out.println("El numero ingresado " + num + " es par");

			} else {

				System.out.println("El numero ingresado " + num + " es impar");
			}
		}

	}

}
