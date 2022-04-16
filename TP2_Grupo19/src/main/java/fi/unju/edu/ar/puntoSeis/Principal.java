package fi.unju.edu.ar.puntoSeis;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int nNota;

		System.out.println("Ingrese numero de nota");
		Scanner teclado = new Scanner(System.in);
		nNota = teclado.nextInt();

		if (nNota > 0) {
			while (nNota >= 1 && nNota <= 10) {
				
				if (nNota == 6) {
					
					System.out.println("Alumno regulariza");
					
				} else {
					
					if (nNota >= 7 && nNota <= 10) {
						System.out.println("El alumno promociona");
						
					} else {
						
						if (nNota < 6 && nNota >= 1) {
							System.out.println("El alumno desaprueba");
							
						}
					}
				}

				System.out.println("Ingrese numero de nota");
				nNota = teclado.nextInt();

			}
		}

		System.out.println("Valor no permitido");
		
	}

}
