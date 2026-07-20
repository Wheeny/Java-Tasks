//start
//Using a do while loop, print numbers from 1 to 41
//Determine the odd numbers amongst them using the modulo operator
//Print the odd numbers


public class QuestionThirtyFour{
	public static void main(String[] args){

	int counter = 1;

	do{ if (counter % 2 != 0){
	System.out.println(counter);}
		++counter;} 
	  while (counter <= 41);	
		System.out.println();

	}

}