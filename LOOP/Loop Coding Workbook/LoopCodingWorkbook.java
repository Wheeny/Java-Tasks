//Question 1

//forLoop
/*public class LoopCodingWorkbook {
	public static void main(String[] args){

	for(int i = 1; i<=5; i++){
	System.out.println("Hello");}

	}

}
*/

//whileLoop
/*public class LoopCodingWorkbook {
	public static void main(String[] args){

	int i = 1;
	while(i<=5){
	System.out.println("Hello");
	i++;}

	}

}*/


//Question 2

//forLoop
/*public class LoopCodingWorkbook{
	public static void main(String[] args){
	
	for(int i = 1; i <= 10; i++){
	System.out.println(i);}

	}

} */

//whileLoop
/*public class LoopCodingWorkbook{
	public static void main(String[] args){

	int i = 1;
	while(i <= 10){
	System.out.println(i);
	i++;}

	}

} */


//Question 3
//forLoop

/*public class LoopCodingWorkbook{
	public static void main(String[] args){

	for(int i = 10; i >=1; i--){
	System.out.println(i);}

	System.out.println(" \"Blastoff!\" ");
	}

} */

//whileLoop
/*public class LoopCodingWorkbook{
	public static void main(String[] args){

	int i = 10;
	while(i >= 1){
	System.out.println(i);
	i--;}
	System.out.println(" \"Blastoff\"! ");

	}

} 
*/
	

//Question 4
//forLoop

/*public class LoopCodingWorkbook{
	public static void main(String[] args){

	for(int i = 5; i<= 50; i+=5){
		if(i % 5 == 0){
			System.out.println(i);}
		}

	}

} */


//whileLoop
/*public class LoopCodingWorkbook{
	public static void main(String[] args){

	int i = 5;
	while(i <= 50){
		if( i % 5 == 0){
			System.out.println(i);}
	i+=5;}

	}

} */


//Question 9
//forLoop

/* public class LoopCodingWorkbook{
	public static void main(String[] args){

	int product = 1;
	for(int i = 5; i>=1; i--){
	product *= i;
	System.out.println(product);
			}

	}

} */


/*import java.util.Scanner;
public class LoopCodingWorkbook{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int i = 1;
	while(i <= 5){
	System.out.print("Enter an integer: ");
	int integer = input.nextInt();
	i++;}

	}

} */

//sentinel

/*import java.util.Scanner;
public class LoopCodingWorkbook{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int integer = 0;
	while(integer != 10){
	System.out.print("Enter an integer: ");
	integer = input.nextInt();
	}

	}
	
} */

//not a sentinel

import java.util.Scanner;
public class LoopCodingWorkbook{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int i = 1;
	while(i != 10){
	System.out.print("Enter an integer: ");
	int integer = input.nextInt();
	i++;
	}

	}
	
}
	


	