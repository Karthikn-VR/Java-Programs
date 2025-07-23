
import java.util.Scanner;

public class MiddleNumberEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int middle = (num / 10) % 10;
        System.out.println("Middle Digit " + middle);
        if(middle % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        
    }
    
}
