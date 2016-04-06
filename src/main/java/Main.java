
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber=3.5;
		double secondNumber = 6.5;
		Calculator calculator = new Calculator();
		System.out.println(calculator.addition(firstNumber,secondNumber));
		System.out.println(calculator.subtraction(firstNumber,secondNumber));
		System.out.println(calculator.divide(firstNumber,secondNumber));
		System.out.println(calculator.multiplication(firstNumber,secondNumber));
	}

}
