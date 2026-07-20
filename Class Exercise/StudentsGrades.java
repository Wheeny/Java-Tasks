import java.util.Scanner;
public class StudentsGrades{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int count = 1;

	int countA = 0;
	int countB = 0;
	int countC = 0;
	int countF = 0;
	/*int counta = 0;
	int countb = 0;
	int countc = 0;*/

	System.out.printf("Number of students: Enter integer: ");
	int NumberOfStudents = input.nextInt();
	
	while(count <= NumberOfStudents){


		System.out.printf("Student %s: Enter Name: ", count);
		String StudentOneName  = input.next();

		input.nextLine();

		System.out.printf("Student %s: Enter Grade: ", StudentOneName);
		String StudentOneGrade  = input.next().toUpperCase();
		
			switch(StudentOneGrade){
			case "A": System.out.println("Excellent"); countA++; break;
			case "B": System.out.println("Average"); countB++; break;
			case "C": System.out.println("Poor"); countC++; break;
			case "F": System.out.println("Fail"); countF++; break;
			/*case "a": counta++; break;
			case "b": countb++; break;
			case "c": countc++; break;*/
			default: System.out.println("Invalid Input");
					} 

 			count++;}	

	/*int TotalA = countA++ + counta++;
	int TotalB = countB++ + countb++;
	int TotalC = countC++ + countc++;

	System.out.println();

	System.out.println("Total A's:" + TotalA);
	System.out.println("Total B's:" + TotalB);
	System.out.println("Total C's:" + TotalC);*/



	System.out.println();

	System.out.println("*******Grade Summary******");
	System.out.println("Total A's:" + countA++ + " passed with Excellence");
	System.out.println("Total B's:" + countB++ + " had Average scores");
	System.out.println("Total C's:" + countC++ + " had poor scores");
	System.out.println("Total F's:" + countF++ + " failed");




			}

	}	


