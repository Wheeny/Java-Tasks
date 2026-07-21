import java.util.Scanner;
    public class DecimalDivision{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(remainder(firstNumber, secondNumber));
    
 
    }
    
    public static int remainder(int firstNumber, int secondNumber){
        int remainderResult = firstNumber%secondNumber ;
        return remainderResult;
        
    }
    
    
    }
