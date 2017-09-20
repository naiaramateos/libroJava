package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Nos conectaremos a una web para descargarnos el código fuente
 * 
 * http://www.example.com/
 * 
 * @author Administrador
 *
 */
public class ConectarPaginaWeb {
	
	URL url=null;

	public static void main(String[] args) {
		// TODO Auto-generated method st
		final String PAGINA_WEB = "http://www.example.com/";

		try {
			URL url = new URL(PAGINA_WEB);
			URLConnection con = url.openConnection();

			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			BufferedReader br = new BufferedReader(isr);

			String linea = "";
			String lineaEnlace = "";
			int posInicial = 0;
			int posFinal = 0;
			while ((linea = br.readLine()) != null) {
				if (linea.indexOf("href") != -1) {
					int n = getIndexOf(linea, '"', 0);

					String[] a = linea.substring(n).split(">");
					String dirEnlace = a[0].replaceAll("\"", "");
					URL urlEnlace = new URL(dirEnlace);
					URLConnection conEnlace = urlEnlace.openConnection();

					InputStreamReader isrEnlace = new InputStreamReader(conEnlace.getInputStream());
					BufferedReader brEnlace = new BufferedReader(isrEnlace);
					while ((lineaEnlace = brEnlace.readLine()) != null) {
						System.out.println(lineaEnlace);
					}

				}
			}

		} catch (

		MalformedURLException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}

	}

	public static int getIndexOf(String str, char c, int n) {
		int pos = str.indexOf(c, 0);
		while (n-- > 0 && pos != -1) {
			pos = str.indexOf(c, pos + 1);
		}
		return pos;
	}
	
	

}
