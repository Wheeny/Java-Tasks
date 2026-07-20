import java.util.Scanner; 
public class sentinelLoop{   

	public static void main(String... args){
	Scanner inputCollector = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = inputCollector.nextInt();

int count = 0;
double sum = 0;
sum = sum + number;


while(number>=0){
System.out.print("Enter a number: ");
number = inputCollector.nextInt();
count++;
	if(number<=0){
	System.out.print("Invalid Input"); break;}
	
sum = sum + number;}

double average = sum/(count);

System.out.println("Sum: " +  sum);

System.out.println("Average: " +  average);



}

	}