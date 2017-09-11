package com.ipartek.formacion.javalibro.ejercicios;
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

	public static void main(String[] args) {

		int primitiva = 1;
		System.out.println("primitiva = " + primitiva);

		int primitiva2 = sumar(primitiva);
		System.out.println("primitiva = " + primitiva);
		System.out.println("primitiva2 = " + primitiva2);

		// Las variables de clase se pasan por referencia
		//Casa c1 = new casa();

	}

	static int sumar(int i) {
		return ++i;
	}

	
}
