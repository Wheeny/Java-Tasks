
/*public class ForLoopProductTest{
	public static void main(String[] args){
	
	int number = 12;
	for(int index = 1; index <= 10; index++){
	//number *= index;
	int product = index * number;
	System.out.printf("%d x %d = %d%n", index, number, product);}

	}

}   
*/


import java.util.Scanner;
public class ForLoopProductTest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter any number for multiplication table: ");
	int number = input.nextInt();

	System.out.print("Enter the last number for the multiplication table: ");
	int lastdigit = input.nextInt();
	
	for(int index = 1; index <= lastdigit; index++){
	int product = index * number;
	System.out.printf("%d x %d = %d%n",  index, number, product);}

	
	}

}
