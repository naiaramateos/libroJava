package com.ipartek.formacion.javalibro.pojo;
import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {

	public void testConstructorVacío() {

		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
	}

	public void testConstructor() {

		Participante p1 = new Participante("ander", "anderuraga");

		p1.setEmail("auraga@ipartek.com");

		// assertEquals(expected, actual);

		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());

		try {
			Participante matusalem = new Participante("Matu", 235);
			fail("Debería haber lanzado excepción");

		} catch (Exception e) {
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}

	}

	public void testExceptionEdad() {

		Participante p1 = new Participante("ander", "anderuraga");
		try {
			p1.setEdad(88);
		} catch (ParticipanteException e) {
			
			fail("No debería lanzar excepción con edad 88");

		}

		try {
			p1.setEdad(-3);
			fail("Debería haber lanzado Excepción");
		} catch (ParticipanteException e) {
			
			assertEquals(ParticipanteException.EXCEPTION_MENOR_CERO, e.getMessage());
		}
		try {
			p1.setEdad(101);
			fail("Debería haber lanzado Excepción");
		} catch (ParticipanteException e) {
			
			assertEquals(ParticipanteException.EXCEPTION_MAYOR_CIEN, e.getMessage());
		}
	}

}
