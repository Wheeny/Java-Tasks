//start
//Using a while loop, prompt the user to keep entering numbers
//Terminate the loop when the enter the number 0
//Print the results


import java.util.Scanner;
public class QuestionTwentyTwo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int count = 1;
	while(count <= 100000){
	System.out.print("Enter any integer except 0: ");
	int number = input.nextInt();

		if(number == 0){
		break;}
		}


	}

}