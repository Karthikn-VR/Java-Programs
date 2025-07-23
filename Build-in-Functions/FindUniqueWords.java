
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 7. Find Unique Words
// Given a paragraph, list all unique words (ignore case, punctuation).
// Input: Hello world! Hello Java.
// Output: [hello, world, java]

public class FindUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Set<String> myset = new HashSet<>();
        myset.addAll(Arrays.asList(arr));
        System.out.println("Unique Words: "+ " " + myset.toString());
    }
    
}
