import java.util.Scanner;
public class QuestionEight{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Radius: ");
	double radius =  input.nextDouble();

	double area = 3.14 * (radius*radius); 

	System.out.printf("Area of the circle is : %.2f%n", area);

		}

	}