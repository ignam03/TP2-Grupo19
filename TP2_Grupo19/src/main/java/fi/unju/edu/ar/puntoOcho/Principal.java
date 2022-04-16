package fi.unju.edu.ar.puntoOcho;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;

		do {

			if (num % 4 == 0) {
				System.out.println("Los numeros multiplos de 4 son: " + num);
			}

			num++;

		} while (num <= 100);

	}

}
