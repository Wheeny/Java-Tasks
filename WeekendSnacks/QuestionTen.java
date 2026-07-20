import java.util.Scanner;
public class QuestionTen{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int num = inputCollector.nextInt();

	int numsquare = num*num;
	System.out.println("Square: " + numsquare);

	int numcube = num*num*num;
	System.out.println("Cube: " + numcube);

	}

}

	