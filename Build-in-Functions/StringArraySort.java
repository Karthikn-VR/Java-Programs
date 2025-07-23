
import java.util.Arrays;
import java.util.Scanner;

// Sorter
// Given a list of strings sort them alphabetically ignoring case.
// Input: ["Zebra", "apple", "Orange"]
// Output: [apple, Orange, Zebra]

public class StringArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();
        System.out.println("Enter Elements: ");
        String[] arr = new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
    
}
