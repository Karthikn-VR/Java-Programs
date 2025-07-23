
import java.util.*;

public class UniqueCharactersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        String[] array = new String[size];
        Set<Character> myset = new HashSet<>();
        for(int i = 0; i < size; i++){
            System.out.println("Enter Word: ");
            array[i] = sc.next();
        }
        for(char c : array[0].toCharArray()){
            myset.add(c);
        }
        
        for(int i = 1; i < size; i++){
            Set<Character> newset = new HashSet<>();
            for(char ch : array[i].toCharArray()){
             newset.add(ch);
            }
            myset.retainAll(newset);
           
        }
        
        System.out.println("Common Words: "+myset);
    }
}
