/*
	public class WhileLoopSum{
	public static void main(String[] args){
	
	int sum = 0;
	int index = 80;

	while(index <= 100){
		System.out.println(sum);
		sum += index;
		index++;

	}
	}

}*/



import java.util.Scanner;
public class WhileLoopSum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer(starting point of the sum): ");
	int startNumber = input.nextInt();

		System.out.print("Enter an integer(ending point of the sum): ");
	int endNumber = input.nextInt();
	
	int sum = 0;
	int index = startNumber;
	while(index <= endNumber){
		System.out.printf("%d + %d = %d%n", index,sum,(sum += index));
		sum += index;
		index++;

	}
	}

}