//start
//Using a do while loop, print numbers from 1 to 41
//Determine the odd numbers amongst them using the modulo operator
//Print the odd numbers


public class QuestionThirtyFive{
	public static void main(String[] args){

	int counter = 1;
	int number = 5;
	int product = 1;
	do{ 
	System.out.printf("%d x %d = %d%n", counter, number, product);
	product = counter * number;
		++counter;} 
	  while (counter <= 12);
	System.out.println();	
		

	}

}