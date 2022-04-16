package fi.unju.edu.ar.puntoTrece;

import java.sql.Date;
import java.util.Calendar;

public class Empleado {

	private String nombre;
	private Calendar fechaIngreso;
	private int legajo;
	private String email;
	private int sueldo;
	private int horasTrabajadas;

	public Empleado() {
		super();
	}


	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
		
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int calcularSueldo() {
		
		int precioHora = 600;
		
		if(this.horasTrabajadas <= 160) {
			this.sueldo = this.horasTrabajadas * precioHora;
		}
		else if(this.horasTrabajadas >=160) {
			this.sueldo = this.horasTrabajadas * (precioHora + 50);
		}
		
		return this.sueldo;
		
	}

}
