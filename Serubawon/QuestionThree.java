//start
//Collect temperature input in Celcius
//Calculate the CONVERSION TO Fahrenheit
//Print the result


import java.util.Scanner;
public class QuestionThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter temperature in Celcius: ");
	double temp = input.nextDouble();

	double tempFahrenheit = (temp * 9/5) + 32;

	System.out.printf("Temperature in Fahrenheit: %.2fF", tempFahrenheit);

		}

	}
