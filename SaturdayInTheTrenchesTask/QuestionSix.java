//start
import java.util.Scanner;
public class QuestionSix{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
//Prompt the user to input an integer
	System.out.print("Enter an integer: ");
	int num = inputCollector.nextInt();

//Determine tif it is divisible by 7, not divisble by 7 or equal to 0
	if(num == 0){
	System.out.println(num + " is equal to 0");}

	else if(num % 7 == 0){
	System.out.println(num + " is divisible by 7");}

	else {
	System.out.println(num + " is not divisible by 7");}

//Determine if it is an even or odd number
	if(num % 2 == 0){
	System.out.println(num + " is an even number");}

	else {
	System.out.println(num + " is not an even number");}

	}

}







	
