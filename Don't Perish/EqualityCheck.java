import java.util.Scanner;
    public class EqualityCheck{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(remainder(firstNumber, secondNumber));
    
 
    }
    
    public static boolean remainder(int firstNumber, int secondNumber){
        if(firstNumber == secondNumber){
        return true;}
        else{
        return false;
        }    
            
        
    }
    
    
    }
