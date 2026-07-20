//start
//Prompt user to input starting velocity in meters per second
//Prompt user to input ending velocity in meters per second
//Prompt user to input time span in seconds
//Calculate the average acceleration
//Print the average acceleration


import java.util.Scanner;
public class Acceleration{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter starting velocity in meters per second: ");
	double startingVelocity = input.nextDouble();
	System.out.println("Enter ending velocity in meters per second: ");
	double endingVelocity = input.nextDouble();
	System.out.println("Enter time span in seconds: ");
	double timeSpan = input.nextDouble();

	double averageAcceleration = (endingVelocity - startingVelocity)/timeSpan;

	System.out.printf("Average acceleration: %.3f%n" , averageAcceleration);

	}

}
 

