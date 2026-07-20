import java.util.Scanner;
public class numberFactors{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter a number: ");
	int number = input.nextInt();

	int count = 1; 
	while(count<=number){ 
		if( number%count == 0){
		System.out.printf("Factors of %d: %d%n", number, count);}
	count++; }


		}

	}