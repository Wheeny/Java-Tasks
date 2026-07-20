import java.util.Scanner;
	public class javac Question226again {
	Scanner inputCollector= new Scanner(System.in);

	System.out.print("Enter first integer: "); 
	int num1 = inputCollector.nextInt();
	
	System.out.print("Enter second integer: "); 
	int num2 = inputCollector.nextInt();	
	int triplenum1 = num1*3
	int doublenum2 = num2*2
	int multiple = triplenum1 % doublenum2

	if(multiple == 0){
	System.out.println(num1 + " is a multiple of " +  	num2);
	}else {
	System.out.print(num1 + " is not a multiple of " +  	num2);
	}

     }

}
