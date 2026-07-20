import java.util.Scanner;
public class Question217 {
	public static void main (String [] args) {
	
	Scanner inputter = new Scanner(System.in);
	System.out.print("Enter first integer: ");
	int num1 = inputter.nextInt();

	System.out.print("Enter second integer: ");
	int num2 = inputter.nextInt();

	System.out.print("Enter third integer: ");
	int num3 = inputter.nextInt();

	int sum = num1+num2+num3;
	System.out.println("Sum = " + sum);
	int product = num1*num2*num3;
	System.out.println("Product = " + product);
	int average =(num1+num2+num3)/3;
	System.out.println("Average = " + average);

	if(num1>num2 && num1>num3) {
	System.out.println(num1 + " is the largest");
	}

	if(num2>num3 && num2>num1) {
	System.out.println(num2 + " is the largest");
	}

	if(num3>num1 && num3>num2) {
	System.out.println(num2 + " is the largest");
	}

	if(num1<num2 && num1<num3) {
	System.out.println(num1 + " is the smallest");
	}

	if(num2<num3 && num2<num1) {
	System.out.println(num2 + " is the smallest");
	}

	if(num3<num1 && num3<num2) {
	System.out.println(num2 + " is the smallest");
	}

        }

}
	