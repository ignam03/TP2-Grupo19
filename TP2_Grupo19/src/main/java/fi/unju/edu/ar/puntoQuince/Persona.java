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
	
	public String calcularEstacion(int dia, int mes, int year) {
		String estacion = "";
		switch (mes) {
		case 1:
			if(dia > 21) {
				estacion = "Verano";
			}
			break;
		case 2:
			estacion =  "Verano";
			break;
		case 3:
			if(dia > 21) {
				estacion = "Otoño";
			} else {
				estacion = "Verano";
			}
			break;
		case 4:
			estacion = "Otoño";
			break;
		case 5:
			estacion = "Otoño";
			break;
		case 6:
			if(dia > 21) {
				estacion = "Invierno";
			} else {
				estacion = "Otoño";
			}
			break;
		case 7:
			estacion = "Invierno";
			break;
		case 8:
			estacion = "Invierno";
			break;
		case 9:
			if(dia > 21) {
				estacion = "Primavera";
			} else {
				estacion = "Invierno";
			}
			break;
		case 10:
			estacion = "Primavera";
			break;
		case 11:
			estacion = "Primavera";
			break;
		case 12:
			if(dia > 21) {
				estacion = "Verano";
			} else {
				estacion = "Invierno";
			}
			break;
		default:
			break;
		}
		
		return estacion;
	}
	
	public String devolverSigno(int dia, int mes, int year) {
		String signo = "";
		switch (mes) {
		case 1:
			signo = "Capricornio";
			break;
		case 2:
			signo = "Acuario";
		case 3:
			signo = "Piscis";
			break;
		case 4:
			signo = "Aries";
			break;
		case 5:
			signo = "Tauro";
			break;
		case 6:
			signo = "Geminis";
			break;
		case 7:
			signo = "Cancer";
			break;
		case 8:
			signo = "Leo";
			break;
		case 9:
			signo = "Virgo";
			break;
		case 10:
			signo = "Libra";
			break;
		case 11:
			signo = "Escorpio";
			break;
		case 12:
			signo = "Sagitario";
			break;
		default:
			break;
		}
		
		return signo;
	}
	
}
