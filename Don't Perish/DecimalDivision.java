import java.util.Scanner;
    public class DecimalDivision{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    double firstNumber = scanner.nextDouble();
    
    System.out.print("Enter a number: ");
    double secondNumber = scanner.nextDouble();
    
    System.out.println(divide(firstNumber, secondNumber));
    
 
    }
    
    public static double divide(double firstNumber, double secondNumber){
        double division = firstNumber/secondNumber ;
        return division;
        
    }
    
    
    }
