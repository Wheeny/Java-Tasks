//start
//Prompt the user to input principal in km
//Prompt the user to input rate
//Prompt the user to input time
//Calculate the Simple Interest
//Calculate the Total Amount
///Display both


import java.util.Scanner;
	public class simpleInterest{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter principal: ");
	double principal = inputCollector.nextInt();

	System.out.print("Enter rate: ");
	double rate = inputCollector.nextInt();
	
	System.out.print("Enter time: ");
	double time = inputCollector.nextInt();

	double simpleInterest = (principal * rate * time)/100;

	System.out.printf("Simple Interest : %.2f%n", simpleInterest);

	}

}

	

	