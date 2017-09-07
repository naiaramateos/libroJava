import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
	public void testConstructorVacío() {
		
		Participante p=new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGit());
		assertEquals("", p.getEmail());
		assertFalse(p.isTrabajador());
	}

	public void testConstructor() {

		Participante p1 = new Participante("ander", "anderuraga");

		p1.setEmail("auraga@ipartek.com");
		
		//assertEquals(expected, actual);

		assertEquals("ander", p1.getNombre());
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail());
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub());

	}

}
