//Write a program that collects a user's name and age, if the user is older than 18, adult, if less, a child

//start
//Prompt user to input name
//Prompt the user to input age
//Determine if the age is that of an adult or a child using if statement
//Print result


import java.util.Scanner;
public class NameandAge{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter name: ");
	String name = input.nextLine();

	System.out.print("Enter age: ");
	int age = input.nextInt();

	//input.nextLine();

	System.out.print("Enter friends name: ");
	String friend = input.next();

	if(age > 18){
	System.out.printf("%s is an adult", name);}

	else {
	System.out.printf("%s is a child", name);}

		}

	}