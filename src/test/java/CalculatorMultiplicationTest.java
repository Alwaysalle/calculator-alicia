import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorMultiplicationTest {
	Calculator calculator;
	double possitiveNr = 1.5;
	double negativeNr = -3.3;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	@Test
	public void testPossitive() {
		assertEquals(2.25,calculator.multiplication(possitiveNr,possitiveNr), 0.1d);
	}
	@Test
	public void testNegative() {
		assertEquals(10.8,calculator.multiplication(negativeNr,negativeNr), 0.1d);
	}
	@Test
	public void testNegativePossitive() {
		assertEquals(-5,calculator.multiplication(negativeNr,possitiveNr), 0.1d);
	}
	@Test
	public void testPossitiveNegative() {
		assertEquals(-5,calculator.multiplication(possitiveNr,negativeNr), 0.1d);
	}
}
