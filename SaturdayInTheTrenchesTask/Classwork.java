//start
//Prompt user to input Destination
//Prompt user to input Total Distance
//Prompt user to input Fuel price per litre
//Prompt user to input Fuel Efficiency(mileage)
//Calculate the quantity of Fuel needed : total distance/car's mileage
//Calculate the total cost needed : quantity of fuel needed *  fuel price
//Calculate the split cost: Total cost/2


import java.util.Scanner;
public class ClassWork{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter Destination: ");
	String Destination = inputCollector.nextLine();

	System.out.print("Enter Total Distance: ");
	double distance = inputCollector.nextInt();

	System.out.print("Enter Fuel Price per litre: ");
	float fuelPrice = inputCollector.nextInt();

	System.out.print("Enter car's mileage: ");
	double mileage = inputCollector.nextInt();


	double fuelQuantity = distance/mileage;
	double totalCost = fuelQuantity * fuelPrice;
	double splitCost = totalCost/2;

	System.out.printf("The fuel quantity needed to go to %s is %.5f litres%n", Destination, fuelQuantity);
	
	System.out.printf("The total cost needed to go to %s is %.2f naira%n", Destination, totalCost);

	System.out.printf("The Split Cost for the trip for 2 people is %.2f naira%n", splitCost);

	}

}


