import java.util.Scanner;
    public class Difference{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int firstNumber = scanner.nextInt();
    
    System.out.print("Enter a number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println(subtract(firstNumber, secondNumber));
    
 
    }
    
    public static int subtract(int firstNumber, int secondNumber){
        int difference = firstNumber - secondNumber ;
        return difference;
        
    }
    
    
    }
