//start
//Initialize days of the week variable
//Calculate the day of the week it would be from that day using the inputed integer
//Print the result


import java.util.Scanner;
public class DayofTheWeek{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an integer as number of days: ");
	int numberOfDays = input.nextInt();
	
	int DaysInAWeek = 7;

	int calc = numberOfDays % DaysInAWeek;

	if ( calc == 1){
	System.out.print("Thursday");}
	
	else if ( calc == 2){
	System.out.printf("It would be Friday in %d%n days time", numberOfDays);}

	else if ( calc == 3){
	System.out.printf("It would be Saturday in %d%n days time", numberOfDays);}

	else if ( calc == 4){
	System.out.printf("It would be Sunday in %d%n days time", numberOfDays);}

	else if ( calc == 5){
	System.out.printf("It would be Monday in %d%n days time", numberOfDays);}

	else if ( calc == 6){
	System.out.printf("It would be Tuesday in %d%n days time", numberOfDays);}

	else if ( calc == 0){
	System.out.printf("It would be Wednesday in %d%n days time", numberOfDays);}


	}

}	
	