//start
//Prompt user to input weight in pounds
//Calculate the conversion of pounds to killogram
//Print result


import java.util.Scanner;
public class PoundsToKilograms{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter weight in pounds:  ");
	double weightPounds = input.nextDouble();

	double weightKilograms = weightPounds * 0.454;

	System.out.printf("Weight in kilograms is: %.3f%n", weightKilograms);

	}

}