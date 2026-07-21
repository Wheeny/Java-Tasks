import java.util.Scanner;
public class Absolute{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to get the absolute: ");
        int number = input.nextInt();        
                
        System.out.println(absolute(number));
    }


    public static int absolute(int number){

        if (number < 0){
            return number * -1; 
        }
        return number;
    }


}
