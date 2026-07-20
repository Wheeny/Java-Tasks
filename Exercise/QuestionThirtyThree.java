//start
//Using a do while loop, print numbers from 2 to 40
//Determine the even numbers amongst them using the modulo operator
//Print the even numbers


public class QuestionThirtyThree{
	public static void main(String[] args){

	int counter = 2;

	do{ if (counter % 2 == 0){
	System.out.println(counter);}
		++counter;} 
	  while (counter <= 40);	
		System.out.println();

	}

}