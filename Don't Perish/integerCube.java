import java.util.Scanner;
    public class integerCube{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    System.out.println(cube(number));
    
    
    }
    
    public static int cube(int number){
        int cubeResult = number * number * number;
        return cubeResult;
        
    }
    
    
    }
