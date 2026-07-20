import java.util.Scanner;

public class QuestionSix{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        
        int total = number1 + number2;
        
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
            int current = input.nextInt();
            
            if (current > largest) {
                secondLargest = largest;
                largest = current;      
            } else if (current > secondLargest) {
                secondLargest = current;
            }
        }
        
        double average = total / 10.0;
        
        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
        System.out.println("Average of All Numbers: " + average);
        
    }
}