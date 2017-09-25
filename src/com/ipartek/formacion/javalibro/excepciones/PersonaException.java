package com.ipartek.formacion.javalibro.excepciones;

public class PersonaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static String EXCEPTION_MENOR_EDAD = "Un trabajador ha de ser mayor de 18 años.";
	public final static String EXCEPTION_DNI_ERRONEO = "DNI incorrecto";
	public final static String EXCEPTION_MAIL_ERRONEO = "E-mail incorrecto";

	public PersonaException(String messageException) {
		super(messageException);

	}

}