
import java.util.Scanner;

// 20. Reverse Words
// Reverse the order of words in a sentence.
// Input: Java is fun
// Output: fun is Java
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = str.split(" ");
        StringBuilder myarr = new StringBuilder();
        for(int i = strarr.length - 1 ; i >= 0 ; i--){
            myarr.append(strarr[i]).append(" ");
        }
        System.out.println(myarr);
    }
    
}
