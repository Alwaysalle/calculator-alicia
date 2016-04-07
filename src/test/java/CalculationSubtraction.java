import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationSubtraction {
	Calculator calculator;
	double positiveValue = 5.5;
	double negativeValue = -4.3;
	double multipleDecimals = 4.34542;
    int integerValue = 4;
    Double nullValue = null;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testPositive() {
		assertEquals(0, (calculator.subtraction(positiveValue,positiveValue)),0.11d);
	}
    @Test
    public void testNegative() {
        assertEquals(0, (calculator.subtraction(negativeValue,negativeValue)),0.11d);
    }
    @Test
    public void testPositiveNegative() {
        assertEquals(9.8, (calculator.subtraction(positiveValue,negativeValue)),0.11d);
    }
    @Test
    public void testNegativePositive() {
        assertEquals(-9.8, (calculator.subtraction(negativeValue,positiveValue)),0.11d);
    }
    @Test
    public void testMultipleDecimals() {
        assertEquals(0, (calculator.subtraction(multipleDecimals,multipleDecimals)),0.11d);
    }
    @Test
    public void testPositiveMultipleDecimals() {
        assertEquals(1.15258, (calculator.subtraction(positiveValue,multipleDecimals)),0.11d);
    }
    @Test
    public void testInteger() {
        assertEquals(1.5, (calculator.subtraction(positiveValue,integerValue)),0.11d);
    }
    @Test
    public void testTwoInteger() {
        assertEquals(0, (calculator.subtraction(integerValue,integerValue)),0.11d);
    }
    @Test
    public void testNull() {
        try{
            assertEquals(34, (calculator.subtraction(nullValue,positiveValue)),0.11d);
        }
        catch( NullPointerException e){
            return;
        }
        fail("Was able to send in a null value to the calculator..");
    }
}
