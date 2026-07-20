//start
import java.util.Scanner;
public class QuestionSeven{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
//Prompt the user to input first integer
	System.out.print("Enter first integer: ");
	int num1 = inputCollector.nextInt();

//Prompt the user to input second integer
	System.out.print("Enter second integer: ");
	int num2 = inputCollector.nextInt();

//Calculate the square of the first integer
	int num1square = num1*num1;

//Print the square
	System.out.println(num1square);

//Calculate the cube of the second integer
	int num2cube = num2*num2*num2;

//Print the cube
	System.out.println(num2cube);

//Determine if num2 is a multiple of num1

	if(num2cube % num1square == 0){
	System.out.println(num2 + " is a multiple  of num1");}

	else {
	System.out.println(num2 + " is not a multiple of num1");}


	}

}




	
