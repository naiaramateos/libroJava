package com.ipartek.formacion.javalibro.entregar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class DividirFichero {

	public static final String RUTA_TXT = "data\\personas.txt";
	public static final String RUTA_TXT_CORRECTOS = "data\\personasOK.txt";
	public static final String RUTA_TXT_ERROR = "data\\personasERROR.txt";

	public static final int NUM_CAMPOS_OK = 7;

	public static String[] campos;

	static final int POS_NOMBRE = 0;
	static final int POS_APELLIDO1 = 1;
	static final int POS_APELLIDO2 = 2;
	static final int POS_EDAD = 3;
	static final int POS_EMAIL = 4;
	static final int POS_DNI = 5;
	static final int POS_ROL = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leerArchivo();

	}

	static void leerArchivo() {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw1 = null;
		BufferedWriter bw1 = null;
		FileWriter fw2 = null;
		BufferedWriter bw2 = null;

		try {

			String cadena;

			// Creo FileReader de personas.txt
			fr = new FileReader(RUTA_TXT);
			br = new BufferedReader(fr);
			System.out.println("Abro " + RUTA_TXT);

			// Creo FileWriter de personasOK.txt
			fw1 = new FileWriter(RUTA_TXT_CORRECTOS);
			bw1 = new BufferedWriter(fw1);
			System.out.println("Creo " + RUTA_TXT_CORRECTOS);

			// Creo FileWriter de personasERROR.txt
			fw2 = new FileWriter(RUTA_TXT_ERROR);
			bw2 = new BufferedWriter(fw2);

			System.out.println("Recorriendo " + RUTA_TXT + "...");

			// Recorro personas.txt

			/*
			 * Se podría hacer también recorriendo el archivo y volcando los correctos en un
			 * ArrayList y los incorrectos en otro, pero me ha parecido que esta forma es
			 * mejor
			 */

			while ((cadena = br.readLine()) != null) {

				campos = cadena.split(",");
				if (campos.length == NUM_CAMPOS_OK) // Es correcto
				{
					try {
						/*
						 * Llamo a la funcion validarPersona para poder llegar al constructor y que así
						 * valide que los datos de la persona son correctos.
						 */
						validarPersona(campos);

						/* Si es correcta, la escribo en personasOK.txt */
						bw1.write(cadena + "\r\n");
						bw1.flush();

					} catch (Exception e) {

						/*
						 * Si salta esta excepción es porque algún dato no es correcto, en cuyo caso lo
						 * escribo en personasERROR.txt
						 */

						bw2.write(cadena + "\r\n");
						bw2.flush();
					}

				} else {

					/*
					 * Si entra en este else es porque la línea no tiene 7 campos, en cuyo caso lo
					 * escribo en personasERROR.txt
					 */
					bw2.write(cadena + "\r\n");
					bw2.flush();

				}
			}
			br.close();
			System.out.println("Se ha teminado de recorrer el archivo. Archivos " + RUTA_TXT_CORRECTOS + " y "
					+ RUTA_TXT_ERROR + " generados correctamente.");
		} catch (IOException errorIO) {
			System.out.println("Ha ocurrido un error: " + errorIO.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				bw1.close();
				bw2.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer.");
				e.printStackTrace();
			}
			try {
				fw1.close();
				fw2.close();

			} catch (IOException e) {
				System.out.println("No se puede cerrar el FileWriter");
				e.printStackTrace();
			}
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el BufferReader");
				e.printStackTrace();
			}

		}
	}

	private static void validarPersona(String[] campos) throws PersonaException {

		Persona p = new Persona(campos[POS_NOMBRE], campos[POS_APELLIDO1], campos[POS_APELLIDO2],
				Integer.parseInt(campos[POS_EDAD]), campos[POS_EMAIL], campos[POS_DNI], campos[POS_ROL]);

	}

}
