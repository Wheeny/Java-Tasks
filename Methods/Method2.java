public class Method2{
	public static void main(String[] args){
		int multiplicationResult = multiply(10, 5);
		int divisionResult = divide(12, 7);
		System.out.println(multiplicationResult);
		System.out.println(divisionResult);
		

}

public static int multiply(int a, int b){
	int multiplication = a * b;
	return multiplication;

}


public static int divide(int a, int b){
	int division = a / b;
	return division;
}

}