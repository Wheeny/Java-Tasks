//start
//check for the multiples of 3 amongst the numbers between 1-30
//Calculate their sum
//Print their sum

public class DivisibleByThree{
	public static void main(String [] args){

	int sum = 0;
	for(int index = 1; index <= 30; index++){
		if(index % 3 == 0){
			System.out.println(index);
	sum += index;

	}

		}
	System.out.println();
	System.out.println("Sum: " + sum);
	}

}

