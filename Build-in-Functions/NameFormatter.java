import java.util.Scanner;

// Name Initials Formatter
// Convert full name to initials followed by last name.
// Input: John Ronald Reuel Tolkien
// Output: J.R.R. Tolkien

public class NameFormatter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Full Name: ");
    String str = sc.nextLine();
    String[] words = str.split(" ");
    StringBuilder initials = new StringBuilder();
    for(int i = 0; i < words.length - 1; i++){
        initials.append(Character.toUpperCase(words[i].charAt(0))).append('.');
    }
    initials.append(words[words.length - 1]);
    System.out.println(initials.toString());
    } 
      
}
