//start
//Using a do while loop, prompt the user to keep entering grades
//break the loop once the number -1 is inputted


import java.util.Scanner;
public class QuestionFourty{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int count = 0;
	int number = 0;
	int sum = 0;

	do{ 
	System.out.print("Enter an integer: ");
	number = input.nextInt();
	sum += number;
		++count;}
	  while (count<=5);

	System.out.println("SUM: " + sum);
	
		}

	}