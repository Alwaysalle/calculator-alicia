import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorMultiplicationTest {
	Calculator calculator;
	double positiveValue = 1.5;
	double negativeValue = -3.3;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	@Test
	public void testPositive() {
		assertEquals(2.25,calculator.multiplication(positiveValue,positiveValue), 0.1d);
	}
	@Test
	public void testNegative() {
		assertEquals(10.8,calculator.multiplication(negativeValue,negativeValue), 0.1d);
	}
	@Test
	public void testNegativePositive() {
		assertEquals(-5,calculator.multiplication(negativeValue,positiveValue), 0.1d);
	}
	@Test
	public void testPositiveNegative() {
		assertEquals(-5,calculator.multiplication(positiveValue,negativeValue), 0.1d);
	}
}
