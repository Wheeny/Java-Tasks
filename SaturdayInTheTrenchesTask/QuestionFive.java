//start
import java.util.Scanner;
public class QuestionFive{
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

//Prompt the user to input fifth integer
	System.out.print("Enter fifth integer: ");
	int num5 = inputCollector.nextInt();

//Prompt the user to input sixth integer
	System.out.print("Enter sixth integer: ");
	int num6 = inputCollector.nextInt();

//Determine the largest numbers
	if(num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6){
	System.out.println(num1 + " is the largest");}

	else if(num2>num1 && num2>num3 && num2>num4 && num1>num5 	&& num1>num6){
	System.out.println(num2 + " is the largest");}

	else if(num3>num1 && num3>num2 && num3>num4 && num1>num5 	&& num1>num6){
	System.out.println(num3 + " is the largest");}

	else if(num4>num1 && num4>num2 && num4>num3 && num1>num5 	&& num1>num6){
	System.out.println(num4 + " is the largest");}

	else if(num5>num1 && num5>num2 && num5>num3 && num5>num4 	&& num5>num6){
	System.out.println(num5 + " is the largest");}

	else if(num6>num1 && num6>num2 && num6>num3 && num6>num4 	&& num6>num5){
	System.out.println(num6 + " is the largest");}


//Determine the smallest numbers 

	if(num1<num2 && num1<num3 && num1<num4 && num1<num5 && 	num1<num6){
	System.out.println(num1 + " is the smallest");}

	else if(num2<num1 && num2<num3 && num2<num4 && num2<num5 	&& num2<num6){
	System.out.println(num2 + " is the smallest");}

	else if(num3<num1 && num3<num2 && num3<num4 && num3<num5 	&& num3<num6){
	System.out.println(num3 + " is the smallest");}

	else if(num4<num1 && num4<num2 && num4<num3 && num4<num5 	&& num4<num6){
	System.out.println(num4 + " is the smallest");}

	else if(num5<num1 && num5<num2 && num5<num3 && num5<num4 	&& num5<num6){
	System.out.println(num5 + " is the smallest");}

	else if(num6<num1 && num6<num2 && num6<num3 && num6<num4 	&& num6<num5){
	System.out.println(num6 + " is the smallest");}

	}

}







	
