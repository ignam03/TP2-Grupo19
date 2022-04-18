package fi.unju.edu.ar.puntoQuince;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private LocalDate fechNac;
	
	public Persona() {
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public LocalDate getFechNac() {
		return fechNac;
	}


	public void setFechNac(LocalDate fechNac) {
		this.fechNac = fechNac;
	}


	public int calcularEdad(int dia, int mes, int year) {
		
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNac = LocalDate.of(year, mes, dia);
		
		Period periodo = Period.between(fechaNac, fechaHoy);
		
		return periodo.getYears();
	}
	
	public void calcularEstacion(int dia, int mes, int year) {
		
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNac = LocalDate.of( dia, mes, year);
		
		Period periodo = Period.between(fechaNac, fechaHoy);
		
		
		switch (periodo.getMonths()) {
		case 1:
			System.out.println("Verano");
			break;
		case 2:
			System.out.println("Verano");
			break;
		case 3:
			System.out.println("Otoño");
			break;
		case 4:
			System.out.println("Otoño");
			break;
		case 5:
			System.out.println("Otoño");
			break;
		case 6:
			System.out.println("Otoño");
			break;
		case 7:
			System.out.println("Otoño");
			break;
		case 8:
			System.out.println("Otoño");
			break;
		case 9:
			System.out.println("Primevera");
			break;
		case 10:
			System.out.println("Primevera");
			break;
		case 11:
			System.out.println("Primevera");
			break;
		case 12:
			System.out.println("Verano");
			break;
		default:
			break;
		}
		
	}
	
}
