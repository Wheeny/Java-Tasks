//for loop

/* public class ForLoopSum{
	public static void main(String[] args){
	

	int sum = 0;
	for(int index = 10; index<= 20; index++){
		sum = sum + index;
	}

		System.out.print(sum);

	}
}
*/


import java.util.Scanner;
public class ForLoopSum{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number you want to sum from : ");
	int num = input.nextInt();

	System.out.print("Enter the number you want to sum from to: ");
	int num2 = input.nextInt();

	int sum = 0;
	for (int index = num; index <= num2; index++){
		sum += index;
		System.out.printf("%d + %d = %d%n", index, sum, (sum + index) );
	}

	}
}