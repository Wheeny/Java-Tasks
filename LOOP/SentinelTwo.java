import java.util.Scanner;

public class SentinelTwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 1;
		int score = 0;
		while(count <= 5){
			System.out.print("Enter score " + count + ": ");
			score = input.nextInt();
			sum += score;
			count++;
			
		}
		
		System.out.printf("The sum of values is: %d%n", sum);

			
	}
}