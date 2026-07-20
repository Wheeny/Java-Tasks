//start
//Prompt user to input the two points
//Calculate the distance for the 3 sides using the formula
//Calculate the area


import java.util.Scanner;
public class GeometryOne{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first integer: ");
	double x1 = input.nextInt();
 	System.out.println("Enter second integer: ");
	double x2 = input.nextInt();
 	System.out.println("Enter third integer: ");
	double y1 = input.nextInt();
 	System.out.println("Enter fourth integer: ");
	double y2 = input.nextInt();
 	System.out.println("Enter fifth integer: ");
	double x3 = input.nextInt();
 	System.out.println("Enter sixth integer: ");
	double y3 = input.nextInt();


	double DistanceX = Math.pow((x2-x1), 2);
	double DistanceY = Math.pow((y2-y1), 2);
	double AddedDistance = DistanceX + DistanceY;
	double DistanceOne = Math.pow(AddedDistance, 0.5);

	double DistanceXTwo = Math.pow((x3-x2), 2);
	double DistanceYTwo = Math.pow((y3-y2), 2);
	double AddedDistanceTwo = DistanceXTwo + DistanceYTwo;
	double DistanceTwo = Math.pow(AddedDistanceTwo, 0.5);

	double DistanceXThree = Math.pow((x3-x1), 2);
	double DistanceYThree = Math.pow((y3-y1), 2);
	double AddedDistanceThree = DistanceXThree + DistanceYThree;
	double DistanceThree = Math.pow(AddedDistanceThree, 0.5);

	double S = (DistanceOne + DistanceTwo + DistanceThree)/2;

	double product = (S-DistanceOne)*(S-DistanceTwo)*(S-DistanceThree);
	double productTwo = S*product;
	double area = Math.pow(productTwo, 0.5);

	System.out.println("The Area is: " + area);

	}

}