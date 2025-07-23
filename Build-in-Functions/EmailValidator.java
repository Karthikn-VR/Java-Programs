
import java.util.Scanner;

// 12. Email Validator
// Check if an email contains @ and ends with .com or .org.
// Input: test@example.com
// Output: Valid Email

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email");
        String str = sc.next();
        String[] strarr = str.split("//.");
        String last = strarr[strarr.length - 1];
        if(str.contains("@")){
        if(last.contains("com") || last.contains("in")){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
        }
        else{
            System.out.println("Invalid Email");
        }
       
    }
    
}
