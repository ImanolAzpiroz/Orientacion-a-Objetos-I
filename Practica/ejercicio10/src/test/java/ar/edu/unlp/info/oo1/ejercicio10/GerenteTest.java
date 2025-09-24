package ar.edu.unlp.info.oo1.ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class GerenteTest {
	
	private Gerente alan;
	private Gerente cory;
	
	@BeforeEach
	void setUp() throws Exception {
		this.alan = new Gerente("Alan Turing");
		this.cory = new Gerente("Cory Wong");
	}
	
	@Test
	void testAportes() {
		assertEquals(2850.0, alan.aportes());
	}
	
	@Test
	void testSueldoBasico() {
		assertEquals(67850.0, alan.sueldoBasico());
	}	
}
