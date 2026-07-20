//start
//Prompt user to input weight in kilograms
//Prompt user to input initial temperature in Celcius
//Prompt user to input final temperature in Celcius
//Calculate the energy needed to heat the water using the formula
//Print the energy


import java.util.Scanner;
public class CalculatingEnergy{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter weight in kilograms: ");
	double weight = input.nextDouble();
	System.out.println("Enter initial temperature in Celcius: ");
	double initialTemperature = input.nextDouble();
	System.out.println("Enter initial temperature in Celcius: ");
	double finalTemperature = input.nextDouble();

	double Energy = weight * (finalTemperature - initialTemperature) * 4184;

	System.out.printf("Energy needed: %.3f%n " , Energy);

	}

}