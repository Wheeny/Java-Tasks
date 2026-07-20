import java.util.Scanner;
public class GeometryTwo{
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

	double DistanceX = Math.pow((x2-x1), 2);
	double DistanceY = Math.pow((y2-y1), 2);
	double AddedDistance = DistanceX + DistanceY;
	double Distance = Math.pow(AddedDistance, 0.5);

	System.out.println("The distance between them is: " + Distance);

	}

}