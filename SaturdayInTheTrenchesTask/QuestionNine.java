//start
//Prompt the user to input first integer
//Prompt the user to input second integer
//Prompt the user to input third integer
//Seperate the numbers into individual digits using integer division and remainder
//Print each digit on each line separated by 3 spaces


import java.util.Scanner;
public class QuestionNine{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter a four-digit integer: ");
	int num = inputCollector.nextInt();

	int firstdigit = num/1000%10;
	int seconddigit = num/100%10;
	int thirddigit = num/10%10;
	int fourthdigit = num%10;

	System.out.printf("Result:  %d   %d   %d   %d", firstdigit, 	seconddigit, thirddigit, fourthdigit);

	}

}