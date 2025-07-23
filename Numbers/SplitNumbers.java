
import java.util.ArrayList;
import java.util.Scanner;

public class SplitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> mylist = new ArrayList<>();
        while (num % 2 == 0){
             mylist.add(2);
             num /= 2;
        }
        while (num % 3 == 0){
             mylist.add(3);
             num /= 3;
        }
        System.out.println(mylist);
    }
    
}
