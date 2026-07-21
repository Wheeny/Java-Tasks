import java.util.Scanner;
    public class divisionFile{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    System.out.println(divide(number));
    
    
    }
    
    public static double divide(int number){
        double quotient = number / 2;
        return quotient;
        
    }
    
    
    }
