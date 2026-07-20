import java.util.Scanner;
public class Question225 {
	public static void main (String[] args) {

	Scanner inputCollector =  new Scanner(System.in);
	System.out.print("Enter an integer: ");
 	int num = inputCollector.nextInt();
        
	if(num % 3 == 0) {
	System.out.println(num + " is divisible by 3");
	} else{
	System.out.println(num + " is not divisble by 3");
	}

    }

}
	
	