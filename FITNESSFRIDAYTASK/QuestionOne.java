//start
//Collect numbers from a user using a loop (e.g 5 times)
//Determine the largest number
//Print the largest number

import java.util.Scanner;
public class QuestionTwentySeven2{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int count = 0;
	int largest = 0;
        while (count < 10) {
            System.out.print("Enter integer " + (count+=1) + ": ");
            int number = input.nextInt();
		if(number > largest){
			largest = number;}

	}

	System.out.println("Largest  "+ largest);

}

}

