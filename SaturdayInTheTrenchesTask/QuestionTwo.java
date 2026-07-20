import java.util.Scanner;
public class QuestionTwo{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);

//Prompt the user to input an integer
	System.out.print("Enter an integer: ");

//Read the integer
	int num = inputCollector.nextInt();

//Calculate the cube of the integer
	int numcube =  num * num * num;

//Display the cube
	System.out.print(numcube);

//Display whether the number is greater than, less than or equal to 500
	if(num == 500){
	System.out.print( num + " is equal to 500");}
	else{
	
	if(num > 500) {
	System.out.print(num + " is greater than 500");}
	else{

	System.out.print(num + " is less than 500");}}

	}

}





