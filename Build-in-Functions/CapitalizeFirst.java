
import java.util.Scanner;

// 16. Capitalize First Letter
// Capitalize the first letter of every word in a sentence.
// Input: hello from the other side
// Output: Hello From The Other Side

public class CapitalizeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String str = sc.nextLine();
        String[] strarr = str.split(" ");
        StringBuilder myarr = new StringBuilder();
        for(String word : strarr){
            if(!word.isEmpty()){
                String caps = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
                // myarr.append(Character.toUpperCase(word.charAt(0)));
                myarr.append(caps);
            }
        }
        System.out.println(myarr.toString().trim());
    }
    
}
