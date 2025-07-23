
import java.util.Scanner;

// 13. Prime Number Identifier
// Check whether the given number is prime.
// Input: 29
// Output: Prime

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 2; i < num / 2; i++){
            if(num % i == 0){
               flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
    
}
