
import java.util.Scanner;

//  Odd and Even Digit Counter
// Count number of odd and even digits in a number.
// Input: 123456
// Output: Even: 3, Odd: 3
public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        String arr = String.valueOf(number);
        for(int i = 0; i < arr.length(); i++){
            int num = arr.charAt(i) - '0';
            if(num % 2 == 0){
                  evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.printf("Odd Numbers Count: %d Even Numbers Count : %d",oddCount,evenCount);
       
    }
}
