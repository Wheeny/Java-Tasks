import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        
        int smallest, secondSmallest;
        if (number1 < number2) { 
            smallest = number1;
            secondSmallest = number2;
        } else {
            smallest = number2;
            secondSmallest = number1;
        }
        
        for (int index = 3; index <= 10; index++) {
            System.out.print("Enter number " + index + ": ");
            int current = scanner.nextInt();
            
            if (current < smallest) {
                secondSmallest = smallest;
                smallest = current;      
            } else if (current < secondSmallest) {
                secondSmallest = current;
            }
        }
        
        System.out.println("The second smallest number is: " + secondSmallest);
 System.out.println("The smallest number is: " + smallest);
        
    }
}