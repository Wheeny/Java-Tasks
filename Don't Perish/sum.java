import java.util.Scanner;
    public class sum{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(add(firstNumber, secondNumber));
    
 
    }
    
    public static int add(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber ;
        return sum;
        
    }
    
    
    }
