
import java.util.*;

// 11. Word Frequency Counter
// Count frequency of each word in a sentence.
// Input: apple banana apple orange banana apple
// Output: apple:3 banana:2 orange:1


public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        Set<String> myset = new HashSet<>();
        for(int i=0; i < size; i++){
            arr[i] = sc.next().toLowerCase();
        }
        
        for(int i = 0; i < size; i++){ 
            int count = 0;
            for(int j = 0; j<size; j++){
                if(!arr[i].equals(arr[j])) {
                } else {
                    count++;
                 }
                                
        }
        myset.add(arr[i] + " " + count);
        
    }
    System.out.println(myset);
    
}
}
