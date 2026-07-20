import java.util.Scanner;
	public class QuestionNine{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter first name: ");
	String firstName = inputCollector.nextLine();
	
	System.out.print("Enter last name: ");
	String lastName = inputCollector.nextLine();

	System.out.print("Hello, " + firstName + " " + lastName);

	}

}