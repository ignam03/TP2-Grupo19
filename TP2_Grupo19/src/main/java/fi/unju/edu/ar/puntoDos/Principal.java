package fi.unju.edu.ar.puntoDos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int year;
		
		System.out.println("Ingrese un año: ");
		Scanner teclado = new Scanner(System.in);
		year = teclado.nextInt();
		

		if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)) {
			
			System.out.println("El " + year + " es bisiesto");
			
		} else {
			
			System.out.println("El " + year + " NO es bisiesto");
		}

	}

}
