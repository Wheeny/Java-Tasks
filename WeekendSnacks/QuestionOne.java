import java.util.Scanner;
public class QuestionOne{
	public static void main(String[] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter your age: ");
	int age = inputCollector.nextInt();

	int agenxtyr = ++age;
	
	System.out.print(agenxtyr);


	}

}