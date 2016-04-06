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
		assertEquals(2, calculator.addition(possitiveNr, negativeNr),0d);
	}
	/*public String toString(){
		calculateAverage(this.getFirstGrade(), getSecondGrade(), getThirdGrade());
		DecimalFormat df= new DecimalFormat("#.0");
		String information;
		
		if (hasClearedTheCourse()){
			information = "Student: " + getFirstName() + " " + getLastName() + "\n"
					+ "\tGrades: " + this.firstGrade + ", " + this.secondGrade + ", " + this.thirdGrade + "\n" 
					+ "\tFinalGrade: " + df.format(this.averageGrade) + "\n" + getFirstName() + " has cleared the course \n–––––––––––––––––––––\n"
					;
			return information;
		}
		
		information = "Student: " + getFirstName() + " " + getLastName() + "\n"
				+ "\tGrades: " + this.firstGrade + ", " + this.secondGrade + ", " + this.thirdGrade + "\n" 
				+ "\tFinalGrade: " + df.format(this.getAverageGrade()) + "\n" + getFirstName() + " has not cleared the course \n–––––––––––––––––––––\n"
				;
		return information;
		
		*/

}
