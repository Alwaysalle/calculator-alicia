import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;


public class CalculatorAdditionTest {
	static Calculator calculator;
	
	double negativeNr = -2.1;
	double possitiveNr = 4.1;
	double multibleNr = 4.43;
	
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testTwoPossitive() {
		assertEquals(8.2, calculator.addition(possitiveNr, possitiveNr),0d);
	}
	@Test
	public void testTwoNegative() {
		assertEquals(-4.2, calculator.addition(negativeNr, negativeNr),0d);
	}
	@Test
	public void testOnePossitiveOneNegative() {
		assertEquals("Resultatet blir inte 2 enligt programmet blir det " + calculator.addition(possitiveNr, negativeNr),2.0, calculator.addition(possitiveNr, negativeNr),0.11d);
	}


}
