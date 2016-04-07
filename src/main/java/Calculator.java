import java.text.DecimalFormat;

public class Calculator {
	double result;
	DecimalFormat df= new DecimalFormat("#.0");
	
	public double addition(double firstValue, double secondValue){
		result = firstValue + secondValue;
		df.format(result);
		System.out.println(result);
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
	
}	/*public String toString(){
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
