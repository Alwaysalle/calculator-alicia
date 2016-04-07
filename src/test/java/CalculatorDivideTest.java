import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorDivideTest {
	Calculator calculator;
	double possitiveNr = 45.5;
	double negativeNr = -7.3;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	@Test
	public void testPossitive() {
		assertEquals(1,calculator.divide(possitiveNr,possitiveNr), 0.1d);
	}
	@Test
	public void testNegative() {
		assertEquals(1,calculator.divide(negativeNr,negativeNr), 0.1d);
	}
	@Test
	public void testNegativePossitive() {
		assertEquals(-0.16,calculator.divide(negativeNr,possitiveNr), 0.1d);
	}
	@Test
	public void testPossitiveNegative() {
		assertEquals(-6.23,calculator.divide(possitiveNr,negativeNr), 0.1d);
	}


}
