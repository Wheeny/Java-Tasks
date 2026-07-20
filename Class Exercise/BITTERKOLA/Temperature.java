//start
//Prompt the user to input the temperature in Celcius
//Convert temperature to Farenheit


import java.util.Scanner;
	public class Temperature{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter temperature in Celcius: ");
	double temperatureCelcius = inputCollector.nextInt();

	double tempFarenheit = (temperatureCelcius * 1.8) + 32 ;

	System.out.printf("Temperature in Farenheit : %.2f%n", tempFarenheit);

	}

}

	

	