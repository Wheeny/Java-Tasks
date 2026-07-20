//start
//Prompt the user to input 5 numbers
//Calculate the sum of the numbers(total)
//Print the results


import java.util.Scanner;
public class QuestionTwentyOne{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	

	double sum = 0;
	double count = 1;

	while(count <= 5){
	System.out.print("Enter number: ");
	double number = input.nextDouble();
	sum += number;
	count++;
	
		}
	System.out.printf("Total: %.3f%n", sum);


	}

}