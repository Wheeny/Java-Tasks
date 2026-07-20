//start
//Prompt the user to input distance in km
//Prompt the user to input time in hours and minutes
//Convert time to hours
//Calculate the average speed in km

import java.util.Scanner;
	public class AverageSpeed{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter distance in km: ");
	double distance = inputCollector.nextInt();

	System.out.print("Enter time(hours): ");
	int hours = inputCollector.nextInt();
	
	System.out.print("Enter time(minutes): ");
	int minutes = inputCollector.nextInt();

	double timeHours = hours + (minutes/60);
	double averageSpeed = distance/timeHours;

	System.out.printf("Average Speed : %.2f%n", averageSpeed);

	}

}

	

	