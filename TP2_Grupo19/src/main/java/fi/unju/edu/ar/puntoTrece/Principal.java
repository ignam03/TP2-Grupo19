package fi.unju.edu.ar.puntoTrece;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado empleado1 = new Empleado();
		
		empleado1.setHorasTrabajadas(161);
		
		
	
		System.out.println("El sueldo que le corresponde es: " + empleado1.calcularSueldo());
	}

}
