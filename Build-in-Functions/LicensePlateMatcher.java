
import java.util.Scanner;

// License Plate Matcher
// Check if a car license plate (string) contains only uppercase letters and digits.
// Input: TN59AZ1234
// Output: Valid

public class LicensePlateMatcher {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter License Plate Number");
        String str = sc.nextLine();
        int count = 0;
        sc.close();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch) || Character.isUpperCase(ch)){
                count += 1;
            }
            else{
                flag = false;
                break;
            }

    }
    if(flag && count <= 6){
        System.out.println("Valid");
    }
    else{
        System.out.println("Invalid");
    }

}
}
