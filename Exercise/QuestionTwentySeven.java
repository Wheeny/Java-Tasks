//start
//Collect inputs from user  using a loop(e.g 5 times)
//Inside the loop, check for the largest number
//Print the result


import java.util.Scanner;
public class QuestionTwentySeven{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int count = 0;
	int largest = 0;
        while (count < 5) {
            System.out.print("Enter integer " + (count+=1) + ": ");
            int number = input.nextInt();
		if(number > largest){
			largest = number;}

	}

	System.out.println("Largest  "+ largest);

}

}

