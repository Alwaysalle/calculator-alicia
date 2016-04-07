import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorDivideTest {
	Calculator calculator;
	double positiveValue = 45.5;
	double negativeValue = -7.3;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	@Test
	public void testPositive() {
		assertEquals(1,calculator.divide(positiveValue,positiveValue), 0.1d);
	}
	@Test
	public void testNegative() {
		assertEquals(1,calculator.divide(negativeValue,negativeValue), 0.1d);
	}
	@Test
	public void testNegativePositive() {
		assertEquals(-0.16,calculator.divide(negativeValue,positiveValue), 0.1d);
	}
	@Test
	public void testPositiveNegative() {
		assertEquals(-6.23,calculator.divide(positiveValue,negativeValue), 0.1d);
	}


}
