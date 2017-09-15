package com.ipartek.formacion.javalibro.ejercicios;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.Participante;

/**
 * 
 * 
 * Las variables primitivas se pasan por valor Las variables de clase se pasan
 * por referencia
 * 
 * @author administrador
 *
 */
public class VariablesReferenciaYvalor {

	public static void main(String[] args) throws ParticipanteException {

		int primitiva = 1;
		System.out.println("primitiva = " + primitiva);

		int primitiva2 = sumar(primitiva);
		System.out.println("primitiva = " + primitiva);
		System.out.println("primitiva2 = " + primitiva2);

		// Las variables de clase se pasan por referencia
		// Casa c1 = new casa();
		Participante p1 = new Participante("Manolo", 18);
		Participante p2 = sumar(p1);
		
		System.out.println("referencia = " + p1.getEdad());
		System.out.println("referencia2 = " + p2.getEdad());
		
	}

	private static Participante sumar(Participante p) throws ParticipanteException {
		// TODO Auto-generated method stub
		p.setEdad((p.getEdad()+1));
		return p;
	}

	static int sumar(int i) {
		return ++i;
	}

}
