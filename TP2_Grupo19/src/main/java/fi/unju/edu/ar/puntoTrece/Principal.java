package fi.unju.edu.ar.puntoTrece;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//objeto con metodo calcularhoras
		Empleado empleado1 = new Empleado();
		empleado1.setHorasTrabajadas(22);
		System.out.println("El sueldo que le corresponde es: " + empleado1.calcularSueldo());
		
		//Objeto con constructor por defecto
		Empleado empleado2 = new Empleado();
		//Objeto con constructor parametrizado1
		Empleado empleado3 = new Empleado("Jose ", 0, 165);
		//Objeto con constructor parametrizado2
		Empleado empleado4 = new Empleado("Luis", null, 135);
		//Objeto con constructor parametrizado2
		Empleado empleado5 = new Empleado("Marcos", 177);
		
		System.out.println(empleado2);
		System.out.println(empleado3.getNombre() + " " + empleado3.getLegajo() + " " + empleado3.getHorasTrabajadas());
		System.out.println(empleado4.getNombre() + " " + empleado4.getFechaIngreso() + " " + empleado4.getHorasTrabajadas() );
		System.out.println(empleado5.getNombre() + " " + empleado5.getHorasTrabajadas());
	}

}
