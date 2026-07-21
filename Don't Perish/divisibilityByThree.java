import java.util.Scanner;
    public class divisibilityByThree{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    System.out.println(divisibility(number));
    
    
    }
    
    public static boolean divisibility(int number){
        if(number % 3 == 0){
        
         return true;
         }
        
        else{
        
         return false;
         
         }
        
        }
       
        
    }
    
    
    
