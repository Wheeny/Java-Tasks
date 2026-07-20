//start
//Prompt user to input an integer between 1 and 10
//Return an error message if integer above 10 is inputed
//If not, create a nested loop to print the asteriks the number of inputed integer times.
//Print the result

import java.util.Scanner;
public class RightAngledTriangle{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer between 1 and 10: ");
	int number = input.nextInt();

	if(number <1 || number>10){
		System.out.print("Invalid Input: Enter an integer between 1 and 10");}
	else{
	for (int count = 1; count <= number; count++){

	System.out.println();
		
		for(int counter = 1 ; counter <= count; counter++){
			System.out.print("*");}}}

	

	}

}