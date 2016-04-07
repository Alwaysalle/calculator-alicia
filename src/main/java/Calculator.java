import java.text.DecimalFormat;

public class Calculator {
	double result;

	
	public double addition(double firstValue, double secondValue){
		result = firstValue + secondValue;
		return result;
	}
	public double subtraction(double firstValue, double secondValue){
		result = firstValue - secondValue;
		return result;
	}
	public double divide(double firstValue, double secondValue){
		result = firstValue / secondValue;
		return result;
	}
	public double multiplication(double firstValue, double secondValue){
		result = firstValue * secondValue;
		return result;
	}
	
}