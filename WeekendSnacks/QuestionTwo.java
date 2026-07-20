//start
//Prompt the user to input first integer
//Prompt the user to input second integer
//Prompt the user to input third integer
//Calculate the total of the integers
//Print the total
//Calculate the average of the scores
//Print the average



import java.util.Scanner;
public class QuestionTwo{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
//Prompt the user to input first integer
	System.out.print("Enter first integer: ");
	int score1 = inputCollector.nextInt();

	
//Prompt the user to input second integer
	System.out.print("Enter second integer: ");
	int score2 = inputCollector.nextInt();
	
//Prompt the user to input third integer
	System.out.print("Enter third integer: ");
	int score3 = inputCollector.nextInt();

//Calculate the total of the integers
	int total = score1 + score2 + score3;

//Print the total
	System.out.println(total);

//Calculate the average of the scores
	int average = (score1 + score2 + score3)/3;

//Print the average
	System.out.println(average);
	

	}

}







	
