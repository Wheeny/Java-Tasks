//start
//Prompt the user to input two numbers
//Calculate their sum
//Calculate their difference
//Calculate their product
//Calculate their quotient
//Print each result on a separate line


import java.util.Scanner;
public class QuestionSix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	double firstNumber = input.nextDouble();

	System.out.print("Enter another number: ");
	double secondNumber = input.nextDouble();

	double sum = firstNumber + secondNumber;
	double difference = firstNumber - secondNumber;
	double product = firstNumber * secondNumber;
	double quotient = firstNumber / secondNumber;

	System.out.printf("Sum: %.2f%n", sum); 
	System.out.printf("Difference: %.2f%n", difference);
	System.out.printf("Product: %.2f%n", product);
	System.out.printf("Quotient: %.2f%n", quotient);  

		}

	}