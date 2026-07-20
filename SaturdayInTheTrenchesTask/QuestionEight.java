import java.util.Scanner;
public class QuestionEight{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);

	System.out.print("Enter length: ");
	int length = inputCollector.nextInt();
	System.out.print("Enter width: ");
	int width = inputCollector.nextInt();

	System.out.printf("perimeter: %d%n", 2 * (length + width));
	System.out.printf("Area:  %d%n" , length * width);
	System.out.printf("Diagonal: %f%n", 1.41421 * ((length*length) + (width*width)));

	}

}
   


	

	

