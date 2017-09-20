package com.ipartek.formacion.javalibro.excepciones;

public class PersonaException extends Exception {
	
	private static final long serialVersionUID=1L;
	
	public static final String MSG_EDAD_MENOR="Debe ser mayor que 18";
	public static final String MSG_EMAIL_ERROR="Email erróneo";
	public static final String MSG_DNI_ERROR="DNI incorrecto";
	
	public PersonaException(String messageException)
	{
		super(messageException);
	}

}
