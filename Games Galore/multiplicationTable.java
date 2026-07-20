public class multiplicationTable{
	public static void main(String[] args){
	
	int number= 5;
	int lastDigit= 12;

	for(int index = 1; index <= lastDigit; index++){
	int product = index*number;
	System.out.printf("%d x %d = %d%n",  index, number, product);
		}

	}

}