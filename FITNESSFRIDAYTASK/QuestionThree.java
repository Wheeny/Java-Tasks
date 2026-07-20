import java.util.Scanner;
public class QuestionThree{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	int count = 0;
	int positiveCounter = 0;
	int negativeCounter = 0;
	int largest = 0;
        while (count < 10) {
            System.out.print("Enter integer " + (count+=1) + ": ");
            int number = input.nextInt();
		if(number > 0){
			positiveCounter++;}
		if(number < 0){
			negativeCounter++;}
		if(number > largest){
			largest = number;}

	}

	System.out.println("Count of Positive Values  "+ positiveCounter);
	System.out.println("Count of Negative Values  "+ negativeCounter);
	System.out.println("Largest  "+ largest);

}

}

