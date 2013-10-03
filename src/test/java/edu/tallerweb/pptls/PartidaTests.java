package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		Mano jugadorTres = new Mano(Forma.SPOCK);
		Mano jugadorCuatro = new Mano(Forma.PAPEL);
		
		assertEquals("Spock vaporiza piedra", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

		assertEquals("Spock empata Spock", Resultado.EMPATA, jugadorUno.jugarCon(jugadorTres));
		
		assertEquals("Spock empata Spock", Resultado.PIERDE, jugadorUno.jugarCon(jugadorCuatro));

	}

}
