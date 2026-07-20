import java.util.Scanner;

public class Sentinel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int count = 1;
		while(count <= 5){
			System.out.print("Enter score " + count + ": ");
			int score = input.nextInt();
			System.out.printf("%d + %d = %d%n", score, sum, sum += score);
			//sum += score;
			count++;
		}
	}
}