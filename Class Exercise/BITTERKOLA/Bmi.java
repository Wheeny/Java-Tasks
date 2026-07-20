//start
//Prompt the user to input weight in kgs
//Prompt the user to input height in meters
//Calculate the BMI
///Display BMI


import java.util.Scanner;
	public class Bmi{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter weight in kgs: ");
	double weight = inputCollector.nextDouble();

	System.out.print("Enter height in meters: ");
	double height = inputCollector.nextDouble();

	double Bmi = weight/(height * height);

	System.out.printf("BMI : %.2f%n", Bmi);

	}

}

	

	