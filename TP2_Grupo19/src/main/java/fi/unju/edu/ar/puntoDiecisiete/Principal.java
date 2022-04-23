package fi.unju.edu.ar.puntoDiecisiete;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate fecha1 = LocalDate.of(1998, 8, 21);
		LocalDate fecha2 = LocalDate.of(2003, 2, 13);
		
		ProcesoFecha pf1 = new ProcesoFecha(fecha1, fecha2);
		System.out.println(pf1.getFecha1());
		System.out.println(pf1.getFecha2());
		
	}

}
