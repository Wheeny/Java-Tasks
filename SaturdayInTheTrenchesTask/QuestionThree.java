//start
import java.util.Scanner;
public class QuestionThree{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
//Prompt the user to input first integer
	System.out.print("Enter first integer: ");
	int num1 = inputCollector.nextInt();

	
//Prompt the user to input second integer
	System.out.print("Enter second integer: ");
	int num2 = inputCollector.nextInt();
	
//Prompt the user to input third integer
	System.out.print("Enter third integer: ");
	int num3 = inputCollector.nextInt();
	
//Prompt the user to input fourth integer
	System.out.print("Enter fourth integer: ");
	int num4 = inputCollector.nextInt();

//Calculate the sum of the integers
	int sum = num1 + num2 + num3 + num4;

//Print the sum
	System.out.println(sum);

//Calculate the average of the integers
	int average = (num1 + num2 + num3 + num4)/4;

//Print the average
	System.out.println(average);
	
//Calculate the product of the integers
	int product = num1 * num2 * num3 * num4;

//Print the product
	System.out.println(product);

//Determine the largest numbers
if(num1>num2 && num1>num3 && num1>num4){
	System.out.println(num1 + " is the largest");}

	else if(num2>num1 && num2>num3 && num2>num4){
	System.out.println(num2 + " is the largest");}

	else if(num3>num1 && num3>num2 && num3>num4){
	System.out.println(num3 + " is the largest");}

	else if(num4>num1 && num4>num2 && num4>num3){
	System.out.println(num2 + " is the largest");}


//Determine the smallest numbers 

if(num1<num2 && num1<num3 && num1<num4){
	System.out.println(num1 + " is the smallest");}

	else if(num2<num1 && num2<num3 && num2<num4){
	System.out.println(num2 + " is the smallest");}

	else if(num3<num1 && num3<num2 && num3<num4){
	System.out.println(num3 + " is the smallest");}

	else if(num4<num1 && num4<num2 && num4<num3){
	System.out.println(num4 + " is the smallest");}

	}

}







	
