//start
//Prompt user to input first name
//Prompt user to input last name
//Prompt user to input year of birth
//Calculate user's age in 2025 using user's year of birth
//Print a formatted profile of the user

import java.util.Scanner;
public class QuestionTen{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your first name: ");
	String firstName = input.nextLine();

	System.out.print("Enter your last name: ");
	String lastName = input.nextLine();

	System.out.print("Enter your year of birth: ");
	int birthYear = input.nextInt();

	int age = 2025 - birthYear;

	System.out.printf("Name: %s %s%nAge = %d%n.", firstName, lastName, age);

		}

	}


