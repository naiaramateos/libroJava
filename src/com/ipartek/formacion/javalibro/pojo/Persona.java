package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {

	public static int MAYOR_EDAD = 18;
	
	// Atributos privados para no ser accesibles desde fuera de la clase
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String email;
	private String dni;
	private String rol;

	public Persona() {
		super();

		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.edad = 0;
		this.email = "";
		this.dni = "";
		this.rol = "";
	}

	public Persona(String nombre, String apellido1, String apellido2, int num, String mail, String dni, String funcion)
			throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		setEdad(num);
		setEmail(mail);
		setDni(dni);
		this.rol = funcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Setea la edad de la persona
	 * 
	 * @param num
	 *            int años de la persona
	 * @throws PersonaException
	 *             edad < 18
	 */
	public void setEdad(int num) throws PersonaException {
		if (num < MAYOR_EDAD) {
			throw new PersonaException(PersonaException.EXCEPTION_MENOR_EDAD);
		}
		this.edad = num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) throws PersonaException {
		if (!Validaciones.email(mail)) {
			throw new PersonaException(PersonaException.EXCEPTION_MAIL_ERRONEO);
		}

		this.email = mail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws PersonaException {

		if (!Validaciones.validarDNI(dni)) {
			throw new PersonaException(PersonaException.EXCEPTION_DNI_ERRONEO);
		}

		this.dni = dni;
	}

	public String getRol() {
		return rol;
	}

	public void setFuncion(String funcion) {
		this.rol = funcion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", email=" + email + ", dni=" + dni + ", rol=" + rol + "]";
	}

}