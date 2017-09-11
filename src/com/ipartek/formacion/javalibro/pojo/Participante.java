package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

public class Participante {

	// Atributos
	// Privados para no ser accesibles desde fuera de la clase

	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;

	public Participante() {
		super();
		
		this.nombre = "";
		this.usuarioGit = "";
		this.email = "";
		this.trabajador = false;
		this.edad = 0;
	}

	// Constructores

	public Participante(String nombre, int edad) throws ParticipanteException {
		this();
		this.nombre = nombre;
		this.setEdad(edad);

	}
	
	public Participante(String nombre, String usuarioGit) {
		this();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		

	}

	// Getters y Setters: son necesarios para acceder a los atributos encapsulados

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

	// Otros métodos
	String getLinkGitHub() {
		return "https://github.com/" + this.usuarioGit;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws ParticipanteException {
		if (edad < 0) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_CERO);
		}
		
		if (edad >100) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_CIEN);
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email + ", trabajador="
				+ trabajador + ", edad=" + edad + "]";
	}

}
