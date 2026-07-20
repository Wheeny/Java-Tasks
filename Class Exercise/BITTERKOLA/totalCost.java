//start
//Prompt the user to input units consumed
//Prompt the user to input cost per unit
//Calculate the Total Cost
///Display Total Cost


import java.util.Scanner;
	public class ElectricityBill{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter units consumed: ");
	double units = inputCollector.nextDouble();

	System.out.print("Enter cost per unit: ");
	double cost = inputCollector.nextDouble();

	double totalCost = units * cost;

	System.out.printf("Total Cost : %.2f%n", totalCost);

	}

}

	

	