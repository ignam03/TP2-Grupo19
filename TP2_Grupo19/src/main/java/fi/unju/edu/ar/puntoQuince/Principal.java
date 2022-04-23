package fi.unju.edu.ar.puntoQuince;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona persona1 = new Persona();
		
		System.out.println("Edad: " + persona1.calcularEdad(23, 05, 1997));
		System.err.println("Signo del zodiaco es :" + persona1.devolverSigno(23, 3, 1997) );
		System.out.println("estacion: " + persona1.calcularEstacion(23, 3, 1997) );
	}

}
