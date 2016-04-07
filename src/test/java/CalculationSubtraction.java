import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationSubtraction {
	Calculator calculator;
	double possitiveNr = 5.5;
	double negativeNr = -4.3;
	double multibleDecimals = 4.34542;
    int integerNr = 4;
    Double nullNr = null;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void testPossitive() {
		assertEquals(0, (calculator.subtraction(possitiveNr,possitiveNr)),0.11d);
	}
    @Test
    public void testNegative() {
        assertEquals(0, (calculator.subtraction(negativeNr,negativeNr)),0.11d);
    }
    @Test
    public void testPossitiveNegative() {
        assertEquals(9.8, (calculator.subtraction(possitiveNr,negativeNr)),0.11d);
    }
    @Test
    public void testNegativePossitive() {
        assertEquals(-9.8, (calculator.subtraction(negativeNr,possitiveNr)),0.11d);
    }
    @Test
    public void testMultibleDecimals() {
        assertEquals(0, (calculator.subtraction(multibleDecimals,multibleDecimals)),0.11d);
    }
    @Test
    public void testPossitveMultableDecimals() {
        assertEquals(1.15258, (calculator.subtraction(possitiveNr,multibleDecimals)),0.11d);
    }
    @Test
    public void testInteger() {
        assertEquals(1.5, (calculator.subtraction(possitiveNr,integerNr)),0.11d);
    }
    @Test
    public void testTwoInteger() {
        assertEquals(0, (calculator.subtraction(integerNr,integerNr)),0.11d);
    }
    @Test
    public void testNull() {
        try{
            assertEquals(34, (calculator.subtraction(nullNr,possitiveNr)),0.11d);
        }
        catch( NullPointerException e){
            return;
        }
        fail("Går att skicka in null");
    }
}
