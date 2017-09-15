package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		File carpeta = null;

		System.out.println("Nombre de la carpeta");
		System.out.println("----------------------------------------");
		String nombreCarpeta = sc.next();
		carpeta = new File("C:\\" + nombreCarpeta);
		if (carpeta.exists()) {
			System.out.println("La carpeta ya existe. Existe otro nombre");
			System.out.println("----------------------------------------");
			nombreCarpeta = sc.next();
			carpeta = new File("C:\\" + nombreCarpeta);
		} else {
			carpeta.mkdir();
		}

		System.out.println("Nombre del archivo");
		System.out.println("----------------------------------------");
		
		String rutaArchivo= carpeta.getAbsolutePath()+"\\" + sc.next() + ".txt";
		
		FileWriter fw= new FileWriter(rutaArchivo);
		BufferedWriter bw= new BufferedWriter(fw);
		
		System.out.println("Primera línea:");
		System.out.println("----------------------------------------");
		Scanner sc2 = new Scanner(System.in);
		String linea= sc2.nextLine();
		bw.write(linea);
		bw.newLine();
		
		bw.close();
		fw.close();
		
		

		// } else {
		// System.out.println("La carpeta ya existe, escribe otro nombre");
		// no se crea y pedimos otra

		sc.close();

	}
}