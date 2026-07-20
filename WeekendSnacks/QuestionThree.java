import java.util.Scanner;
public class QuestionThree{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
	System.out.print("Enter temperature: ");
	double temp = inputCollector.nextInt();

	double tempC = temp - 273.15;
	System.out.println(tempC);
	
	double tempK = (temp - 273.15) * 9/5 + 32;
	System.out.println(tempK);

	}

}
	
