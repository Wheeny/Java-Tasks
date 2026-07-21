import java.util.Scanner;
    public class LargerNumber{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(large(firstNumber, secondNumber));
    
 
    }
    
    public static int large(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
        return firstNumber;
        }
        else{
        
        return secondNumber;
        }
        
    }
    
    
    }
