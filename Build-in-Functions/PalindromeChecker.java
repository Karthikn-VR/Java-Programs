
import java.util.Scanner;

// 10. Palindrome Checker
// Check if the given sentence is a palindrome ignoring spaces and cases.
// Input: A man a plan a canal Panama
// Output: Palindrome

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newstr = str.replace(" ", "").toLowerCase();
        StringBuilder arr = new StringBuilder(newstr).reverse();
        if(newstr.equals(arr.toString())){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
