import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        
        int largest, secondLargest;
        if (number1 > number2) {
            largest = number1;
            secondLargest = number2;
        } else {
            largest = number2;
            secondLargest = number1;
        }
        
        
        for (int index = 3; index <= 10; index++) {
            System.out.print("Enter number " + index + ": ");
            int current = scanner.nextInt();
            
            
            if (current > largest) {
                secondLargest = largest;
                largest = current;      
            } else if (current > secondLargest) {
                secondLargest = current;
            }
        }
        
        System.out.println("The second largest number is: " + secondLargest);
        System.out.println("The largest number is: " + largest);
        
    }
}