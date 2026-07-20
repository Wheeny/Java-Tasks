//start
//Prompt the user to input hours worked
//Prompt the user to input hourly rate
//Prompt the user to input Bonus
//Calculate the Gross Pay
//Calculate the Tax Amount
//Calculate the Net Pay
///Display all three


import java.util.Scanner;
	public class TaxRate{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter hoursWorked: ");
	double hoursWorked = inputCollector.nextDouble();

	System.out.print("Enter hourlyRate: ");
	double hourlyRate = inputCollector.nextDouble();

	System.out.print("Enter taxRate: ");
	double taxRate = inputCollector.nextDouble();

	System.out.print("Enter Bonus consumed: ");
	double Bonus = inputCollector.nextDouble();

	double grossPay = (hourlyRate * hoursWorked) + Bonus;
	double taxAmount = (grossPay * taxRate)/100;
	double netPay = grossPay - taxAmount;

	System.out.printf("Gross Pay : %.2f%n", grossPay);
	System.out.printf("Net Pay : %.2f%n", netPay);

	}

}

	

	