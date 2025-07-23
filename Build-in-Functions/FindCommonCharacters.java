// 14. Find Common Characters
// Given strings, print characters common to both in same position.
// Input: hello, world
// Output: lo

import java.util.Scanner;

public class FindCommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words: ");
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        StringBuilder newArr = new StringBuilder();

        int minval = strArr[0].length();
        for(String word: strArr){
            if(word.length() < minval){
                minval = word.length();
            }
        }
        for(int i = 0; i < minval ; i++){
            char ch = strArr[0].charAt(i);
            boolean allmatch = true;
            for(int j = 1; j < strArr.length; j++){
                if(strArr[j].charAt(i) != ch){
                    allmatch = false;
                    break;
                }
            }
            if(allmatch){
                newArr.append(ch);
            }
        }
        System.out.println(newArr.toString());
    }
    
}
