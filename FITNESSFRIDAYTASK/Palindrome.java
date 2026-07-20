//start
//prompt user to input five digit integer
//check if it is a five digit integer
//give an error message if it is not
//if it is, check if it is a palindrome
//print if it is a palindrome


import java.util.Scanner;
public class Palindrome{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a five-digit integer: ");
	int number = input.nextInt();

	if(number < 10000 && number > 99999){
	System.out.println("Not a valid five-digit integer"); }

	else if(number > 10000 && number < 99999){
		int fifthDigit = number % 10;
		int fourthDigit = (number/10) % 10;
		int thirdDigit = (number/100) % 10;
		int secondDigit = (number/1000) % 10;
		int firstDigit = (number/10000) % 10;

		if(fifthDigit == firstDigit && fourthDigit == secondDigit){
		System.out.println("It is a palindrome");}
	else {System.out.println("It is not a palindrome");}
	}

		

	}

}