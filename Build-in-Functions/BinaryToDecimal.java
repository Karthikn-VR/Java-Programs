
import java.util.Scanner;

// 9. Binary to Decimal Converter
// Convert a binary string to its decimal equivalent.
// Input: 1101
// Output: 13
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary: ");
        Long number = sc.nextLong();
        int decimal = Integer.parseInt(String.valueOf(number) , 2);
        System.out.println("Decimal: "+decimal);
    }
    
}
