//start
//Using a while loop,print the multiplication table of 12
//Print the results


public class QuestionTwenty{
	public static void main(String[] args){

	int count = 1;
	int number = 12;
	int product = 1;

	while(count <= 12){
	product = count * number;
	count++;
	System.out.printf("%d x %d = %d%n", count, number, product);
		}


	}

}