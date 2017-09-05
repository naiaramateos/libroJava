import java.text.NumberFormat;

import javax.swing.text.MaskFormatter;

import org.omg.Messaging.SyncScopeHelper;

/*
 * EJERCICIO PARA PROBAR LAS VARIABLES DE JAVA
 * 
 * */
public class Variables {

	/**
	 * Esta función recibe un valor booleano (true o false). 
	 * Si el valor es false, devuelve el carácter ✓
	 * Si el valor es false, devuelve el carácter ✘
	 * @param valor boolean
	 * @return si valor true check, si false cross
	 */
	
	public static char cambiarValor(boolean valor) {
		
		char resul ='\u2716'; //✘
		
		if (valor) {
			resul='\u2714'; //✓
			}
		return (resul);
	}

	public static void main(String[] args) {

		System.out.println("Ejercicio con variables");
		System.out.println("1. Enteros: ");

		// INT
		System.out.println("Int: ");
		System.out.println("int " + Integer.BYTES + " 4bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

		// BYTE:

		System.out.println("Byte: ");
		System.out.println("Byte " + Integer.BYTES + " 4bytes byte " + Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

		// SHORT:

		System.out.println("Short: ");
		System.out.println("Short " + Short.BYTES + " 4bytes Short " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

		// SHORT:

		System.out.println("Long: ");
		System.out.println("Long " + Long.BYTES + " 4bytes Short " + Long.MIN_VALUE + " " + Long.MAX_VALUE);

		System.out.println("2. Reales: ");

		// FLOAT
		System.out.println("Float: ");
		System.out.println("Float " + Float.BYTES + " 4bytes entero " + Float.MIN_VALUE + " " + Float.MAX_VALUE);

		// DOUBLE:

		System.out.println("Double: ");
		System.out.println("Double " + Double.BYTES + " 4bytes byte " + Double.MIN_VALUE + " " + Double.MAX_VALUE);

		System.out.println("3. Booleanas: ");
		System.out.println("4. Caracteres: ");

		System.out.println("Reales: ");
		float sueldoMes = (float) 2000.25;
		// float sueldoMes= 2000.25f;

		System.out.println("Germán cobra " + NumberFormat.getInstance().format(sueldoMes) + "€ al mes");

		String sSueldoMes = (String.valueOf("2000.25"));
		sSueldoMes = sSueldoMes.replace(',', ',');
		System.out.println("Germán cobra " + sSueldoMes + "€ al mes");
		// float sueldoMes= 2000.25f;

		System.out.println("Germán cobra " + NumberFormat.getInstance().format(sueldoMes) + "€ al mes" + '\n');

		// TODO Declarar una variables primitiva de cada tipo y usar su wrapper

		System.out.println('\t' + "dígito" + '\t' + "letra" + '\t' + "Mayus" + '\t' + "Minus" + '\t');
		System.out.println(
				"a" + '\t' + cambiarValor(Character.isDigit('a')) + '\t' + cambiarValor(Character.isLetter('a')) + '\t'
						+ cambiarValor(Character.isUpperCase('a')) + '\t' + cambiarValor(Character.isLowerCase('a')));
		System.out.println(
				"F" + '\t' + cambiarValor(Character.isDigit('F')) + '\t' + cambiarValor(Character.isLetter('F')) + '\t'
						+ cambiarValor(Character.isUpperCase('F')) + '\t' + cambiarValor(Character.isLowerCase('F')));
		System.out.println(
				"3" + '\t' + cambiarValor(Character.isDigit('3')) + '\t' + cambiarValor(Character.isLetter('3')) + '\t'
						+ cambiarValor(Character.isUpperCase('3')) + '\t' + cambiarValor(Character.isLowerCase('3')));
		System.out.println(
				"j" + '\t' + cambiarValor(Character.isDigit('j')) + '\t' + cambiarValor(Character.isLetter('j')) + '\t'
						+ cambiarValor(Character.isUpperCase('j')) + '\t' + cambiarValor(Character.isLowerCase('j')));

	}

}
