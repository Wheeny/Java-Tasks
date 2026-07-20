//start
//initialize the correct password variable
//Using a while loop, prompt the user to input password
//Determine whether the password is correct or incorrect using an if statement in the while loop
//Print the results


import java.util.Scanner;
public class QuestionTwentyThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String correctPassword = "Winnie";
	int count = 1;

	while(count <= 10000){
	System.out.print(" Enter Password: ");
	String password = input.nextLine();
	
		if(password.equals(correctPassword)){
		System.out.println("Correct");
		break;
		}
		else { 
		System.out.println("Incorrect Password");
		}

	}

}
	
	
}
