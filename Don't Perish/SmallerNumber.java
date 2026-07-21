import java.util.Scanner;
    public class SmallerNumber{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(small(firstNumber, secondNumber));
    
 
    }
    
    public static int small(int firstNumber, int secondNumber){
        if(firstNumber < secondNumber){
        return firstNumber;
        }
        else{
        
        return secondNumber;
        }
        
    }
    
    
    }
