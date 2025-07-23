
import java.util.*;

// 17. Character Frequency
// Count how many times each character occurs in a string.
// Input: banana
// Output: b:1 a:3 n:2
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chararr = str.toCharArray();
        Set<String> myset = new HashSet<>();
        for(int i = 0; i < chararr.length; i++){
            int count = 0;
            for(int j = 1; j < chararr.length; j++){
                if(chararr[i] == chararr[j]){
                    count++;
                }
            }
            myset.add(chararr[i] + " " + count);
        }
        System.out.println(myset);
    }
    
}
