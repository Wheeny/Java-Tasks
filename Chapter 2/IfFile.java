import java.util.Scanner;
public class IfFile{
	public static void main (String [] args) {

	Scanner inputCollector = new Scanner (System.in);
	
	System.out.print("Enter your age: ");
	int age = inputCollector.nextInt();

	if (age < 13){
		System.out.print("You are a child");
	}	
	if (age >= 13 && age <= 20){
		System.out.print("You are a teenager");
	}

	if (age > 20){
		System.out.print("You are an adult");
	}
	

}
	
}
