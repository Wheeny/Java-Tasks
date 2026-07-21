import java.util.Scanner;
    public class celsiusToFarenheit{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    double number = scanner.nextDouble();
    
    System.out.println(conversion(number));
    
    
    }
    
    public static double conversion(double number){
        double conversionResult = (number * 1.8) + 32;
        
         return conversionResult;
         
         }
        
        }
       
        
    
    
    
    
