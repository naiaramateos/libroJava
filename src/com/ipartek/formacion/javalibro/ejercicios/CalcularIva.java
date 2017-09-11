package com.ipartek.formacion.javalibro.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		

		float importe = 0;
		boolean importeCorrecto = false;
		System.out.println("Calculadora IVA 21%");
		System.out.println("----------------------------------------");
		System.out.println("Por favor dame el importe en €");
		Scanner sc = new Scanner(System.in);
		do {
			try {
				importe = sc.nextFloat();
				importeCorrecto = true;
			} 
			catch (InputMismatchException e) {
				System.out.println("Valor incorrecto, introduce un valor numérico, por ejemplo:  123.33");
			}
			catch (Exception e) {
				System.out.println("Qué has hecho para que falle? "+e.getMessage());
			}
		} while (!importeCorrecto);

		System.out.println("IVA REPERCUTIDO :" + importe * 0.21);

		Scanner sc2 = new Scanner(System.in);
		String respuesta = "s";

		do {

			System.out
					.println("¿Quieres hacer otro cálculo? Pulsa s para continuar, cualquier otra tecla para salir...");
			respuesta = sc2.nextLine();

			if ("s".equals(respuesta)) {
				System.out.println("----------------------------------------");
				System.out.println("Por favor dame el importe en €");
				sc = new Scanner(System.in);
				importe = (float) sc.nextFloat();

				System.out.println("IVA REPERCUTIDO :" + importe * 1.21);
			} else {
				System.out.println("Agur!");
			}

		} while ("s".equals(respuesta));
		sc.close();
		sc2.close();

	}

}
