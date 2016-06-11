package simple;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.usbcali.scm.Calculadora;
import co.edu.usbcali.scm.CalculadoraImpl;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calculadora = new CalculadoraImpl();
		
		assertTrue(calculadora.sumar(4, 4) == 8);
	}
	
	@Test
	public void testResta() {
		Calculadora calculadora = new CalculadoraImpl();
		
		assertTrue(calculadora.restar(4, 4) == 0);
	}

}
