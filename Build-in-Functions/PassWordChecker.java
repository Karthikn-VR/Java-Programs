
import java.util.Scanner;

// Password Strength Checker
// Check if password contains at least one uppercase, one lowercase, one digit, and one symbol.
// Input: Welcome@123
// Output: Strong Password

public class PassWordChecker {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String pass = sc.next();
        sc.close();
        boolean flag = false;
        if(pass.length() > 8){
            if(pass.matches(".*[^a-zA-Z0-9].*")){
                if(pass.contains("@")){
                    flag = true;
                }
                
            }
        }
        else{
            flag = false;
        }
        if(flag){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
       
    }
    
}
