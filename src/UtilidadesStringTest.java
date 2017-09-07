import static org.junit.Assert.*;

import org.junit.Test;

public class UtilidadesStringTest {

	@Test
	public void testBuscarpalabra() {
		
		
		//Casus NULL
		assertEquals( 0, UtilidadesString.buscarpalabra(null, null));
		assertEquals( 0, UtilidadesString.buscarpalabra(null, "descanso"));
		assertEquals( 0, UtilidadesString.buscarpalabra("Ahora toca descanso", null));
		
		
		assertEquals(1, UtilidadesString.buscarpalabra("Ahora toca descanso", "descanso"));
		//assertEquals(2, UtilidadesString.buscarpalabra("Ahora toca descanso descanso", "descanso"));
		//assertEquals(0, UtilidadesString.buscarpalabra("Ahora toca descansodescanso", "descanso"));
		

	}

}
