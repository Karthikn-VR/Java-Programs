
import java.util.Scanner;



public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int og = num;
        int sum = 0;
        while(num > 0){
            int n = num % 10;
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            sum += fact;
            num = num / 10;
        }
        System.out.println("Initial value " + og + " Final Value " + sum );
        if(sum == og){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }

    }
    
}

