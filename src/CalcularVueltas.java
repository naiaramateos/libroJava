
public class CalcularVueltas {

	public static void main(String[] args) {

		/*
		 * + * + + Ejercicio para calcular las vueltas de una compra, + la compra será
		 * de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. + Debemos
		 * calcular las vueltas para que sean mas optimas y dar el menor numero de
		 * billetes y monedas. + + ------------- RESULTADO --------------------- + +
		 * Vueltas de 673.76 Euros: + + En 13 Billetes de 50 + En 1 Billetes de 20 + En
		 * 0 Billetes de 10 + En 0 Billetes de 5 + En 1 Monedas de 2 Euros + En 1
		 * Monedas de 1 Euro + En 1 Monedas de 50 Centimos + En 1 Monedas de 20 Centimos
		 * + En 0 Monedas de 10 Centimos + En 1 Monedas de 5 Centimos + En 0 Monedas de
		 * 2 Centimos + En 1 Monedas de 1 Centimos
		 */

		float valorCompra = 1326.24f;
		float importeAbonado = 2000f;

		int billetes50 = 0;
		int billetes20 = 0;
		int billetes10 = 0;
		int billetes5 = 0;
		int billetes2 = 0;
		int billetes1 = 0;
		int billetes050 = 0;
		int billetes020 = 0;
		int billetes010 = 0;
		int billetes005 = 0;
		int billetes002 = 0;
		int billetes001 = 0;



		double vueltas = importeAbonado - valorCompra;

		while (vueltas > 0) {

			while (vueltas > 50) {

				++billetes50;
				vueltas = vueltas - 50;
			}

			vueltas = vueltas - (billetes50 * 50);

			

			while (vueltas > 20) {

				++billetes20;
				vueltas = vueltas - 20;
			}
			vueltas = vueltas - (billetes20 * 20);
			
			
			while (vueltas > 10) {

				++billetes10;
				vueltas = vueltas - 10;
			}
			vueltas = vueltas - (billetes10 * 10);
			while (vueltas > 5) {

				++billetes5;
				vueltas = vueltas - 5;
			}
			vueltas = vueltas - (billetes5 * 5);

			/////////////////////////////////////////////////

			while (vueltas > 2) {

				billetes2++;
				vueltas = vueltas - 2;
			}

			vueltas = vueltas - (billetes2 * 2);

			while (vueltas > 1) {

				billetes1++;
				vueltas = vueltas - 1;
			}
			vueltas = vueltas - (billetes1 * 1);

			while (vueltas > 0.50) {

				billetes050++;
				vueltas = vueltas - 0.50;
			}
			vueltas = vueltas - (billetes050 * 0.50);

			while (vueltas > 0.20) {

				billetes020++;
				vueltas = vueltas - 0.20;
			}
			vueltas = vueltas - (billetes020 * 0.20);

			while (vueltas > 0.10) {

				billetes010++;
				vueltas = vueltas - 0.10;
			}
			vueltas = vueltas - (billetes010 * 0.10);

			while (vueltas > 0.05) {

				billetes005++;
				vueltas = vueltas - 0.05;
			}
			vueltas = vueltas - (billetes005 * 0.05);

			while (vueltas > 0.02) {

				billetes002++;
				vueltas = vueltas - 0.02;
			}
			vueltas = vueltas - (billetes002 * 0.02);

			while (vueltas > 0.01) {

				billetes001++;
				vueltas = vueltas - 0.01;
			}
			vueltas = vueltas - (billetes001 * 0.01);

			
			System.out.println("Vueltas de " + (importeAbonado - valorCompra));
			System.out.println(billetes50 + " billetes de 50€");
			System.out.println(billetes20 + " billetes de 20€");
			System.out.println(billetes10 + " billetes de 10€");
			System.out.println(billetes5 + " billetes de 5€");
			System.out.println(billetes2 + " monedas de 2€");
			System.out.println(billetes1 + " monedas de 1€");
			System.out.println(billetes050 + " monedas de 0,50€");
			System.out.println(billetes020 + " monedas de 0,20€");
			System.out.println(billetes010 + " monedas de 0,10€");
			System.out.println(billetes005 + " monedas de 0,05€");
			System.out.println(billetes002 + " monedas de 0,02€");
			System.out.println(billetes001 + " monedas de 0,01€");

			
			
			//HASTA AQUÍ MI MIERDA DE SOLUCIÓN
			
			//A PARTIR DE AQUI LA SOLUCIÓN DE ANDER
			
			
			
			float compra = (float)1326.24;
			 		float pago = 4 * 500;
			 		float resto = pago - compra;
			 		final float[] BILLETES_MONEDAS = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
			 		int[] aVueltas = new int[BILLETES_MONEDAS.length];
			 		String[] literales = { "Billete 50", "Billete 20", "Billete 10", "Billete 5", "Moneda 2", "Moneda 1",
			 				"Moneda 0,50", "Moneda 0,20", "Moneda 0,10", "Moneda 0,05", "Moneda 0,02", "Moneda 0,01", }; // calcular
			 																												// las
			 																												// vueltas
			 		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			 			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			 			resto = resto - BILLETES_MONEDAS[i] * aVueltas[i];
					}
					
			 		System.out.println("-------------------------");
			 		System.out.println("------ TICKET ---------");
			 		System.out.println("-------------------------");
			 		System.out.println("PAGO: " + compra + " €");
			 		System.out.println("RETORNO:" + (pago - compra) + "€");
					System.out.println("-------------------------");
			 		System.out.println("Las vueltas:");
			 		System.out.println("-------------------------");
			 		for (int i = 0; i < aVueltas.length; i++) {
			 			System.out.println(aVueltas[i] + " " + literales[i]);
			 		}
			 		System.out.println("-------------------------");
			 		System.out.println("-gracias por su visita-");
			 		System.out.println("-------------------------");
			
			
			
			
		}

	}

}
