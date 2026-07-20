import java.util.Scanner;
public class largestNumber{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = input.nextInt();	

	int count = 1;
	int largest = 0;
	int largestCount = 0;
        while (number != 0) {
            System.out.print("Enter integer: ");
            number = input.nextInt();
		if(number > largest){
			largest = number;
		largestCount++;}
	count++;
	}

	System.out.println("Largest  "+ largest);
	System.out.println("Largest occurs  "+ largestCount + " times");

}

}

