//start
//Prompt the user to input the value of the sideA of the triangle
//Prompt the user to input the value of the sideB of the triangle
//Prompt the user to input the value of the sideC of the triangle
//Prompt the user to input the value of the height of the triangle
//Calculate and print the perimeter of the triangle 
//Calculate and print the area of the triangle 


import java.util.Scanner;
public class QuestionFour{
	public static void main(String [] args){	
	Scanner inputCollector = new Scanner (System.in);
	
	System.out.print("Enter sideA: ");
	double sideA = inputCollector.nextInt();

	System.out.print("Enter sideB: ");
	double sideB = inputCollector.nextInt();

	System.out.print("Enter sideC: ");
	double sideC = inputCollector.nextInt();

	System.out.print("Enter height: ");
	double height = inputCollector.nextInt();

	System.out.printf("Area : %.2f%n", 0.5*(sideB*height));
	System.out.printf("Perimeter : %.2f%n", sideA + sideB + sideC );

	}

}