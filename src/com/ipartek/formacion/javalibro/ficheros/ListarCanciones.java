package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;
import java.sql.SQLException;

/**
 *
 * @author Darkwin
 */
public class ListarCanciones {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws SQLException, InterruptedException{

		Leer l = new Leer();
		l.LeerD("C:\\Users\\administrador\\Documents\\Music");

	}

	public static class Leer {

		public boolean LeerD(String directorio) throws SQLException, InterruptedException {

			File f = new File(directorio);
			File[] ficheros = f.listFiles();
			for (int x = 0; x < ficheros.length; x++) {
				if (ficheros[x].isDirectory()) {
					System.out.println(ficheros[x].getName());
					LeerD(ficheros[x].getPath());
				} else {
					System.out.println(ficheros[x].getName());
				}
			}
			return true;
		}
	}
}