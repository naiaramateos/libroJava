package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerarFicheroTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("c:\\prueba.txt");
			bw = new BufferedWriter(fw);
			bw.write("¡Hola! He escrito");

			System.out.println("Fichero creado.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se puede cerrar el buffer y Writer");
				e.printStackTrace();
			}

		}
	}
	
	


}

//while((String linea=br.readline())!=null)
//{
//	
//}
