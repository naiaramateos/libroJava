import java.util.InputMismatchException;
import java.util.Scanner;

public class AveriguarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int numeroSecreto = 7;
		int contador = 0;
		boolean acertado = false;
		int numeroUsuario = 0;

		int numeroSecreto = generarNumeroAleatorio();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Averigua mi número");
			System.out.println("----------------------------------------");
			System.out.println("Prueba un número... Tienes " + (3 - contador) + " intentos.");

			try {
				numeroUsuario = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("No has metido un número: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error no controlado: " + e.getMessage());
			}

			if (numeroUsuario == numeroSecreto) {
				System.out.println("Enhorabuena! Lo has acertado");
				acertado = true;
				break;
			} else {

				if (contador < 2) {
					System.out.println("Te quedan " + (3 - contador) + " intento(s)");

				}
				++contador;
				acertado = false;
			}

		} while ((contador < 3) && (!acertado));
		if (!acertado)

		{
			System.out.println("No lo has adivinado. El número era el " + numeroSecreto);
		}
		sc.close();
	}

	public static int generarNumeroAleatorio() {
		int resul = -1;

		resul = (int) (Math.random() * 10);

		return resul;
	}
}
