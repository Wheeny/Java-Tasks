import java.util.Scanner;
    public class add10{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    System.out.println(add(number));
    
    
    }
    
    public static int add(int number){
        int sum = number + 10;
        return sum;
        
    }
    
    
    }
