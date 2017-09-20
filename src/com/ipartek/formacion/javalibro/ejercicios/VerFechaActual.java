package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Mostrarv la fecha actual del sistema
 * 
 * @author Administrador
 *
 */
public class VerFechaActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String[] MESES = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };

		final String[] DIAS_SEMANA = new String[] { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
				"Sábado" };

		Date date = new Date();

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);

		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);

		int diaSemana = gc.get(Calendar.DAY_OF_WEEK)-1;

		System.out.println(anyo + "/" + MESES[mes] + "/" + dia + "\n\nHoy es: " + DIAS_SEMANA[diaSemana]);

	}

}
