package fi.unju.edu.ar.puntoDiecisiete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {

	private LocalDate fecha1;
	private LocalDate fecha2;
	private LocalTime time1;
	private LocalTime time2;
	private LocalDateTime locatime1;
	private LocalDateTime locatime2;

	public ProcesoFecha() {

	}

	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public ProcesoFecha(LocalDateTime locatime1, LocalDateTime locatime2) {
		this.locatime1 = locatime1;
		this.locatime2 = locatime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}

	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}

	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getLocatime1() {
		return locatime1;
	}

	public void setLocatime1(LocalDateTime locatime1) {
		this.locatime1 = locatime1;
	}

	public LocalDateTime getLocatime2() {
		return locatime2;
	}

	public void setLocatime2(LocalDateTime locatime2) {
		this.locatime2 = locatime2;
	}

	public Period contarTiempoTranscurrido() {
		
		Period periodo = Period.between(this.fecha1, this.fecha2);
		return periodo;
	}

	public String formatearFecha(LocalDate fecha) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yy");
		String fechaFormateada = formato.format(fecha);
		
		return fechaFormateada;
	}
	
	public String compararFechas() {
		
		
		
		String resultadoComp = "";
		
		return resultadoComp;
	}
}
