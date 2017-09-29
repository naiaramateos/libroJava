package com.ipartek.formacion.javalibro.entregar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;

/**
 * Ejercicio para convertir un data/personas.txt a data/personas.xml
 * 
 * Estructura txt
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 * 
 * Estructura XML: 
 * <personas> 
	 * <persona>
			 * <nombre>Ted</nombre>
			 * <apellido1>Upton</apellido1>
			 * <apellido2>Sant Andreu De La Barca</apellido2>
			 * <edad>8</edad>
			 * <email>tedfupton@mailinator.com</email>
			 * <dni>12277015Y</dni>
			 *  <rol>TRABAJADOR</rol>
	 * </persona> 
 *  </personas>
 * 
 * @author Administrador
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.pojo.Persona;

public class EscribirPersonasXML {

	public final static String RUTA_ARCHIVO_TXT = "data\\personasOK.txt";
	public final static String RUTA_ARCHIVO_XML = "data\\personas.xml";

	public static Element ePersonas = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			volcarContenido();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void volcarContenido() throws FileNotFoundException, IOException {

		String cadena = null;
		FileReader f = null;
		Document doc = null;
		Attr attr = null;

		// La variable i sirve para establecer el atributo id de cada persona.
		int i = 1;

		/*
		 * Declaro array de tipo String de 7 posiciones, ya que cada persona tendrá 7
		 * campos de datos: Nombre, Apellido1, Apellido2 (o tal vez localidad), edad,
		 * email, dni y rol. Ejemplo:
		 * 
		 * Ted,Upton,Sant Andreu De La
		 * Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
		 * 
		 */

		ArrayList<Persona> aPersona = new ArrayList<Persona>();

		try {

			/*
			 * Leo el contenido del txt con un FileReader y optimizo la lectura con un
			 * BufferedReader
			 */
			f = new FileReader(RUTA_ARCHIVO_TXT);
			BufferedReader b = new BufferedReader(f);

			while ((cadena = b.readLine()) != null) {

				Persona p = new Persona();
				String[] campos = cadena.split(",");

				p.setNombre(campos[0]);
				p.setApellido1(campos[1]);
				p.setApellido2(campos[2]);
				p.setEdad(Integer.parseInt(campos[3]));
				p.setEmail(campos[4]);
				p.setDni(campos[5]);
				p.setFuncion(campos[6]);

				aPersona.add(p);

			}

			// Cierro el BufferReader
			b.close();

			// Creo el documento XML
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.newDocument();

			// Creamos elemento padre PERSONAS
			ePersonas = doc.createElement("personas");
			doc.appendChild(ePersonas);

			for (Persona persona : aPersona) {

				// Creo el elemento persona
				Element ePersona = doc.createElement("persona");
				ePersonas.appendChild(ePersona);

				// Le pongo el atributo id para comprobar que guarda todos
				attr = doc.createAttribute("id");
				attr.setValue(String.valueOf(i));
				ePersona.setAttributeNode(attr);
				i++;

				// Establezco el elemento nombre
				Element eNombre = doc.createElement("nombre");
				eNombre.setTextContent(persona.getNombre());
				ePersona.appendChild(eNombre);

				// Establezco el elemento apellido1
				Element eApellido1 = doc.createElement("apellido1");
				eApellido1.setTextContent(persona.getApellido1());
				ePersona.appendChild(eApellido1);

				// Establezco el elemento apellido2
				Element eApellido2 = doc.createElement("apellido2");
				eApellido2.setTextContent(persona.getApellido2());
				ePersona.appendChild(eApellido2);

				// Establezco el elemento edad
				Element eEdad = doc.createElement("edad");
				eEdad.setTextContent(String.valueOf(persona.getEdad()));
				ePersona.appendChild(eEdad);

				// Establezco el elemento email
				Element eEmail = doc.createElement("email");
				eEmail.setTextContent(persona.getEmail());
				ePersona.appendChild(eEmail);

				// Establezco el elemento dni
				Element eDni = doc.createElement("dni");
				eDni.setTextContent(persona.getDni());
				ePersona.appendChild(eDni);

				// Establezco el elemento rol
				Element eRol = doc.createElement("rol");
				eRol.setTextContent(persona.getRol());
				ePersona.appendChild(eRol);

				// Escribo el contenido en el archivo
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(RUTA_ARCHIVO_XML));
				transformer.transform(source, result);

			}

			System.out.println("Archivo XML creado correctamente.");

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
