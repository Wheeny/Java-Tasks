//start
//Using a do while loop, prompt the user to keep entering positive numbers
//break the loop once a negative number is inputted


import java.util.Scanner;
public class QuestionThirtySix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int count = 0;
	int number = 0;

	do{ if(number < 0){
		break;}
	System.out.print("Enter any positive integer: ");
	number = input.nextInt();
		++count;}
	  while (count>0);
	
		}

	}