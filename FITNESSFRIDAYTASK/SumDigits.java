//start
//Prompt user to input an integer between 0 and 1000
//Using modulo operator, extract the digits in the in the integer
//Calculate the sum of all the digits in the integer
//Print the sum


import java.util.Scanner;
public class SumDigits{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter an integer between 0 and 1000:  ");
	int number = input.nextInt();

	int fourthDigit = number % 10;
	int thirdDigit = (number/10) % 10;
	int secondDigit = (number/100) % 10;
	int firstDigit = (number/1000) % 10;

	int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

	System.out.println("Sum : " + sum);

	}

}
	
	
	
	
