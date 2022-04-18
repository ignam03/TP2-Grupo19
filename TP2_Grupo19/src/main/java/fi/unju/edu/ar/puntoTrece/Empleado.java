package fi.unju.edu.ar.puntoTrece;
import java.util.Calendar;

public class Empleado {

	private String nombre;
	private Calendar fechaIngreso;
	private int legajo;
	private String email;
	private int sueldo;
	private int horasTrabajadas;

	//Constructor sin parametros o por defecto
	public Empleado() {
		
	}
	
	//Constructor con parametros nombre, legajo, horasTrabajadas
	
	public Empleado(String nombre, int legajo, int horasTrabajadas) {
		this.nombre = nombre;
		this.legajo = -999;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	//Constructor con parametros nombre, fechaIngreso, horasTrabajadas
	
	public Empleado(String nombre, Calendar fechaIngreso, int horasTrabajadas) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//Constructor con parametros nombre, horasTrabajadas
	
	public Empleado(String nombre, int horasTrabajadas) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
