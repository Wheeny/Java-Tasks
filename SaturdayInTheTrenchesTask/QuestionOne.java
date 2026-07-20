//start
//Prompt the user to enter the first integer
//Read the first integer
//Prompt the user to enter the second integer
//Read the second integer
//Calculate the cube of the first integer
//Print cube of the first integer
//Calculate the cube of the second integer
//Print cube of the second integer
//Calculate the product of both cubes
//Print the product of both cubes
//Determine which is the largest and which is the smallest
//Calculate the remainder



//start
import java.util.Scanner;
public class QuestionOne{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

//Prompt the user to enter the first integer
	System.out.print("Enter first integer: ");

//Read the first integer
	int num1 = inputCollector.nextInt();

//Prompt the user to enter the second integer
	System.out.print("Enter second integer: ");

//Read the second integer
	int num2 = inputCollector.nextInt();

//Calculate the cube of the first integer
	int num1cube = num1 * num1 * num1;

//Print cube of the first integer
	System.out.println(num1cube);

//Calculate the cube of the second integer
	int num2cube = num2 * num2 * num2;

//Print cube of the second integer
	System.out.println(num2cube);

//Calculate the product of both cubes
	int cubeproduct = num1cube * num2cube;

//Print the product of both cubes
	System.out.println(cubeproduct);

//Determine which is the largest and which is the smallest
	if(num1 > num2){
	System.out.println(num1 + " is the largest and " + num2 + " is the smallest");} 
else { System.out.println(num2 + " is the largest and " + num1 + " is the smallest");} 

//Calculate the remainder
	System.out.println(num2 % num1);

	
	}

}

	