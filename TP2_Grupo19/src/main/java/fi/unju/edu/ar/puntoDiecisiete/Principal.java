package fi.unju.edu.ar.puntoDiecisiete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b.1
		LocalDate fecha1 = LocalDate.of(1998, 8, 21);
		LocalDate fecha2 = LocalDate.of(2003, 2, 13);
		
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		System.out.println(pf1.getFecha1());
		System.out.println(pf1.getFecha2());
		
		//b.2
		LocalTime time1 = LocalTime.of(5, 0);
		LocalTime time2 = LocalTime.of(0, 0);
		ProcesoFecha pf2 = new ProcesoFecha(time1, time2);
		
		//b.4
		LocalDateTime locaTime1 = LocalDateTime.of(fecha2, time2);
		LocalDateTime localTime2 = LocalDateTime.of(fecha2, time2);
		
		ProcesoFecha localTime1 = new ProcesoFecha(locaTime1, localTime2);
		
	}

}
