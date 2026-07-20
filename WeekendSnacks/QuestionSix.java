import java.util.Scanner;
public class QuestionSix{
	public static void main(String [] args){
	Scanner inputCollector = new Scanner(System.in);
		
	System.out.print("Enter PrincipalAmt: ");
	double PrincipalAmt = inputCollector.nextInt();

	System.out.print("Enter rate: ");
	double rate = inputCollector.nextInt();

	System.out.print("Enter time: ");
	double time = inputCollector.nextInt();

	double SimpleInterest = (PrincipalAmt * rate * time)/100;
	System.out.println(SimpleInterest);
	

	}

}
	
