//start
//Prompt user to input sub total
//Prompt user to input gratuity rate
//Calculate Gratuity
//Calculate total
//Print both


import java.util.Scanner;
public class GratuityAndTotal{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter sub total:  ");
	int subTotal = input.nextInt();

	System.out.println("Enter gratuity rate:  ");
	int gratuityRate = input.nextInt();

	int Gratuity = (gratuityRate/100) * subTotal;
	int Total = Gratuity + subTotal;

	System.out.println("Gratuity: " + Gratuity);
	System.out.println("Total: " + Total);

	}

}
