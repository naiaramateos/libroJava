package com.ipartek.formacion.javalibro.ejercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista = { 0, 3, 1, 8, 7, 2, 5, 4, 6, 9 };
		String modoOrden = "";

		do {
			System.out.println("Introduce tipo de ordenacion:\n\ta: Ascendente\n\td: Descendente");
			Scanner cs = new Scanner(System.in);
			modoOrden = cs.next();
		} while ((!modoOrden.equals("a")) && (!modoOrden.equals("d")));

		ordenarArray(lista, modoOrden);

	}

	private static void ordenarArray(int[] lista, String modoOrden) {
		// TODO Auto-generated method stub

		// int[] lista = { 0, 3, 1 };
		int menor;
		try {
			for (int i = 0; i < lista.length; i++) {
				for (int j = 0; j < lista.length; j++) {
					if (modoOrden.equals("a")) {

						if (lista[i] < lista[j]) {
							menor = lista[j];
							lista[j] = lista[i];
							lista[i] = menor;
						}
					} else if (modoOrden.equals("d")) {
						if (lista[i] > lista[j]) {
							menor = lista[j];
							lista[j] = lista[i];
							lista[i] = menor;
						}

					}

				}

			}

			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i]);

			}

		} catch (Exception e) {
			System.out.println("Excepcion: " + e);
		}

	}

}
